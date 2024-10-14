package com.example.edu;

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

	}

}
