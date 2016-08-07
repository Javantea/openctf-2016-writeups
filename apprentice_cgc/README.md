# CGC apprentice (300 points)
*Solution by [Neg9] Javantea*

Files:
* apprentice1a.txt
* apprentice1.py
* appr1x.jav
* appr1x.bin
* appr2x.jav
* appr2x.bin
* appr12x.jav.diff

Apprentice was a more difficult version of neophyte. It was statically compiled which means you don't know what the functions do statically unless you invest time. I figured them out dynamically -- I used gdb breaking and stepping when necessary. In order to exploit, you need to send a value that is equal to a value that is found at a static offset in the binary. It replies with the stack address which solves the reliability problem in neophyte. Then you have to send a second value along with your payload separated by a space. How were you supposed to know that the second value and the payload needed to be delimited by a space instead of a colon, slash, comma, or some other delimiter? Guess and check. It can't read anything after you send the second newline, so there aren't very many choices.

Solution:  
itoldyou__IT_WOULD_GET_W0rse_imnotangrybro
