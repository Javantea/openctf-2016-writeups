get_pc_thunk_bx: 0x7d0
.init:
:
     688: PUSH EBX
     689: SUB ESP, 0x8 ; ESP -= 0x8; 
     68c: CALL 7d0 <__x86.get_pc_thunk.bx> ; EBX = 0x691
     691: ADD EBX, 0x196f ; EBX += 0x196f;  ; EBX = 0x2000
     697: MOV EAX, [EBX-0x10] ; EAX = [EBX-0x10]; 
     69d: TEST EAX, EAX ;
     69f: JZ 0x6a6 ; if(EAX) {
     6a1: CALL 730 <__gmon_start__>
; }
     6a6: ADD ESP, 0x8 ; ESP += 0x8; 
     6a9: POP EBX ; POP EBX
     6aa: RET
.plt:
:
     6b0: PUSH DWORD [EBX+0x4]
     6b6: JMP DWORD [EBX+0x8] ; goto 
     6bc: ADD [EAX], AL ; [EAX] += AL; 
     6be: ADD [EAX], AL ; [EAX] += AL; 
setbuf:
     6c0: JMP DWORD [EBX+0xc] ; goto 
     6c6: PUSH DWORD 0x0
     6cb: JMP 0x6b0 ; goto 
read:
     6d0: JMP DWORD [EBX+0x10] ; goto 
     6d6: PUSH DWORD 0x8 ; '\x08'
     6db: JMP 0x6b0 ; goto 
printf:
     6e0: JMP DWORD [EBX+0x14] ; goto 
     6e6: PUSH DWORD 0x10 ; '\x10'
     6eb: JMP 0x6b0 ; goto 
alarm:
     6f0: JMP DWORD [EBX+0x18] ; goto 
     6f6: PUSH DWORD 0x18 ; '\x18'
     6fb: JMP 0x6b0 ; goto 
__cxa_finalize:
     700: JMP DWORD [EBX+0x1c] ; goto 
     706: PUSH DWORD 0x20 ; ' '
     70b: JMP 0x6b0 ; goto 
malloc:
     710: JMP DWORD [EBX+0x20] ; goto 
     716: PUSH DWORD 0x28 ; '('
     71b: JMP 0x6b0 ; goto 
puts:
     720: JMP DWORD [EBX+0x24] ; goto 
     726: PUSH DWORD 0x30 ; '0'
     72b: JMP 0x6b0 ; goto 
__gmon_start__:
     730: JMP DWORD [EBX+0x28] ; goto 
     736: PUSH DWORD 0x38 ; '8'
     73b: JMP 0x6b0 ; goto 
exit:
     740: JMP DWORD [EBX+0x2c] ; goto 
     746: PUSH DWORD 0x40 ; '@'
     74b: JMP 0x6b0 ; goto 
open:
     750: JMP DWORD [EBX+0x30] ; goto 
     756: PUSH DWORD 0x48 ; 'H'
     75b: JMP 0x6b0 ; goto 
__libc_start_main:
     760: JMP DWORD [EBX+0x34] ; goto 
     766: PUSH DWORD 0x50 ; 'P'
     76b: JMP 0x6b0 ; goto 
__isoc99_scanf:
     770: JMP DWORD [EBX+0x38] ; goto 
     776: PUSH DWORD 0x58 ; 'X'
     77b: JMP 0x6b0 ; goto 
close:
     780: JMP DWORD [EBX+0x3c] ; goto 
     786: PUSH DWORD 0x60 ; '`'
     78b: JMP 0x6b0 ; goto 
