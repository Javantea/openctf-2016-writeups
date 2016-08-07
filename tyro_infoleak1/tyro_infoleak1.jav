get_pc_thunk_bx: 0x820
.init:
:
     6d0: PUSH EBX
     6d1: SUB ESP, 0x8
     6d4: CALL 820 <__x86.get_pc_thunk.bx> ; EBX = 0x6d9
     6d9: ADD EBX, 0x1927
     6df: MOV EAX, [EBX-0x10]
     6e5: TEST EAX, EAX ;
     6e7: JZ 0x6ee ; if(EAX) {
     6e9: CALL 780 <__gmon_start__>
; }
     6ee: ADD ESP, 0x8
     6f1: POP EBX
     6f2: RET
.plt:
:
     700: PUSH DWORD [EBX+0x4]
     706: JMP DWORD [EBX+0x8]
     70c: ADD [EAX], AL
     70e: ADD [EAX], AL
setbuf:
     710: JMP DWORD [EBX+0xc]
     716: PUSH DWORD 0x0
     71b: JMP 0x700
read:
     720: JMP DWORD [EBX+0x10]
     726: PUSH DWORD 0x8 ; '\x08'
     72b: JMP 0x700
printf:
     730: JMP DWORD [EBX+0x14]
     736: PUSH DWORD 0x10 ; '\x10'
     73b: JMP 0x700
alarm:
     740: JMP DWORD [EBX+0x18]
     746: PUSH DWORD 0x18 ; '\x18'
     74b: JMP 0x700
__cxa_finalize:
     750: JMP DWORD [EBX+0x1c]
     756: PUSH DWORD 0x20 ; ' '
     75b: JMP 0x700
malloc:
     760: JMP DWORD [EBX+0x20]
     766: PUSH DWORD 0x28 ; '('
     76b: JMP 0x700
puts:
     770: JMP DWORD [EBX+0x24]
     776: PUSH DWORD 0x30 ; '0'
     77b: JMP 0x700
__gmon_start__:
     780: JMP DWORD [EBX+0x28]
     786: PUSH DWORD 0x38 ; '8'
     78b: JMP 0x700
exit:
     790: JMP DWORD [EBX+0x2c]
     796: PUSH DWORD 0x40 ; '@'
     79b: JMP 0x700
open:
     7a0: JMP DWORD [EBX+0x30]
     7a6: PUSH DWORD 0x48 ; 'H'
     7ab: JMP 0x700
__libc_start_main:
     7b0: JMP DWORD [EBX+0x34]
     7b6: PUSH DWORD 0x50 ; 'P'
     7bb: JMP 0x700
__isoc99_scanf:
     7c0: JMP DWORD [EBX+0x38]
     7c6: PUSH DWORD 0x58 ; 'X'
     7cb: JMP 0x700
close:
     7d0: JMP DWORD [EBX+0x3c]
     7d6: PUSH DWORD 0x60 ; '`'
     7db: JMP 0x700
.text:
:
     7e0: XOR EBP, EBP
     7e2: POP ESI
     7e3: MOV ECX, ESP
     7e5: AND ESP, -0x10
     7e8: PUSH EAX
     7e9: PUSH ESP
     7ea: PUSH EDX
     7eb: CALL 812 <sub_812>
     7f0: ADD EBX, 0x1810
     7f6: LEA EAX, [EBX-0x14a0]  ; 0x370 'tdin_used'
     7fc: PUSH EAX
     7fd: LEA EAX, [EBX-0x1510]  ; 0x300 'Y'
     803: PUSH EAX
     804: PUSH ECX
     805: PUSH ESI
     806: PUSH DWORD [EBX-0xc]
     80c: CALL 7b0 <__libc_start_main>
     811: HLT
sub_812:
     812: MOV EBX, [ESP]
     815: RET
     816: NOP
     818: NOP
     81a: NOP
     81c: NOP
     81e: NOP
