.init:
_init:
  4003a8: SUB RSP, 0x8 ; RSP -= 0x8; 
  4003ac: MOV RAX, [RIP+0x2008ed] ; RAX = [RIP+0x2008ed]; 
  4003b3: TEST RAX, RAX ;
  4003b6: JZ 0x4003bd ; if(RAX) {
  4003b8: CALL 400400 <__gmon_start__>
; }
  4003bd: ADD RSP, 0x8 ; RSP += 0x8; 
  4003c1: RET
.plt:
  4003d0: PUSH QWORD [RIP+0x2008da]
  4003d6: JMP QWORD [RIP+0x2008dc] ; goto 
  4003dc: NOP DWORD [RAX+0x0]
puts:
  4003e0: JMP QWORD [RIP+0x2008da] ; goto 
  4003e6: PUSH DWORD 0x0
  4003eb: JMP 0x4003d0 ; goto 
__libc_start_main:
  4003f0: JMP QWORD [RIP+0x2008d2] ; goto 
  4003f6: PUSH DWORD 0x1 ; '\x01'
  4003fb: JMP 0x4003d0 ; goto 
__gmon_start__:
  400400: JMP QWORD [RIP+0x2008ca] ; goto 
  400406: PUSH DWORD 0x2 ; '\x02'
  40040b: JMP 0x4003d0 ; goto 
.text:
_start:
Arguments:
	RDX: int z = R9
  400410: XOR EBP, EBP ; EBP = 0
  400412: MOV R9, RDX ; R9 = z; 
  400415: POP RSI ; POP RSI
  400416: MOV RDX, RSP ; RDX = RSP; 
  400419: AND RSP, -0x10 ; RSP &= -0x10; 
  40041d: PUSH RAX
  40041e: PUSH RSP
  40041f: MOV R8, 0x400720 ; '\xf3\xc3'
  400426: MOV RCX, 0x4006b0 ; 'AWA\x89\xffAVI\x89\xf6AUI\x89\xd5ATL\x8d%\xf0\x03 '
  40042d: MOV RDI, 0x400506 ; 'UH\x89\xe5\xb8'
  400434: CALL 4003f0 <__libc_start_main>
  400439: HLT ; 
  40043a: NOP WORD [RAX+RAX+0x0]
deregister_tm_clones:
  400440: MOV EAX, 0x600cef ; EAX = 0x600cef; 
  400445: PUSH RBP
  400446: SUB RAX, 0x600ce8 ; RAX -= 0x600ce8; 
  40044c: CMP RAX, 0xe ;
  400450: MOV RBP, RSP ; RBP = RSP; 
  400453: JBE 0x400470 ; if(RAX > 0xe) {
  400455: MOV EAX, 0x0 ; EAX = 0x0; 
  40045a: TEST RAX, RAX ;
  40045d: JZ 0x400470 ; if(RAX) {
  40045f: POP RBP ; POP RBP
  400460: MOV EDI, 0x600ce8 ; EDI = 0x600ce8; 
  400465: JMP RAX ; goto 
  400467: NOP WORD [RAX+RAX+0x0]
; }
  400470: POP RBP ; POP RBP
  400471: RET ; return 0x0;
  400472: NOP WORD [RAX+RAX+0x0]
register_tm_clones:
  400480: MOV ESI, 0x600ce8 ; ESI = 0x600ce8; 
  400485: PUSH RBP
  400486: SUB RSI, 0x600ce8 ; RSI -= 0x600ce8; 
  40048d: SAR RSI, 0x3 ; RSI >>= 0x3; 
  400491: MOV RBP, RSP ; RBP = RSP; 
  400494: MOV RAX, RSI ; RAX = RSI; 
  400497: SHR RAX, 0x3f ; RAX >>= 0x3f; 
  40049b: ADD RSI, RAX ; RSI += RAX; 
  40049e: SAR RSI, 0x1 ; RSI >>= 0x1; 
  4004a1: JZ 0x4004b8
  4004a3: MOV EAX, 0x0 ; EAX = 0x0; 
  4004a8: TEST RAX, RAX ;
  4004ab: JZ 0x4004b8 ; if(RAX) {
  4004ad: POP RBP ; POP RBP
  4004ae: MOV EDI, 0x600ce8 ; EDI = 0x600ce8; 
  4004b3: JMP RAX ; goto 
  4004b5: NOP DWORD [RAX]
; }
  4004b8: POP RBP ; POP RBP
  4004b9: RET ; return 0x0;
  4004ba: NOP WORD [RAX+RAX+0x0]
__do_global_dtors_aux:
  4004c0: CMP BYTE [RIP+0x200829], 0x0 ;
  4004c7: JNZ 0x4004da ; if(BYTE [RIP+0x200829] == 0x0) {
  4004c9: PUSH RBP
  4004ca: MOV RBP, RSP ; RBP = RSP; 
  4004cd: CALL 400440 <deregister_tm_clones>
  4004d2: POP RBP ; POP RBP
  4004d3: MOV BYTE [RIP+0x200816], 0x1 ; '\x01'
; }
  4004da: RET
  4004dc: NOP DWORD [RAX+0x0]
frame_dummy:
  4004e0: MOV EDI, 0x600ac8 ; ''
  4004e5: CMP QWORD [RDI], 0x0 ;
  4004e9: JNZ 0x4004f0 ; if(QWORD [RDI] == 0x0) {
  4004eb: JMP 0x400480 ; goto 
  4004ed: NOP DWORD [RAX]
; }
  4004f0: MOV EAX, 0x0 ; EAX = 0x0; 
  4004f5: TEST RAX, RAX ;
  4004f8: JZ 0x4004eb ; } while(!RAX)
  4004fa: PUSH RBP
  4004fb: MOV RBP, RSP ; RBP = RSP; 
  4004fe: CALL RAX ; *RAX(RDI)
  400500: POP RBP ; POP RBP
  400501: JMP 0x400480 ; goto 
