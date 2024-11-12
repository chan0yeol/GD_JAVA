package com.exam.magicsquare;

public class MagicSquareMain {
	public static void main(String[] args){
		MagicSquareFactory magicSquare = MagicSquareFactory.getInstance();
		MagicSquareImpl square;
		while (true) {
			try {
				square = magicSquare.factory();
				DelegateMagicSquare.magicSquareProcess(square);
				break;
			} catch (NoMakeMagicSquareException e) {
				System.out.println("마방진 오류발생 되었습니다. 재시도 합니다.");
				e.printStackTrace();
			} 
		}
		
	}
}
