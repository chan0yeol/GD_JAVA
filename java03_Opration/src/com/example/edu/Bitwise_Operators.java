package com.example.edu;
// TODO 006 비트연산
public class Bitwise_Operators {
	public void bitwise() {
		byte b = 5 & 4; // 101 & 100 = 100(4) //
		b = 5 | 4; // 101 | 101 = 101(5)
		b = 5 ^ 4; // 101 ^ 100 = 001(1)
		b = 4 << 1; // 100 << 1 = 1000(8) left shift
		b = 4 >> 1; // 100 >> 1 = 10(2) right shift
		b = 4 >>> 1; // 100 >> 1 = 10(2) zero-fill right shift // 부호비트를 포함하여 이동시킨다
		b = ~4; // 00000100 = 11111011(-5)
		
	}
}