main:
  400506: PUSH RBP
  400507: MOV RBP, RSP ; RBP = RSP; 
  40050a: MOV EAX, 0x0 ; EAX = 0x0; 
  40050f: CALL 400677 <initialize_dx>
  400514: MOV EAX, 0x0 ; EAX = 0x0; 
  400519: CALL 40067f <import_input>
  40051e: MOV EAX, 0x0 ; EAX = 0x0; 
  400523: CALL 400694 <a_good_start>
  400528: MOV EAX, 0x0 ; EAX = 0x0; 
  40052d: CALL 400663 <word_realignment>
  400532: MOV EAX, 0x0 ; EAX = 0x0; 
  400537: CALL 4005ad <source_cx>
  40053c: MOV EAX, 0x0 ; EAX = 0x0; 
  400541: CALL 4006a5 <todo_unit_tests>
  400546: MOV EAX, 0x0 ; EAX = 0x0; 
  40054b: CALL 40069d <largerify>
  400550: MOV EAX, 0x0 ; EAX = 0x0; 
  400555: CALL 40068d <timing_offset>
  40055a: MOV EAX, 0x0 ; EAX = 0x0; 
  40055f: CALL 4005c3 <finalize_xc>
  400564: MOV EAX, 0x0 ; EAX = 0x0; 
  400569: CALL 4005bb <almost_there>
  40056e: MOV EAX, 0x0 ; EAX = 0x0; 
  400573: CALL 4005d9 <todo_reexamine>
  400578: MOV EAX, 0x0 ; EAX = 0x0; 
  40057d: CALL 4005fb <reticulate_splines>
  400582: MOV EAX, 0x0 ; EAX = 0x0; 
  400587: CALL 4005ce <timing_loop>
  40058c: MOV EAX, 0x0 ; EAX = 0x0; 
  400591: CALL 4005fb <reticulate_splines>
  400596: MOV EAX, 0x0 ; EAX = 0x0; 
  40059b: CALL 4005df <export_results>
  4005a0: POP RBP ; POP RBP
  4005a1: RET
important_initialization:
  4005a2: PUSH RBP
  4005a3: MOV RBP, RSP ; RBP = RSP; 
  4005a6: ADD ECX, 0x8 ; ECX += 0x8; 
  4005a9: SHR EAX, 0x1 ; EAX >>= 0x1; 
  4005ab: POP RBP ; POP RBP
  4005ac: RET
