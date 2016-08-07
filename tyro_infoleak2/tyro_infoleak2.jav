get_pc_thunk_bx: 0x7c0
.init:
:
     678: PUSH EBX
     679: SUB ESP, 0x8 ; ESP -= 0x8; 
     67c: CALL 7c0 <__x86.get_pc_thunk.bx> ; EBX = 0x681
     681: ADD EBX, 0x197f ; EBX += 0x197f;  ; EBX = 0x2000
     687: MOV EAX, [EBX-0x10] ; EAX = [EBX-0x10]; 
     68d: TEST EAX, EAX ;
     68f: JZ 0x696 ; if(EAX) {
     691: CALL 720 <__gmon_start__>
; }
     696: ADD ESP, 0x8 ; ESP += 0x8; 
     699: POP EBX ; POP EBX
     69a: RET
.plt:
:
     6a0: PUSH DWORD [EBX+0x4]
     6a6: JMP DWORD [EBX+0x8] ; goto 
     6ac: ADD [EAX], AL ; [EAX] += AL; 
     6ae: ADD [EAX], AL ; [EAX] += AL; 
setbuf:
     6b0: JMP DWORD [EBX+0xc] ; goto 
     6b6: PUSH DWORD 0x0
     6bb: JMP 0x6a0 ; goto 
read:
     6c0: JMP DWORD [EBX+0x10] ; goto 
     6c6: PUSH DWORD 0x8 ; '\x08'
     6cb: JMP 0x6a0 ; goto 
printf:
     6d0: JMP DWORD [EBX+0x14] ; goto 
     6d6: PUSH DWORD 0x10 ; '\x10'
     6db: JMP 0x6a0 ; goto 
alarm:
     6e0: JMP DWORD [EBX+0x18] ; goto 
     6e6: PUSH DWORD 0x18 ; '\x18'
     6eb: JMP 0x6a0 ; goto 
__cxa_finalize:
     6f0: JMP DWORD [EBX+0x1c] ; goto 
     6f6: PUSH DWORD 0x20 ; ' '
     6fb: JMP 0x6a0 ; goto 
malloc:
     700: JMP DWORD [EBX+0x20] ; goto 
     706: PUSH DWORD 0x28 ; '('
     70b: JMP 0x6a0 ; goto 
puts:
     710: JMP DWORD [EBX+0x24] ; goto 
     716: PUSH DWORD 0x30 ; '0'
     71b: JMP 0x6a0 ; goto 
__gmon_start__:
     720: JMP DWORD [EBX+0x28] ; goto 
     726: PUSH DWORD 0x38 ; '8'
     72b: JMP 0x6a0 ; goto 
exit:
     730: JMP DWORD [EBX+0x2c] ; goto 
     736: PUSH DWORD 0x40 ; '@'
     73b: JMP 0x6a0 ; goto 
open:
     740: JMP DWORD [EBX+0x30] ; goto 
     746: PUSH DWORD 0x48 ; 'H'
     74b: JMP 0x6a0 ; goto 
__libc_start_main:
     750: JMP DWORD [EBX+0x34] ; goto 
     756: PUSH DWORD 0x50 ; 'P'
     75b: JMP 0x6a0 ; goto 
__isoc99_scanf:
     760: JMP DWORD [EBX+0x38] ; goto 
     766: PUSH DWORD 0x58 ; 'X'
     76b: JMP 0x6a0 ; goto 
close:
     770: JMP DWORD [EBX+0x3c] ; goto 
     776: PUSH DWORD 0x60 ; '`'
     77b: JMP 0x6a0 ; goto 
.text:
:
     780: XOR EBP, EBP ; EBP = 0
     782: POP ESI ; POP ESI
     783: MOV ECX, ESP ; ECX = ESP; 
     785: AND ESP, -0x10 ; ESP &= -0x10; 
     788: PUSH EAX
     789: PUSH ESP
     78a: PUSH EDX
     78b: CALL 7b2 <sub_7b2>
     790: ADD EBX, 0x1870 ; EBX += 0x1870;  ; EBX = 0x1870
     796: LEA EAX, [EBX-0x1580]  ; 0x2f0 '\xe3'
     79c: PUSH EAX
     79d: LEA EAX, [EBX-0x15f0]  ; 0x280 '\x1a'
     7a3: PUSH EAX
     7a4: PUSH ECX
     7a5: PUSH ESI
     7a6: PUSH DWORD [EBX-0xc]
     7ac: CALL 750 <__libc_start_main>
     7b1: HLT ; 
