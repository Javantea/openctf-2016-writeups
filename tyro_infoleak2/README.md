# tyro_infoleak2 (50 points)
*Solution by [Neg9] Javantea*

Files:
* [tyro_infoleak2_3a3b043ca422415917e99afdc20618e5](https://github.com/Javantea/openctf-2016-writeups/blob/master/tyro_infoleak2/tyro_infoleak2_3a3b043ca422415917e99afdc20618e5)
* [tyro_infoleak2.jav](https://github.com/Javantea/openctf-2016-writeups/blob/master/tyro_infoleak2/tyro_infoleak2.jav)
* [infoleak2_solution.txt](https://github.com/Javantea/openctf-2016-writeups/blob/master/tyro_infoleak2/infoleak2_solution.txt)
	
Tyro Infoleak 2 is a slightly modified version of [Tyro Infoleak 1](https://github.com/Javantea/openctf-2016-writeups/tree/master/tyro_infoleak1).

In this challenge, you can only make relative reads, but it's much easier than the first if you already solved the first. Read offset 0, read offset 4, read the information we want.

0 is the esp (the stack)  
4 is the address of the info we want  
To make an absolute read from a relative read, subtract the relative address.
```
relative offset = hex(0x100000000+info_we_want-esp)
```

Increment by 4 until you get nil.

Solution:  
second_tyro_info_leak_MADEYOUDOSOMEMATH_heh
