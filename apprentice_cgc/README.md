# CGC apprentice (300 points)
*Solution by [Neg9] Javantea*

Files:
* [apprentice1a.txt](https://github.com/Javantea/openctf-2016-writeups/tree/master/apprentice_cgc/apprentice1a.txt)
* [apprentice1.py](https://github.com/Javantea/openctf-2016-writeups/tree/master/apprentice_cgc/apprentice1.py)
* [appr1x.jav](https://github.com/Javantea/openctf-2016-writeups/tree/master/apprentice_cgc/appr1x.jav)
* [appr1x.bin](https://github.com/Javantea/openctf-2016-writeups/tree/master/apprentice_cgc/appr1x.bin)
* [appr2x.jav](https://github.com/Javantea/openctf-2016-writeups/tree/master/apprentice_cgc/appr2x.jav)
* [appr2x.bin](https://github.com/Javantea/openctf-2016-writeups/tree/master/apprentice_cgc/appr2x.bin)
* [appr12x.jav.diff](https://github.com/Javantea/openctf-2016-writeups/tree/master/apprentice_cgc/appr12x.jav.diff)

CGC Apprentice was a more difficult version of [CGC neophyte](https://github.com/Javantea/openctf-2016-writeups/tree/master/neophyte_cgc). It was statically compiled which means you don't know what the functions do statically unless you invest time. I figured them out dynamically -- I used gdb breaking and stepping when necessary. Strace also helped a bit. In order to exploit, you need to send a value that is equal to a value that is found at a static offset in the binary. It replies with the stack address which solves the reliability problem in neophyte. Then you have to send a second value along with your payload separated by a space. How were you supposed to know that the second value and the payload needed to be delimited by a space instead of a colon, slash, comma, or some other delimiter? Guess and check. It can't read anything after you send the second newline, so there aren't very many choices. If they decided it should be the first two paragraphs of Harry Potter and the Deathly Hallows, I'd be impressed.

```asm
; The first compared value:
 8048982: LEA EAX, [EBX-0x2ea8c]  ; 0x80bb574 'cgnmtfuneawehcocfziftajjqungzqnb'
```

```asm
; The second compared value:
 80489c1: LEA EAX, [EBX-0x2ea68]  ; 0x80bb598 'ytbqpcvjsiiepwjxfanehxrlhiwbacfg'
```

In case you're curious how I figured out things, look at [apprentice1a.txt](https://github.com/Javantea/openctf-2016-writeups/tree/master/apprentice_cgc/apprentice1a.txt). I hope that it's insightful. Also, look at the solution to [CGC neophyte](https://github.com/Javantea/openctf-2016-writeups/tree/master/neophyte_cgc) if you haven't already.

Solution:  
itoldyou__IT_WOULD_GET_W0rse_imnotangrybro