sub_7b2:
     7b2: MOV EBX, [ESP] ; EBX = [ESP]; 
     7b5: RET
     7b6: NOP
     7b8: NOP
     7ba: NOP
     7bc: NOP
     7be: NOP
__x86.get_pc_thunk.bx:
     7c0: MOV EBX, [ESP] ; EBX = [ESP]; 
     7c3: RET
     7c4: NOP
     7c6: NOP
     7c8: NOP
     7ca: NOP
     7cc: NOP
     7ce: NOP
deregister_tm_clones:
     7d0: PUSH EBP
     7d1: MOV EBP, ESP ; EBP = ESP; 
     7d3: PUSH EBX
     7d4: CALL 7c0 <__x86.get_pc_thunk.bx> ; EBX = 0x7d9
     7d9: ADD EBX, 0x1827 ; EBX += 0x1827;  ; EBX = 0x2000
     7df: SUB ESP, 0x14 ; ESP -= 0x14; 
     7e2: LEA EAX, [EBX+0x4b]  ; 0x204b ':'
     7e8: LEA EDX, [EBX+0x48]  ; 0x2048 'GCC:'
     7ee: SUB EAX, EDX ; EAX -= EDX; 
     7f0: CMP EAX, 0x6 ;
     7f3: JA 0x7fb ; if(EAX <= 0x6) {
     7f5: ADD ESP, 0x14 ; ESP += 0x14; 
     7f8: POP EBX ; POP EBX
     7f9: POP EBP ; POP EBP
     7fa: RET
; }
     7fb: MOV EAX, [EBX-0x18] ; EAX = [EBX-0x18]; 
     801: TEST EAX, EAX ;
     803: JZ 0x7f5 ; } while(!EAX)
     805: MOV [ESP], EDX ; [ESP] = EDX; 
     808: CALL EAX ; *EAX(RDI)
     80a: JMP 0x7f5 ; goto 
     80c: LEA ESI, [ESI+0x0]
register_tm_clones:
     810: PUSH EBP
     811: MOV EBP, ESP ; EBP = ESP; 
     813: PUSH EBX
     814: CALL 7c0 <__x86.get_pc_thunk.bx> ; EBX = 0x819
     819: ADD EBX, 0x17e7 ; EBX += 0x17e7;  ; EBX = 0x2000
     81f: SUB ESP, 0x14 ; ESP -= 0x14; 
     822: LEA EAX, [EBX+0x48]  ; 0x2048 'GCC:'
     828: LEA EDX, [EBX+0x48]  ; 0x2048 'GCC:'
     82e: SUB EAX, EDX ; EAX -= EDX; 
     830: SAR EAX, 0x2 ; EAX >>= 0x2; 
     833: MOV ECX, EAX ; ECX = EAX; 
     835: SHR ECX, 0x1f ; ECX >>= 0x1f; 
     838: ADD EAX, ECX ; EAX += ECX; 
     83a: SAR EAX, 0x1 ; EAX >>= 0x1; 
     83c: JNZ 0x844
     83e: ADD ESP, 0x14 ; ESP += 0x14; 
     841: POP EBX ; POP EBX
     842: POP EBP ; POP EBP
     843: RET
; }
     844: MOV ECX, [EBX-0x4] ; ECX = [EBX-0x4]; 
     84a: TEST ECX, ECX ;
     84c: JZ 0x83e ; } while(!ECX)
     84e: MOV [ESP+0x4], EAX ; [ESP+0x4] = EAX; 
     852: MOV [ESP], EDX ; [ESP] = EDX; 
     855: CALL ECX ; *ECX(RDI)
     857: JMP 0x83e ; goto 
     859: LEA ESI, [ESI+0x0]
__do_global_dtors_aux:
     860: PUSH EBP
     861: MOV EBP, ESP ; EBP = ESP; 
     863: PUSH EBX
     864: CALL 7c0 <__x86.get_pc_thunk.bx> ; EBX = 0x869
     869: ADD EBX, 0x1797 ; EBX += 0x1797;  ; EBX = 0x2000
     86f: SUB ESP, 0x14 ; ESP -= 0x14; 
     872: CMP BYTE [EBX+0x48], 0x0 ;
     879: JNZ 0x89f ; if(BYTE [EBX+0x48] == 0x0) {
     87b: MOV EAX, [EBX-0x14] ; EAX = [EBX-0x14]; 
     881: TEST EAX, EAX ;
     883: JZ 0x893 ; if(EAX) {
     885: MOV EAX, [EBX+0x44] ; EAX = [EBX+0x44]; 
     88b: MOV [ESP], EAX ; [ESP] = EAX; 
     88e: CALL 6f0 <__cxa_finalize>
; }
     893: CALL 7d0 <deregister_tm_clones>
     898: MOV BYTE [EBX+0x48], 0x1 ; '\x01'
; }
     89f: ADD ESP, 0x14 ; ESP += 0x14; 
     8a2: POP EBX ; POP EBX
     8a3: POP EBP ; POP EBP
     8a4: RET
     8a5: LEA ESI, [ESI+0x0]
     8a9: LEA EDI, [EDI+0x0]