.text:
:
     790: XOR EBP, EBP ; EBP = 0
     792: POP ESI ; POP ESI
     793: MOV ECX, ESP ; ECX = ESP; 
     795: AND ESP, -0x10 ; ESP &= -0x10; 
     798: PUSH EAX
     799: PUSH ESP
     79a: PUSH EDX
     79b: CALL 7c2 <sub_7c2>
     7a0: ADD EBX, 0x1860 ; EBX += 0x1860;  ; EBX = 0x1860
     7a6: LEA EAX, [EBX-0x1530]  ; 0x330 '\x0b'
     7ac: PUSH EAX
     7ad: LEA EAX, [EBX-0x15a0]  ; 0x2c0 'E'
     7b3: PUSH EAX
     7b4: PUSH ECX
     7b5: PUSH ESI
     7b6: PUSH DWORD [EBX-0xc]
     7bc: CALL 760 <__libc_start_main>
     7c1: HLT ; 
sub_7c2:
     7c2: MOV EBX, [ESP] ; EBX = [ESP]; 
     7c5: RET
     7c6: NOP
     7c8: NOP
     7ca: NOP
     7cc: NOP
     7ce: NOP
__x86.get_pc_thunk.bx:
     7d0: MOV EBX, [ESP] ; EBX = [ESP]; 
     7d3: RET
     7d4: NOP
     7d6: NOP
     7d8: NOP
     7da: NOP
     7dc: NOP
     7de: NOP
deregister_tm_clones:
     7e0: PUSH EBP
     7e1: MOV EBP, ESP ; EBP = ESP; 
     7e3: PUSH EBX
     7e4: CALL 7d0 <__x86.get_pc_thunk.bx> ; EBX = 0x7e9
     7e9: ADD EBX, 0x1817 ; EBX += 0x1817;  ; EBX = 0x2000
     7ef: SUB ESP, 0x14 ; ESP -= 0x14; 
     7f2: LEA EAX, [EBX+0x4b]  ; 0x204b ':'
     7f8: LEA EDX, [EBX+0x48]  ; 0x2048 'GCC:'
     7fe: SUB EAX, EDX ; EAX -= EDX; 
     800: CMP EAX, 0x6 ;
     803: JA 0x80b ; if(EAX <= 0x6) {
     805: ADD ESP, 0x14 ; ESP += 0x14; 
     808: POP EBX ; POP EBX
     809: POP EBP ; POP EBP
     80a: RET
; }
     80b: MOV EAX, [EBX-0x18] ; EAX = [EBX-0x18]; 
     811: TEST EAX, EAX ;
     813: JZ 0x805 ; } while(!EAX)
     815: MOV [ESP], EDX ; [ESP] = EDX; 
     818: CALL EAX ; *EAX(RDI)
     81a: JMP 0x805 ; goto 
     81c: LEA ESI, [ESI+0x0]
register_tm_clones:
     820: PUSH EBP
     821: MOV EBP, ESP ; EBP = ESP; 
     823: PUSH EBX
     824: CALL 7d0 <__x86.get_pc_thunk.bx> ; EBX = 0x829
     829: ADD EBX, 0x17d7 ; EBX += 0x17d7;  ; EBX = 0x2000
     82f: SUB ESP, 0x14 ; ESP -= 0x14; 
     832: LEA EAX, [EBX+0x48]  ; 0x2048 'GCC:'
     838: LEA EDX, [EBX+0x48]  ; 0x2048 'GCC:'
     83e: SUB EAX, EDX ; EAX -= EDX; 
     840: SAR EAX, 0x2 ; EAX >>= 0x2; 
     843: MOV ECX, EAX ; ECX = EAX; 
     845: SHR ECX, 0x1f ; ECX >>= 0x1f; 
     848: ADD EAX, ECX ; EAX += ECX; 
     84a: SAR EAX, 0x1 ; EAX >>= 0x1; 
     84c: JNZ 0x854
     84e: ADD ESP, 0x14 ; ESP += 0x14; 
     851: POP EBX ; POP EBX
     852: POP EBP ; POP EBP
     853: RET
