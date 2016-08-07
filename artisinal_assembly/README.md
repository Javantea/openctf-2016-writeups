# Artisinal Assembly (50 points)
*Solution by [Neg9] Javantea*

Files:
* artisinal_assembly_0331fb4526b5ffee34f6ab66899bac0b
* artisinal_assembly.jav
* artisinal_assembly.dis

Artisinal Assembly pretends to be a devilishly difficult reverse engineering challenge. With some crypto and steganography, this challenge could take the best hackers hours to solve. But it only took three hackers an hour or two to solve.

This problem is solvable if you look at the output of objdump -d and think outside the box. In this hacking challenge, outside the box means streams in vertical. There's no canonical vertical in assembly, but there are a few tools that are very common. I didn't think of this until reversing every line of the assembly and understand that it could only ever have one output. Two of my teammates reversed this challenge completely and didn't come to the same conclusion after a half hour.

```
0000000000400506 <main>:
  400506:	55                   	push   %rbp
  400507:	48 89 e5             	mov    %rsp,%rbp
  40050a:	b8 00 00 00 00       	mov    $0x0,%eax
  40050f:	e8 63 01 00 00       	callq  400677 <initialize_dx>
  400514:	b8 00 00 00 00       	mov    $0x0,%eax
  400519:	e8 61 01 00 00       	callq  40067f <import_input>
  40051e:	b8 00 00 00 00       	mov    $0x0,%eax
  400523:	e8 6c 01 00 00       	callq  400694 <a_good_start>
  400528:	b8 00 00 00 00       	mov    $0x0,%eax
  40052d:	e8 31 01 00 00       	callq  400663 <word_realignment>
  400532:	b8 00 00 00 00       	mov    $0x0,%eax
  400537:	e8 71 00 00 00       	callq  4005ad <source_cx>
  40053c:	b8 00 00 00 00       	mov    $0x0,%eax
  400541:	e8 5f 01 00 00       	callq  4006a5 <todo_unit_tests>
  400546:	b8 00 00 00 00       	mov    $0x0,%eax
  40054b:	e8 4d 01 00 00       	callq  40069d <largerify>
  400550:	b8 00 00 00 00       	mov    $0x0,%eax
  400555:	e8 33 01 00 00       	callq  40068d <timing_offset>
  40055a:	b8 00 00 00 00       	mov    $0x0,%eax
  40055f:	e8 5f 00 00 00       	callq  4005c3 <finalize_xc>
  400564:	b8 00 00 00 00       	mov    $0x0,%eax
  400569:	e8 4d 00 00 00       	callq  4005bb <almost_there>
  40056e:	b8 00 00 00 00       	mov    $0x0,%eax
  400573:	e8 61 00 00 00       	callq  4005d9 <todo_reexamine>
  400578:	b8 00 00 00 00       	mov    $0x0,%eax
  40057d:	e8 79 00 00 00       	callq  4005fb <reticulate_splines>
  400582:	b8 00 00 00 00       	mov    $0x0,%eax
  400587:	e8 42 00 00 00       	callq  4005ce <timing_loop>
  40058c:	b8 00 00 00 00       	mov    $0x0,%eax
  400591:	e8 65 00 00 00       	callq  4005fb <reticulate_splines>
  400596:	b8 00 00 00 00       	mov    $0x0,%eax
  40059b:	e8 3f 00 00 00       	callq  4005df <export_results>
  4005a0:	5d                   	pop    %rbp
  4005a1:	c3                   	retq   
```

```python
import binascii
binascii.unhexlify('8963616c31715f4d335f4d617942653f')
b'\x89cal1q_M3_MayBe?'
```

Solution:  
cal1q_M3_MayBe?
