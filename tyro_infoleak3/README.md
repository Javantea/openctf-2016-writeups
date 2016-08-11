# tyro_infoleak3 (50 points)
*Solution by [Neg9] Javantea*

Files:
* [tyro_infoleak3_b2d435964aac6bc1098ce62d35cba9af](https://github.com/Javantea/openctf-2016-writeups/blob/master/tyro_infoleak3/tyro_infoleak3_b2d435964aac6bc1098ce62d35cba9af)
* [tyro_infoleak3.jav](https://github.com/Javantea/openctf-2016-writeups/blob/master/tyro_infoleak3/tyro_infoleak3.jav)
* [infoleak3.py](https://github.com/Javantea/openctf-2016-writeups/blob/master/tyro_infoleak3/infoleak3.py)
* [solution1.txt](https://github.com/Javantea/openctf-2016-writeups/blob/master/tyro_infoleak3/solution1.txt)

Tyro Infoleak 3 is a slightly modified version of [Tyro Infoleak 1](https://github.com/Javantea/openctf-2016-writeups/tree/master/tyro_infoleak1) and [2](https://github.com/Javantea/openctf-2016-writeups/tree/master/tyro_infoleak2).

This challenge can't be done by hand like the previous two because it requires math and has a very strict time limit. I spent a lot of time making a fast and reliable solution to reading 4 bytes. You can see it in [the Python code](https://github.com/Javantea/openctf-2016-writeups/blob/master/tyro_infoleak3/infoleak3.py).

You need to read the same things you do in the other two, but spread it across multiple connections. Remember that there's no penalty to solving a problem over 5000 connections instead of 1.

A minor mistake I have left in the code for historical purposes is the function defined inside the for loop. Never define functions inside a for loop, it's really bad design.

Solution:  
even_a_tiny_relative_leak_will_pwn_things