__x86.get_pc_thunk.bx:
     820: MOV EBX, [ESP]
     823: RET
     824: NOP
     826: NOP
     828: NOP
     82a: NOP
     82c: NOP
     82e: NOP
deregister_tm_clones:
     830: PUSH EBP
     831: MOV EBP, ESP
     833: PUSH EBX
     834: CALL 820 <__x86.get_pc_thunk.bx> ; EBX = 0x839
     839: ADD EBX, 0x17c7
     83f: SUB ESP, 0x14
     842: LEA EAX, [EBX+0x4b]  ; 0x204b ':'
     848: LEA EDX, [EBX+0x48]  ; 0x2048 'GCC:'
     84e: SUB EAX, EDX
     850: CMP EAX, 0x6 ;
     853: JA 0x85b ; if(EAX <= 0x6) {
     855: ADD ESP, 0x14
     858: POP EBX
     859: POP EBP
     85a: RET
; }
     85b: MOV EAX, [EBX-0x18]
     861: TEST EAX, EAX ;
     863: JZ 0x855 ; } while(!EAX)
     865: MOV [ESP], EDX
     868: CALL EAX
     86a: JMP 0x855
     86c: LEA ESI, [ESI+0x0]
register_tm_clones:
     870: PUSH EBP
     871: MOV EBP, ESP
     873: PUSH EBX
     874: CALL 820 <__x86.get_pc_thunk.bx> ; EBX = 0x879
     879: ADD EBX, 0x1787
     87f: SUB ESP, 0x14
     882: LEA EAX, [EBX+0x48]  ; 0x2048 'GCC:'
     888: LEA EDX, [EBX+0x48]  ; 0x2048 'GCC:'
     88e: SUB EAX, EDX
     890: SAR EAX, 0x2
     893: MOV ECX, EAX
     895: SHR ECX, 0x1f
     898: ADD EAX, ECX
     89a: SAR EAX, 0x1
     89c: JNZ 0x8a4
     89e: ADD ESP, 0x14
     8a1: POP EBX
     8a2: POP EBP
     8a3: RET
; }
     8a4: MOV ECX, [EBX-0x4]
     8aa: TEST ECX, ECX ;
     8ac: JZ 0x89e ; } while(!ECX)
     8ae: MOV [ESP+0x4], EAX
     8b2: MOV [ESP], EDX
     8b5: CALL ECX
     8b7: JMP 0x89e
     8b9: LEA ESI, [ESI+0x0]
__do_global_dtors_aux:
     8c0: PUSH EBP
     8c1: MOV EBP, ESP
     8c3: PUSH EBX
     8c4: CALL 820 <__x86.get_pc_thunk.bx> ; EBX = 0x8c9
     8c9: ADD EBX, 0x1737
     8cf: SUB ESP, 0x14
     8d2: CMP BYTE [EBX+0x48], 0x0 ;
     8d9: JNZ 0x8ff ; if(BYTE [EBX+0x48] == 0x0) {
     8db: MOV EAX, [EBX-0x14]
     8e1: TEST EAX, EAX ;
     8e3: JZ 0x8f3 ; if(EAX) {
     8e5: MOV EAX, [EBX+0x44]
     8eb: MOV [ESP], EAX
     8ee: CALL 750 <__cxa_finalize>
; }
     8f3: CALL 830 <deregister_tm_clones>
     8f8: MOV BYTE [EBX+0x48], 0x1 ; '\x01'
; }
     8ff: ADD ESP, 0x14
     902: POP EBX
     903: POP EBP
     904: RET
     905: LEA ESI, [ESI+0x0]
     909: LEA EDI, [EDI+0x0]