source_cx:
  4005ad: PUSH RBP
  4005ae: MOV RBP, RSP ; RBP = RSP; 
  4005b1: XOR ECX, ECX ; ECX = 0
  4005b3: INC ECX ; 
  4005b5: SHL ECX, 0x1 ; ECX <<= 0x1; 
  4005b7: SHL ECX, 0x1 ; ECX <<= 0x1; 
  4005b9: POP RBP ; POP RBP
  4005ba: RET
almost_there:
  4005bb: PUSH RBP
  4005bc: MOV RBP, RSP ; RBP = RSP; 
  4005bf: INC EDX ; 
  4005c1: POP RBP ; POP RBP
  4005c2: RET
finalize_xc:
  4005c3: PUSH RBP
  4005c4: MOV RBP, RSP ; RBP = RSP; 
  4005c7: ADD ECX, 0x8 ; ECX += 0x8; 
  4005ca: SHL ECX, 0x1 ; ECX <<= 0x1; 
  4005cc: POP RBP ; POP RBP
  4005cd: RET
timing_loop:
  4005ce: PUSH RBP
  4005cf: MOV RBP, RSP ; RBP = RSP; 
  4005d2: TEST RAX, RAX ;
  4005d5: JNZ 0x4005d2 ; } while(RAX)
  4005d7: POP RBP ; POP RBP
  4005d8: RET
todo_reexamine:
  4005d9: PUSH RBP
  4005da: MOV RBP, RSP ; RBP = RSP; 
  4005dd: POP RBP ; POP RBP
  4005de: RET
export_results:
  4005df: PUSH RBP
  4005e0: MOV RBP, RSP ; RBP = RSP; 
  4005e3: MOV EAX, 0x0 ; EAX = 0x0; 
  4005e8: CALL 4005d9 <todo_reexamine>
  4005ed: MOV EAX, EBX ; EAX = EBX; 
  4005ef: CDQE ; 
  4005f1: MOV RDI, RAX ; RDI = RAX; 
  4005f4: CALL 4003e0 <puts>
  4005f9: POP RBP ; POP RBP
  4005fa: RET
reticulate_splines:
Arguments:
	RDX: int z = <no reg>
  4005fb: PUSH RBP
  4005fc: MOV RBP, RSP ; RBP = RSP; 
  ; space
  4005ff: MOV [RBX+RDX], CL ; [RBX+RDX] = CL; 
  400602: INC RDX ; 
  400605: CMP RDX, 0xb ;
  400609: JZ 0x400622 ; if(RDX != 0xb) {
  ; the next 4 "answ"
  40060b: MOV DWORD [RBX+RDX], 0x77736e61 ; 
  400612: ADD RDX, 0x4 ; RDX += 0x4; 
  ; "er"
  400616: MOV WORD [RBX+RDX], 0x7265 ; 
  40061c: ADD RDX, 0x2 ; RDX += 0x2; 
  400620: JMP 0x400660 ; goto 
; }
  ; "is"
  400622: MOV WORD [RBX+RDX], 0x7369 ; 
  400628: ADD RDX, 0x2 ; RDX += 0x2; 
  ; " "
  40062c: MOV [RBX+RDX], CL ; [RBX+RDX] = CL; 
  40062f: INC RDX ; 
  400632: XOR AX, AX ; AX = 0
  400635: INC AX ; 
  400638: SHL AX, 0x2 ; AX <<= 0x2; 
  40063c: INC AX ; 
  40063f: SHL AX, 0x2 ; AX <<= 0x2; 
  400643: INC AX ; 
  400646: SHL AX, 0x1 ; AX <<= 0x1; 
  400649: MOV CL, 0xa ; '\n'
  40064b: DIV CL ; 
  40064d: ADD AX, 0x3030 ; AX += 0x3030; 
  400651: MOV [RBX+RDX], AX ; [RBX+RDX] = AX; 
  400655: ADD RDX, 0x2 ; RDX += 0x2; 
  400659: MOV WORD [RBX+RDX], 0xa ; '\n'
  40065f: NOP
  400660: NOP
  400661: POP RBP ; POP RBP
  400662: RET
word_realignment:
  400663: PUSH RBP
  400664: MOV RBP, RSP ; RBP = RSP; 
  400667: INC RDX ; 
  40066a: MOV BYTE [RBX+RDX], 0x68 ; 'h'
  40066e: INC RDX ; 
  400671: MOV BYTE [RBX+RDX], 0x65 ; 'e'
  400675: POP RBP ; POP RBP
  400676: RET
