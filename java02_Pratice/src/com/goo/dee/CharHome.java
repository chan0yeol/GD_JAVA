package com.goo.dee;

public class CharHome {
	public void zConvert() {
		char zChar = 'z';
		System.out.println("'z'의 정수의 값 :" + (int)zChar);
		System.out.println("'z'의 16진수의 값 : " + Integer.toHexString(zChar));
		char unicodeChar = '\u007a';
		System.out.println("'z'를 unicode표기법 으로 출력 : " + unicodeChar);
	}
	// 연산 : 'z'는 정수의 값이 무엇인가?
	// 정수의 값을 hexa 값으로 만든 후 , Unicode 표기법 으로 선언 및 대입하고 출력 
}