frame_dummy:
     910: PUSH EBP
     911: MOV EBP, ESP
     913: PUSH EBX
     914: CALL 820 <__x86.get_pc_thunk.bx> ; EBX = 0x919
     919: ADD EBX, 0x16e7
     91f: SUB ESP, 0x14
     922: MOV EAX, [EBX-0x10c]
     928: TEST EAX, EAX ;
     92a: JZ 0x941 ; if(EAX) {
     92c: MOV EAX, [EBX-0x8]
     932: TEST EAX, EAX ;
     934: JZ 0x941 ; if(EAX) {
     936: LEA EDX, [EBX-0x10c]  ; 0x1ef4 ''
     93c: MOV [ESP], EDX
     93f: CALL EAX
; }
     941: ADD ESP, 0x14
     944: POP EBX
     945: POP EBP
     946: JMP 0x870
main:
     94b: PUSH EBP
     94c: MOV EBP, ESP
     94e: AND ESP, -0x10
     951: SUB ESP, 0x20
     954: MOV DWORD [ESP], 0x100 ; 'mment'
     95b: CALL 95c <sub_95c>
     960: MOV [ESP+0x18], EAX
     964: MOV DWORD [ESP], 0x1e ; '\x1e'
     96b: CALL 96c <sub_96c>
     970: MOV EAX, [0x0]
     975: MOV DWORD [ESP+0x4], 0x0
     97d: MOV [ESP], EAX
     980: CALL 981 <sub_981>
     985: MOV EAX, [0x0]
     98a: MOV DWORD [ESP+0x4], 0x0
     992: MOV [ESP], EAX
     995: CALL 996 <sub_996>
     99a: MOV DWORD [ESP+0x4], 0x0
     9a2: MOV DWORD [ESP], 0xb80 ; '/home/challenge/flag'
     9a9: CALL 9aa <sub_9aa>
     9ae: MOV [ESP+0x1c], EAX
     9b2: CMP DWORD [ESP+0x1c], -0x1 ;
     9b7: JNZ 0x9d1 ; if(DWORD [ESP+0x1c] == -0x1) {
     9b9: MOV DWORD [ESP], 0xb95 ; "Can't open flag"
     9c0: CALL 9c1 <sub_9c1>
     9c5: MOV DWORD [ESP], 0x0
     9cc: CALL 9cd <sub_9cd>
; }
     9d1: MOV DWORD [ESP+0x8], 0x100 ; 'mment'
     9d9: MOV EAX, [ESP+0x18]
     9dd: MOV [ESP+0x4], EAX
     9e1: MOV EAX, [ESP+0x1c]
     9e5: MOV [ESP], EAX
     9e8: CALL 9e9 <read>
     9ed: MOV EAX, [ESP+0x1c]
     9f1: MOV [ESP], EAX
     9f4: CALL 9f5 <sub_9f5>
     9f9: MOV DWORD [ESP], 0xba5 ; 'OpenCTF tyro info leak 2\n'
     a00: CALL a01 <puts>
     a05: MOV DWORD [ESP], 0xbbf ; 'ASLR is on, the binary is PIE'
     a0c: CALL a0d <puts>
     a11: MOV DWORD [ESP], 0xbdd ; 'Can you read the flag?'
     a18: CALL a19 <puts>
     a1d: MOV DWORD [ESP], 0xbf4 ; '1)relative read\n2)absolute read'
     a24: CALL a25 <puts>
     a29: LEA EAX, [ESP+0x14]
     a2d: MOV [ESP+0x4], EAX
     a31: MOV DWORD [ESP], 0xc14 ; '%d'
     a38: CALL a39 <vfscanf>
     a3d: MOV EAX, [ESP+0x14]
     a41: CMP EAX, 0x1 ;
     a44: JNZ 0xa8c ; if(EAX == 0x1) {
     a46: MOV DWORD [ESP], 0xc17 ; 'Offset: '
     a4d: CALL a4e <puts>
     a52: LEA EAX, [ESP+0x14]
     a56: MOV [ESP+0x4], EAX
     a5a: MOV DWORD [ESP], 0xc20 ; '%x'
     a61: CALL a62 <rel_scanf>
     a66: LEA EDX, [ESP+0x14]
     a6a: MOV EAX, [ESP+0x14]
     a6e: ADD EAX, EDX
     a70: MOV [ESP+0x14], EAX
     a74: MOV EAX, [ESP+0x14]
     a78: MOV EAX, [EAX]
     a7a: MOV [ESP+0x4], EAX
     a7e: MOV DWORD [ESP], 0xc23 ; '%p\n'
     a85: CALL a86 <printf>
     a8a: JMP 0xae5
; }
     a8c: MOV EAX, [ESP+0x14]
     a90: CMP EAX, 0x2 ;
     a93: JNZ 0xacd ; if(EAX == 0x2) {
     a95: MOV DWORD [ESP], 0xc28 ; 'Absolute address to read from: '
     a9c: CALL a9d <puts>
     aa1: LEA EAX, [ESP+0x14]
     aa5: MOV [ESP+0x4], EAX
     aa9: MOV DWORD [ESP], 0xc20 ; '%x'
     ab0: CALL ab1 <abs_scanf>
     ab5: MOV EAX, [ESP+0x14]
     ab9: MOV EAX, [EAX]
     abb: MOV [ESP+0x4], EAX
     abf: MOV DWORD [ESP], 0xc23 ; '%p\n'
     ac6: CALL ac7 <printf>
     acb: JMP 0xae5
; }
     acd: MOV DWORD [ESP], 0xc48 ; 'wat!'
     ad4: CALL ad5 <sub_ad5>
     ad9: MOV DWORD [ESP], 0x0
     ae0: CALL ae1 <sub_ae1>
     ae5: JMP 0xa1d
     aea: NOP
     aec: NOP
     aee: NOP
__libc_csu_init:
     af0: PUSH EBP
     af1: PUSH EDI
     af2: XOR EDI, EDI
     af4: PUSH ESI
     af5: PUSH EBX
     af6: CALL 820 <__x86.get_pc_thunk.bx> ; EBX = 0xafb
     afb: ADD EBX, 0x1505
     b01: SUB ESP, 0x1c
     b04: MOV EBP, [ESP+0x30]
     b08: LEA ESI, [EBX-0x110]  ; 0x1ef0 '\xc0\x08'
     b0e: CALL 6d0 <sub_6d0>
     b13: LEA EAX, [EBX-0x114]  ; 0x1eec '\x10\t'
     b19: SUB ESI, EAX
     b1b: SAR ESI, 0x2
     b1e: TEST ESI, ESI ;
     b20: JZ 0xb49 ; if(ESI) {
     b22: LEA ESI, [ESI+0x0]
     b28: MOV EAX, [ESP+0x38]
     b2c: MOV [ESP], EBP
     b2f: MOV [ESP+0x8], EAX
     b33: MOV EAX, [ESP+0x34]
     b37: MOV [ESP+0x4], EAX
     b3b: CALL DWORD [EBX+EDI*4-0x114]
     b42: ADD EDI, 0x1
     b45: CMP EDI, ESI ;
     b47: JNZ 0xb28 ; } while(EDI != ESI)
; }
     b49: ADD ESP, 0x1c
     b4c: POP EBX
     b4d: POP ESI
     b4e: POP EDI
     b4f: POP EBP
     b50: RET
     b51: JMP 0xb60
     b53: NOP
     b54: NOP
     b55: NOP
     b56: NOP
     b57: NOP
     b58: NOP
     b59: NOP
     b5a: NOP
     b5b: NOP
     b5c: NOP
     b5d: NOP
     b5e: NOP
     b5f: NOP
__libc_csu_fini:
     b60: RET
.fini:
:
     b64: PUSH EBX
     b65: SUB ESP, 0x8
     b68: CALL 820 <__x86.get_pc_thunk.bx> ; EBX = 0xb6d
     b6d: ADD EBX, 0x1493
     b73: ADD ESP, 0x8
     b76: POP EBX
     b77: RET