frame_dummy:
     8b0: PUSH EBP
     8b1: MOV EBP, ESP ; EBP = ESP; 
     8b3: PUSH EBX
     8b4: CALL 7c0 <__x86.get_pc_thunk.bx> ; EBX = 0x8b9
     8b9: ADD EBX, 0x1747 ; EBX += 0x1747;  ; EBX = 0x2000
     8bf: SUB ESP, 0x14 ; ESP -= 0x14; 
     8c2: MOV EAX, [EBX-0x10c] ; EAX = [EBX-0x10c]; 
     8c8: TEST EAX, EAX ;
     8ca: JZ 0x8e1 ; if(EAX) {
     8cc: MOV EAX, [EBX-0x8] ; EAX = [EBX-0x8]; 
     8d2: TEST EAX, EAX ;
     8d4: JZ 0x8e1 ; if(EAX) {
     8d6: LEA EDX, [EBX-0x10c]  ; 0x1ef4 ''
     8dc: MOV [ESP], EDX ; [ESP] = EDX; 
     8df: CALL EAX ; *EAX(RDI)
; }
     8e1: ADD ESP, 0x14 ; ESP += 0x14; 
     8e4: POP EBX ; POP EBX
     8e5: POP EBP ; POP EBP
     8e6: JMP 0x810 ; goto 
main:
     8eb: PUSH EBP
     8ec: MOV EBP, ESP ; EBP = ESP; 
     8ee: AND ESP, -0x10 ; ESP &= -0x10; 
     8f1: SUB ESP, 0x20 ; ESP -= 0x20; 
     8f4: MOV DWORD [ESP], 0x100 ; 'mment'
     8fb: CALL 8fc <sub_8fc>
     900: MOV [ESP+0x18], EAX ; [ESP+0x18] = EAX; 
     904: MOV DWORD [ESP], 0x1e ; '\x1e'
     90b: CALL 90c <sub_90c>
     910: MOV EAX, [0x0] ; EAX = [0x0]; 
     915: MOV DWORD [ESP+0x4], 0x0 ; 
     91d: MOV [ESP], EAX ; [ESP] = EAX; 
     920: CALL 921 <sub_921>
     925: MOV EAX, [0x0] ; EAX = [0x0]; 
     92a: MOV DWORD [ESP+0x4], 0x0 ; 
     932: MOV [ESP], EAX ; [ESP] = EAX; 
     935: CALL 936 <sub_936>
     93a: MOV DWORD [ESP+0x4], 0x0 ; 
     942: MOV DWORD [ESP], 0xaa0 ; '/home/challenge/flag'
     949: CALL 94a <sub_94a>
     94e: MOV [ESP+0x1c], EAX ; [ESP+0x1c] = EAX; 
     952: CMP DWORD [ESP+0x1c], -0x1 ;
     957: JNZ 0x971 ; if(DWORD [ESP+0x1c] == -0x1) {
     959: MOV DWORD [ESP], 0xab5 ; "Can't open flag"
     960: CALL 961 <sub_961>
     965: MOV DWORD [ESP], 0x0 ; 
     96c: CALL 96d <sub_96d>
; }
     971: MOV DWORD [ESP+0x8], 0x100 ; 'mment'
     979: MOV EAX, [ESP+0x18] ; EAX = [ESP+0x18]; 
     97d: MOV [ESP+0x4], EAX ; [ESP+0x4] = EAX; 
     981: MOV EAX, [ESP+0x1c] ; EAX = [ESP+0x1c]; 
     985: MOV [ESP], EAX ; [ESP] = EAX; 
     988: CALL 989 <sub_989>
     98d: MOV EAX, [ESP+0x1c] ; EAX = [ESP+0x1c]; 
     991: MOV [ESP], EAX ; [ESP] = EAX; 
     994: CALL 995 <sub_995>
     999: MOV DWORD [ESP], 0xac5 ; 'OpenCTF tyro info leak 2\n'
     9a0: CALL 9a1 <sub_9a1>
     9a5: MOV DWORD [ESP], 0xadf ; 'ASLR is on, the binary is PIE'
     9ac: CALL 9ad <sub_9ad>
     9b1: MOV DWORD [ESP], 0xafd ; 'Can you read the flag?'
     9b8: CALL 9b9 <sub_9b9>
     9bd: MOV DWORD [ESP], 0xb14 ; 'RELATIVE READS ONLY HERE'
     9c4: CALL 9c5 <sub_9c5>
     9c9: MOV DWORD [ESP], 0xb2d ; 'Offset: '
     9d0: CALL 9d1 <sub_9d1>
     9d5: LEA EAX, [ESP+0x14]
     9d9: MOV [ESP+0x4], EAX ; [ESP+0x4] = EAX; 
     9dd: MOV DWORD [ESP], 0xb36 ; '%x'
     9e4: CALL 9e5 <sub_9e5>
     9e9: LEA EDX, [ESP+0x14]
     9ed: MOV EAX, [ESP+0x14] ; EAX = [ESP+0x14]; 
     9f1: ADD EAX, EDX ; EAX += EDX; 
     9f3: MOV [ESP+0x14], EAX ; [ESP+0x14] = EAX; 
     9f7: MOV EAX, [ESP+0x14] ; EAX = [ESP+0x14]; 
     9fb: MOV EAX, [EAX] ; EAX = [EAX]; 
     9fd: MOV [ESP+0x4], EAX ; [ESP+0x4] = EAX; 
     a01: MOV DWORD [ESP], 0xb39 ; '%p\n'
     a08: CALL a09 <sub_a09>
     a0d: JMP 0x9c9 ; goto 
     a0f: NOP
__libc_csu_init:
     a10: PUSH EBP
     a11: PUSH EDI
     a12: XOR EDI, EDI ; EDI = 0
     a14: PUSH ESI
     a15: PUSH EBX
     a16: CALL 7c0 <__x86.get_pc_thunk.bx> ; EBX = 0xa1b
     a1b: ADD EBX, 0x15e5 ; EBX += 0x15e5;  ; EBX = 0x2000
     a21: SUB ESP, 0x1c ; ESP -= 0x1c; 
     a24: MOV EBP, [ESP+0x30] ; EBP = [ESP+0x30]; 
     a28: LEA ESI, [EBX-0x110]  ; 0x1ef0 '`\x08'
     a2e: CALL 678 <sub_678>
     a33: LEA EAX, [EBX-0x114]  ; 0x1eec '\xb0\x08'
     a39: SUB ESI, EAX ; ESI -= EAX; 
     a3b: SAR ESI, 0x2 ; ESI >>= 0x2; 
     a3e: TEST ESI, ESI ;
     a40: JZ 0xa69 ; if(ESI) {
     a42: LEA ESI, [ESI+0x0]
     a48: MOV EAX, [ESP+0x38] ; EAX = [ESP+0x38]; 
     a4c: MOV [ESP], EBP ; [ESP] = EBP; 
     a4f: MOV [ESP+0x8], EAX ; [ESP+0x8] = EAX; 
     a53: MOV EAX, [ESP+0x34] ; EAX = [ESP+0x34]; 
     a57: MOV [ESP+0x4], EAX ; [ESP+0x4] = EAX; 
     a5b: CALL DWORD [EBX+EDI*4-0x114] ; [EBX+EDI*4-0x114](RDI)
     a62: ADD EDI, 0x1 ; EDI += 0x1; 
     a65: CMP EDI, ESI ;
     a67: JNZ 0xa48 ; } while(EDI != ESI)
; }
     a69: ADD ESP, 0x1c ; ESP += 0x1c; 
     a6c: POP EBX ; POP EBX
     a6d: POP ESI ; POP ESI
     a6e: POP EDI ; POP EDI
     a6f: POP EBP ; POP EBP
     a70: RET
     a71: JMP 0xa80 ; goto 
     a73: NOP
     a74: NOP
     a75: NOP
     a76: NOP
     a77: NOP
     a78: NOP
     a79: NOP
     a7a: NOP
     a7b: NOP
     a7c: NOP
     a7d: NOP
     a7e: NOP
     a7f: NOP
__libc_csu_fini:
     a80: RET
.fini:
:
     a84: PUSH EBX
     a85: SUB ESP, 0x8 ; ESP -= 0x8; 
     a88: CALL 7c0 <__x86.get_pc_thunk.bx> ; EBX = 0xa8d
     a8d: ADD EBX, 0x1573 ; EBX += 0x1573;  ; EBX = 0x2000
     a93: ADD ESP, 0x8 ; ESP += 0x8; 
     a96: POP EBX ; POP EBX
     a97: RET
