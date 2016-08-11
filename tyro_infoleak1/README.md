# tyro_infoleak1 (50 points)
*Solution by [Neg9] Javantea*

Files:
* [tyro_infoleak1_bdc3f08dab986b30317b0937a096d794](https://github.com/Javantea/openctf-2016-writeups/blob/master/tyro_infoleak1/tyro_infoleak1_bdc3f08dab986b30317b0937a096d794)
* [tyro_infoleak1.jav](https://github.com/Javantea/openctf-2016-writeups/blob/master/tyro_infoleak1/tyro_infoleak1.jav)
* [solution.txt](https://github.com/Javantea/openctf-2016-writeups/blob/master/tyro_infoleak1/solution.txt)

This challenge is a basic information leak vulnerability. You can read data at relative offsets or absolute offsets.

The address of the data you want is at relative 4. Your relative reads are relative to the stack (esp). Easy. It took me an hour to figure this out because I was still getting warmed up.
Read the absolute address and decode the hex.
	
Solution:  
yaya_tyro's_first_information_leak
