# CGC neophyte (300 points)
*Solution by [Neg9] Javantea*

Files:
* sublea1.txt
* neophyte1.py
* neophyte1.bin
* neophyte1.jav
* neophyte2.bin
* neophyte2.jav
* gg3.txt

Neophyte was one of the more difficult challenges at OpenCTF that I solved. I spent 1 hour getting the first exploit to work, just a simple buffer overflow. I spent 4 or so hours getting the exploit that worked on the first binary reliable for approximately 1 in 150 binaries. The solution reads the value subtracted from EBP at address 8048546 to decide how large the buffer should be to overflow. I copied the shellcode from a teammate's solution. Then the solution reads varcmp, the byte that is compared to a changing value in the binaries. The exploit is not reliable because we don't know the address of the stack. Therefore we guess and it will crash 99.3% of the time. 0.7% of the time, it will hit the nopsled and execute our shellcode. Then you can cat /home/challenge/flag and you are done.

```
python3 neophyte1.py >gg3.txt
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
