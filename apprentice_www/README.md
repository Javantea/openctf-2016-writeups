# Apprentice_www (300 points)
*Solution by [Neg9] Javantea*

Files:
* apprentice_www1.py
* apprentice_www2.txt

Apprentice_www is a exploitable challenge with a simple premise.

You get to overwrite one byte. That's not enough for code execution in a normal system. But the mprotects make the whole text segment writable and executable. That's good enough get a loop around the function that overwrites bytes. Then you can overwrite the text segment with your shellcode in a special way, then your shellcode executes. Instead of writing a python script that connects and sends the integers, I chose to print the integers and paste them into netcat.
Then

```
cat /home/challenge/flag
```
	
Solution:  
one_drop_andAllOFTHESUDDEN
