package com.goo.dee;

// TODO 003 CharHome 클래스를 만든다.
public class CharHome {
	// TODO 004 zConvert() 메소드를 만든다. 반환값 없음
	// 요구사항 연산 : 'z'는 정수의 값이 무엇인가?
	// 정수의 값을 hexa 값으로 만든 후 , Unicode 표기법 으로 선언 및 대입하고 출력
	public void zConvert() {
		// TODO 005 'z'는 정수의 값 출력
		char zChar = 'z';
		System.out.println("'z'의 정수의 값 :" + (int) zChar);
		// TODO 006 'z'의 16진수의 값을 구한다.
		int zToInt = (int) zChar;
		// TODO 007 16진수로 만든다.
		String convertZ = Integer.toHexString(zToInt);
		System.out.println("'z'의 16진수의 값 : " + convertZ);
		// TODO 008 'z'를 unicode 표기법 으로 출력한다.
		char unicodeChar = '\u007a';
		System.out.println("'z'를 unicode표기법 으로 출력 : " + unicodeChar);
	}
}