initialize_dx:
Arguments:
	EDX: int z = EDX
  400677: PUSH RBP
  400678: MOV RBP, RSP ; RBP = RSP; 
  40067b: XOR EDX, EDX ; EDX = 0
  40067d: POP RBP ; POP RBP
  40067e: RET
import_input:
  40067f: PUSH RBP
  400680: MOV RBP, RSP ; RBP = RSP; 
  400683: MOV EAX, 0x600d00 ; '.2-10) 4.9.2'
  400688: MOV EBX, EAX ; EBX = EAX; 
  40068a: NOP
  40068b: POP RBP ; POP RBP
  40068c: RET ; return 0x600d00;
timing_offset:
  40068d: PUSH RBP
  40068e: MOV RBP, RSP ; RBP = RSP; 
  400691: NOP
  400692: POP RBP ; POP RBP
  400693: RET
a_good_start:
  400694: PUSH RBP
  400695: MOV RBP, RSP ; RBP = RSP; 
  400698: MOV BYTE [RBX], 0x54 ; 'T'
  40069b: POP RBP ; POP RBP
  40069c: RET
largerify:
  40069d: PUSH RBP
  40069e: MOV RBP, RSP ; RBP = RSP; 
  4006a1: SHL ECX, 0x1 ; ECX <<= 0x1; 
  4006a3: POP RBP ; POP RBP
  4006a4: RET
todo_unit_tests:
  4006a5: PUSH RBP
  4006a6: MOV RBP, RSP ; RBP = RSP; 
  4006a9: POP RBP ; POP RBP
  4006aa: RET
  4006ab: NOP DWORD [RAX+RAX+0x0]
__libc_csu_init:
Arguments:
	EDI: int x = R15D
	RSI: int y = R14
	RDX: int z = R13
  4006b0: PUSH R15
  4006b2: MOV R15D, EDI ; R15D = x; 
  4006b5: PUSH R14
  4006b7: MOV R14, RSI ; R14 = y; 
  4006ba: PUSH R13
  4006bc: MOV R13, RDX ; R13 = z; 
  4006bf: PUSH R12
  4006c1: LEA R12, [RIP+0x2003f0]  ; 0x600ab8 '\xe0\x04@'
  4006c8: PUSH RBP
  4006c9: LEA RBP, [RIP+0x2003f0]  ; 0x600ac0 '\xc0\x04@'
  4006d0: PUSH RBX
  4006d1: SUB RBP, R12 ; RBP -= R12; 
  4006d4: XOR EBX, EBX ; EBX = 0
  4006d6: SAR RBP, 0x3 ; RBP >>= 0x3; 
  4006da: SUB RSP, 0x8 ; RSP -= 0x8; 
  4006de: CALL 4003a8 <_init>
  4006e3: TEST RBP, RBP ;
  4006e6: JZ 0x400706 ; if(RBP) {
  4006e8: NOP DWORD [RAX+RAX+0x0]
  4006f0: MOV RDX, R13 ; RDX = z; 
  4006f3: MOV RSI, R14 ; RSI = y; 
  4006f6: MOV EDI, R15D ; EDI = x; 
  4006f9: CALL QWORD [R12+RBX*8] ; [R12+RBX*8](RDI)
  4006fd: ADD RBX, 0x1 ; RBX += 0x1; 
  400701: CMP RBX, RBP ;
  400704: JNZ 0x4006f0 ; } while(RBX != RBP)
; }
  400706: ADD RSP, 0x8 ; RSP += 0x8; 
  40070a: POP RBX ; POP RBX
  40070b: POP RBP ; POP RBP
  40070c: POP R12 ; POP R12
  40070e: POP R13 ; POP R13
  400710: POP R14 ; POP R14
  400712: POP R15 ; POP R15
  400714: RET
  400715: NOP WORD [RAX+RAX+0x0]
__libc_csu_fini:
  400720: RET
.fini:
_fini:
  400724: SUB RSP, 0x8 ; RSP -= 0x8; 
  400728: ADD RSP, 0x8 ; RSP += 0x8; 
  40072c: RET
