package com.example.edu;

import java.util.Scanner;

// TODO 001 타입의 선언과 대입
public class DataType {
	// TODO 002 선언과 대입
	public void declaring_assignment() {
		// Byte = -128 ~ 127
		byte b = 127; // 1byte는 01111111 가 최대 정수 입력 크기
//		byte not_in = 128; // byte의 최대 크기가 127이기 때문에 128의 값(리터럴)은 대입하지 못함.     
		byte b1 = 127;
		byte b2 = 1;
		byte sum = (byte) (b1 + b2); // 자바에서의 정수 연산의 결과는 무조건 int 타입이다.
		System.out.println(sum); // -128이 출력된다.

		// int의 최대값에 1을 더한다
		int i2 = 100;
		int i3 = 200;
		int sumInt = i2 + i3;
		System.out.println(sumInt);
		int maxInt = Integer.MAX_VALUE;
		System.out.println("int의 최대값 : " + maxInt);
		int calInt = 1;
		int maxPlus = maxInt + calInt;
		System.out.println("max 연산의 결과 : " + maxPlus);

		long l = 1;
		long longCal = maxInt + l; // 정수연산에서 long이 참여하면 결과는 long크기로 반환한다.
		System.out.println("long 연산 결과 : " + longCal);

		short maxShort = Short.MAX_VALUE;
		short s1 = 1;
		short calShort = (short) (maxShort + s1);
		System.out.println(calShort);
	} // declaring_assignment end
	
	//TODO 005 정수의 타입
	public void integerType() {
		byte bVal  = 0; // -128 ~ 127 : 8bit
		short sVal = 0; // -32768 ~ 32767 : 16 bit
		int i = 0; // -2^31 ~ 2^31-1 : 32bit
		long l = 0; // -2^63 ~ 2^63-1 : 64bit
		
		//리터럴 표기법
		int myHex = 0xF; //16진수 표기법 0x hexdecimal (base 16) 
		int myOcty = 07; //8진수 표기법 0 octal(base 8)
		int myBi = 0b10; //2진수 표기법(binary) (base 2), java 1.7 부터 사용되는 표기법
		
		//큰 숫자의 구분을 위해 '_'를 통해서 크기를 구분할 수 있다.(숫자의 크기를 가독성)
		int bibNumber = 1_000_000;
	} // integerType end
	
	//TODO 006 실수 타입(부동소수점 / Floating Point)
	public void floatType() {
		double myDouble = 3.14; // 실수표기법, 리터럴의 크기는 double 값을 가진다.
		double myDouble2 = 3e2; // 지수(exponential) 표기법 3*10^2 = 300
		
		// java에서 실수 값은 항상 double의 크기로 유지 된다.
		// 따라서 float 타입의 선언을 통해서 대입할 경우는 
		// 1) 값이 float값의 리터럴로 되기위해서 F접미사를 사용한다. ex) float f = 3.14f;
		// 2) 명시적 Casting 연산자를 사용하면 된다 ex) float f = (float)3.14;
		
	}
}
