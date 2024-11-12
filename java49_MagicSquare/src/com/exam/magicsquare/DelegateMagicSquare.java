package com.exam.magicsquare;

public final class DelegateMagicSquare {

	public static void magicSquareProcess(IMagicSquare magic) {
		if(magic != null) {
			magic.makeMagic();
			magic.print();
		} else {
			System.out.println("아직 개발중인 마방진임 \n 관리자에게 문의");
		}
	}
}
