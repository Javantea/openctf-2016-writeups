# Apprentice_www (300 points)
*Solution by [Neg9] Javantea*

Files:
* [apprentice_www1.py](https://github.com/Javantea/openctf-2016-writeups/tree/master/apprentice_www/apprentice_www1.py)
* [apprentice_www2.txt](https://github.com/Javantea/openctf-2016-writeups/tree/master/apprentice_www/apprentice_www2.txt)

Apprentice_www is a exploitable challenge with a simple premise.

You get to overwrite one byte. That's not enough for code execution in a normal system. But the mprotects make the whole text segment writable and executable. That's good enough get a loop around the function that overwrites bytes. Then you can overwrite the text segment with your shellcode in a special way, then your shellcode executes. Instead of writing a python script that connects and sends the integers, I chose to print the integers and paste them into netcat.
Then `cat /home/challenge/flag`

One interesting thing that I had to overcome was the loop jump. If you overwrite the lower byte of the loop jump with your shellcode, you will jump somewhere other than the top of the loop and it'll be crash city. So instead of doing that use the fact that it's a conditional jump to have it execute your shellcode. Which value does your input have to be to get it to branch the other direction? 0. So that's why there's a 

```python
# Junk
print(0x80489db)
print(0)
```

at the bottom of my script. Yup.

Solution:  
one_drop_andAllOFTHESUDDEN