; }
     854: MOV ECX, [EBX-0x4] ; ECX = [EBX-0x4]; 
     85a: TEST ECX, ECX ;
     85c: JZ 0x84e ; } while(!ECX)
     85e: MOV [ESP+0x4], EAX ; [ESP+0x4] = EAX; 
     862: MOV [ESP], EDX ; [ESP] = EDX; 
     865: CALL ECX ; *ECX(RDI)
     867: JMP 0x84e ; goto 
     869: LEA ESI, [ESI+0x0]
__do_global_dtors_aux:
     870: PUSH EBP
     871: MOV EBP, ESP ; EBP = ESP; 
     873: PUSH EBX
     874: CALL 7d0 <__x86.get_pc_thunk.bx> ; EBX = 0x879
     879: ADD EBX, 0x1787 ; EBX += 0x1787;  ; EBX = 0x2000
     87f: SUB ESP, 0x14 ; ESP -= 0x14; 
     882: CMP BYTE [EBX+0x48], 0x0 ;
     889: JNZ 0x8af ; if(BYTE [EBX+0x48] == 0x0) {
     88b: MOV EAX, [EBX-0x14] ; EAX = [EBX-0x14]; 
     891: TEST EAX, EAX ;
     893: JZ 0x8a3 ; if(EAX) {
     895: MOV EAX, [EBX+0x44] ; EAX = [EBX+0x44]; 
     89b: MOV [ESP], EAX ; [ESP] = EAX; 
     89e: CALL 700 <__cxa_finalize>
; }
     8a3: CALL 7e0 <deregister_tm_clones>
     8a8: MOV BYTE [EBX+0x48], 0x1 ; '\x01'
; }
     8af: ADD ESP, 0x14 ; ESP += 0x14; 
     8b2: POP EBX ; POP EBX
     8b3: POP EBP ; POP EBP
     8b4: RET
     8b5: LEA ESI, [ESI+0x0]
     8b9: LEA EDI, [EDI+0x0]
