# CGC neophyte (300 points)
*Solution by [Neg9] Javantea*

Files:
* [sublea1.txt](https://github.com/Javantea/openctf-2016-writeups/tree/master/neophyte_cgc/sublea1.txt)
* [neophyte1.py](https://github.com/Javantea/openctf-2016-writeups/tree/master/neophyte_cgc/neophyte1.py)
* [neophyte1.bin](https://github.com/Javantea/openctf-2016-writeups/tree/master/neophyte_cgc/neophyte1.bin)
* [neophyte1.jav](https://github.com/Javantea/openctf-2016-writeups/tree/master/neophyte_cgc/neophyte1.jav)
* [neophyte2.bin](https://github.com/Javantea/openctf-2016-writeups/tree/master/neophyte_cgc/neophyte2.bin)
* [neophyte2.jav](https://github.com/Javantea/openctf-2016-writeups/tree/master/neophyte_cgc/neophyte2.jav)
* [gg3.txt](https://github.com/Javantea/openctf-2016-writeups/tree/master/neophyte_cgc/gg3.txt)

Neophyte was one of the more difficult challenges at OpenCTF that I solved. I spent 1 hour getting the first exploit to work, just a simple buffer overflow. I spent 4 or so hours getting the exploit that worked on the first binary reliable for approximately 1 in 150 binaries. The solution reads the value subtracted from EBP at address 8048546 to decide how large the buffer should be to overflow. I copied the shellcode from a teammate's solution. Then the solution reads varcmp, the byte that is compared to a changing value in the binaries. The exploit is not reliable because we don't know the address of the stack. Therefore we guess and it will crash 99.3% of the time. 0.7% of the time, it will hit the nopsled and execute our shellcode. Then you can cat /home/challenge/flag and you are done.

## Details

### Exploiting a buffer overflow

If you're at the point where you're having trouble exploiting this buffer overflow, you should not be so worried. You're exploiting the stack which is variable size and the stack is randomized. If the stack is enormous, you can fill it with nops and jump to where you think it might be. Stack overflows should usually be exploited in the following manner:

nopsled + shellcode + padding + address

How do we know the right amount of nopsled and padding for the address to be in the right place? The buffer size is known to you, so you can get your address executed every time. To do this dynamically, Create a pattern to crash your program. Then you can use the pattern to determine how long your buffer should be. If you don't have a pattern generator, use AAAA...BBBB. Increase the number of A's but keep just 4 B's, this makes it so you know when EIP is 0x42424242, you have the right position.

On the topic of padding, generally you want as little padding as possible, but that depends on how much data is trashed in the stack. If only 15 bytes get trashed at the end of the stack, your padding should be 15 bytes long. In this case I wasn't interested in finding out how many bytes were getting trashed on the stack, so I gave 50 bytes to padding and it worked.

### Figuring out how big the buffer size is given two binaries

In neophyte you can find out the correct buffer size with one binary if you understand buffer overflows properly. But let's assume that you don't (like I didn't when I exploited this challenge) for the purpose of explanation. First you use the technique in the previous section to find out the correct length of the buffer. It doesn't matter where you measure it from, so long as you're consistent. Then you look at the values in the binary. 

```diff
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
```

There are two values that could possibly be the buffer size. One is sub esp at 8048532 and the other is sub lea at 8048546. Create the table below (the original of which I made during the competition you can find in [sublea1.txt](https://github.com/Javantea/openctf-2016-writeups/tree/master/neophyte_cgc/sublea1.txt)).

| binary    | correct |       | subesp | lea    |
| --------- | -------:|------:|-------:|-------:|
| neophyte1 | 15798   |0x3db6 | 0x3db8 | 0x3dac |
| neophyte2 | 3758    |0xeae  | 0xea8  | 0xea4  |

Now we do a tiny bit of algebra. The correct value - subesp is (0x3db6-0x3db8) and (0xeae-0xea8). The correct value minus sublea is (0x3db6-0x3dac) and (0xeae-0xea4). Which of the two values is consistent? sublea+4 is correct. subesp is not.

### Waiting

Some hackers aren't patient enough to exploit some vulnerabilities. That's all right because you don't need to exploit every vulnerability. Some vulnerabilities you *want* to see patched before you have a chance to exploit it. The last step in exploiting this vulnerability is have patience and let the for loop finish the job.

```bash
for i in $(seq 1 200); do echo 'new'; python3 neophyte1.py; done >gg3.txt
grep -A2 success gg3.txt |sort |uniq -c
    180 --
      4 *** Connection closed by remote host ***
      1 DontGetAngr_y___IT_WILL_GET_WORSE
    175 new
    181 resp success b'\n'
    181 shell:
```

Solution:  
DontGetAngr_y___IT_WILL_GET_WORSE