frame_dummy:
     8c0: PUSH EBP
     8c1: MOV EBP, ESP ; EBP = ESP; 
     8c3: PUSH EBX
     8c4: CALL 7d0 <__x86.get_pc_thunk.bx> ; EBX = 0x8c9
     8c9: ADD EBX, 0x1737 ; EBX += 0x1737;  ; EBX = 0x2000
     8cf: SUB ESP, 0x14 ; ESP -= 0x14; 
     8d2: MOV EAX, [EBX-0x10c] ; EAX = [EBX-0x10c]; 
     8d8: TEST EAX, EAX ;
     8da: JZ 0x8f1 ; if(EAX) {
     8dc: MOV EAX, [EBX-0x8] ; EAX = [EBX-0x8]; 
     8e2: TEST EAX, EAX ;
     8e4: JZ 0x8f1 ; if(EAX) {
     8e6: LEA EDX, [EBX-0x10c]  ; 0x1ef4 ''
     8ec: MOV [ESP], EDX ; [ESP] = EDX; 
     8ef: CALL EAX ; *EAX(RDI)
; }
     8f1: ADD ESP, 0x14 ; ESP += 0x14; 
     8f4: POP EBX ; POP EBX
     8f5: POP EBP ; POP EBP
     8f6: JMP 0x820 ; goto 
main:
     8fb: PUSH EBP
     8fc: MOV EBP, ESP ; EBP = ESP; 
     8fe: AND ESP, -0x10 ; ESP &= -0x10; 
     901: SUB ESP, 0x30 ; ESP -= 0x30; 
     904: MOV DWORD [ESP], 0x100 ; 'mment'
     90b: CALL 90c <sub_90c>
     910: MOV [ESP+0x24], EAX ; [ESP+0x24] = EAX; 
     914: MOV DWORD [ESP], 0x1e ; '\x1e'
     91b: CALL 91c <sub_91c>
     920: MOV EAX, [0x0] ; EAX = [0x0]; 
     925: MOV DWORD [ESP+0x4], 0x0 ; 
     92d: MOV [ESP], EAX ; [ESP] = EAX; 
     930: CALL 931 <sub_931>
     935: MOV EAX, [0x0] ; EAX = [0x0]; 
     93a: MOV DWORD [ESP+0x4], 0x0 ; 
     942: MOV [ESP], EAX ; [ESP] = EAX; 
     945: CALL 946 <sub_946>
     94a: MOV DWORD [ESP+0x4], 0x0 ; 
     952: MOV DWORD [ESP], 0xaf0 ; '/home/challenge/flag'
     959: CALL 95a <sub_95a>
     95e: MOV [ESP+0x28], EAX ; [ESP+0x28] = EAX; 
     962: CMP DWORD [ESP+0x28], -0x1 ;
     967: JNZ 0x981 ; if(DWORD [ESP+0x28] == -0x1) {
     969: MOV DWORD [ESP], 0xb05 ; "Can't open flag"
     970: CALL 971 <sub_971>
     975: MOV DWORD [ESP], 0x0 ; 
     97c: CALL 97d <sub_97d>
; }
     981: MOV DWORD [ESP+0x8], 0x100 ; 'mment'
     989: MOV EAX, [ESP+0x24] ; EAX = [ESP+0x24]; 
     98d: MOV [ESP+0x4], EAX ; [ESP+0x4] = EAX; 
     991: MOV EAX, [ESP+0x28] ; EAX = [ESP+0x28]; 
     995: MOV [ESP], EAX ; [ESP] = EAX; 
     998: CALL 999 <sub_999>
     99d: MOV EAX, [ESP+0x28] ; EAX = [ESP+0x28]; 
     9a1: MOV [ESP], EAX ; [ESP] = EAX; 
     9a4: CALL 9a5 <sub_9a5>
     9a9: MOV DWORD [ESP], 0xb15 ; 'OpenCTF tyro info leak 3\n'
     9b0: CALL 9b1 <sub_9b1>
     9b5: MOV DWORD [ESP], 0xb2f ; 'ASLR is on, the binary is PIE'
     9bc: CALL 9bd <sub_9bd>
     9c1: MOV DWORD [ESP], 0xb4d ; 'Can you read the flag?'
     9c8: CALL 9c9 <sub_9c9>
     9cd: MOV DWORD [ESP], 0xb64 ; 'RELATIVE READS ONLY HERE'
     9d4: CALL 9d5 <sub_9d5>
     9d9: MOV DWORD [ESP], 0xb80 ; 'You get only 16 reads, AND, you only get one byte per read'
     9e0: CALL 9e1 <sub_9e1>
     9e5: MOV DWORD [ESP+0x20], 0x10 ; '\x10'
     9ed: JMP 0xa45 ; goto 
     9ef: SUB DWORD [ESP+0x20], 0x1 ; 
     9f4: MOV DWORD [ESP], 0xbbb ; 'Offset: '
     9fb: CALL 9fc <sub_9fc>
     a00: LEA EAX, [ESP+0x1c]
     a04: MOV [ESP+0x4], EAX ; [ESP+0x4] = EAX; 
     a08: MOV DWORD [ESP], 0xbc4 ; '%x'
     a0f: CALL a10 <sub_a10>
     a14: LEA EDX, [ESP+0x1c]
     a18: MOV EAX, [ESP+0x1c] ; EAX = [ESP+0x1c]; 
     a1c: ADD EAX, EDX ; EAX += EDX; 
     a1e: MOV [ESP+0x1c], EAX ; [ESP+0x1c] = EAX; 
     a22: MOV EAX, [ESP+0x1c] ; EAX = [ESP+0x1c]; 
     a26: MOV EAX, [EAX] ; EAX = [EAX]; 
     a28: AND EAX, 0xff ; EAX &= 0xff; 
     a2d: MOV [ESP+0x2c], EAX ; [ESP+0x2c] = EAX; 
     a31: MOV EAX, [ESP+0x2c] ; EAX = [ESP+0x2c]; 
     a35: MOV [ESP+0x4], EAX ; [ESP+0x4] = EAX; 
     a39: MOV DWORD [ESP], 0xbc7 ; '0x%x\n'
     a40: CALL a41 <sub_a41>
     a45: CMP DWORD [ESP+0x20], 0x0 ;
     a4a: JNZ 0x9ef ; } while(DWORD [ESP+0x20] != 0x0)
     a4c: MOV EAX, 0x0 ; EAX = 0x0; 
     a51: LEAVE ; leave
     a52: RET ; return 0x0;
     a53: NOP
     a55: NOP
     a57: NOP
     a59: NOP
     a5b: NOP
     a5d: NOP
     a5f: NOP
__libc_csu_init:
     a60: PUSH EBP
     a61: PUSH EDI
     a62: XOR EDI, EDI ; EDI = 0
     a64: PUSH ESI
     a65: PUSH EBX
     a66: CALL 7d0 <__x86.get_pc_thunk.bx> ; EBX = 0xa6b
     a6b: ADD EBX, 0x1595 ; EBX += 0x1595;  ; EBX = 0x2000
     a71: SUB ESP, 0x1c ; ESP -= 0x1c; 
     a74: MOV EBP, [ESP+0x30] ; EBP = [ESP+0x30]; 
     a78: LEA ESI, [EBX-0x110]  ; 0x1ef0 'p\x08'
     a7e: CALL 688 <sub_688>
     a83: LEA EAX, [EBX-0x114]  ; 0x1eec '\xc0\x08'
     a89: SUB ESI, EAX ; ESI -= EAX; 
     a8b: SAR ESI, 0x2 ; ESI >>= 0x2; 
     a8e: TEST ESI, ESI ;
     a90: JZ 0xab9 ; if(ESI) {
     a92: LEA ESI, [ESI+0x0]
     a98: MOV EAX, [ESP+0x38] ; EAX = [ESP+0x38]; 
     a9c: MOV [ESP], EBP ; [ESP] = EBP; 
     a9f: MOV [ESP+0x8], EAX ; [ESP+0x8] = EAX; 
     aa3: MOV EAX, [ESP+0x34] ; EAX = [ESP+0x34]; 
     aa7: MOV [ESP+0x4], EAX ; [ESP+0x4] = EAX; 
     aab: CALL DWORD [EBX+EDI*4-0x114] ; [EBX+EDI*4-0x114](RDI)
     ab2: ADD EDI, 0x1 ; EDI += 0x1; 
     ab5: CMP EDI, ESI ;
     ab7: JNZ 0xa98 ; } while(EDI != ESI)
; }
     ab9: ADD ESP, 0x1c ; ESP += 0x1c; 
     abc: POP EBX ; POP EBX
     abd: POP ESI ; POP ESI
     abe: POP EDI ; POP EDI
     abf: POP EBP ; POP EBP
     ac0: RET
     ac1: JMP 0xad0 ; goto 
     ac3: NOP
     ac4: NOP
     ac5: NOP
     ac6: NOP
     ac7: NOP
     ac8: NOP
     ac9: NOP
     aca: NOP
     acb: NOP
     acc: NOP
     acd: NOP
     ace: NOP
     acf: NOP
__libc_csu_fini:
     ad0: RET
.fini:
:
     ad4: PUSH EBX
     ad5: SUB ESP, 0x8 ; ESP -= 0x8; 
     ad8: CALL 7d0 <__x86.get_pc_thunk.bx> ; EBX = 0xadd
     add: ADD EBX, 0x1523 ; EBX += 0x1523;  ; EBX = 0x2000
     ae3: ADD ESP, 0x8 ; ESP += 0x8; 
     ae6: POP EBX ; POP EBX
     ae7: RET
