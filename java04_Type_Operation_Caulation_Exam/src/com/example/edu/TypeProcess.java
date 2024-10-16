package com.example.edu;

import java.util.Arrays;

public class TypeProcess {
	// 멤버필드선언, 클랙스의 특징, 메모리는 heap, 자동으로 초기화
	// instance variable : 객체를 new를 했을경우 접근하여 사용 할 수 있다.(접근제한자)
	// 정수형
	byte b;
	short s;
	int i; // default
	long l;
	// 실수형
	float f;
	double d; // default
	// 논리형
	boolean bool; // true / false | default = false
	// 문자형
	char c; // 3개의 값 리터럴 값, 정수(int)

	// System.out.println("") 에서 System은 jvm 메모리에 올라가있는것
	public Arrays arr; // 참조타입 기능을 가진 클래스, 참조타입의 초기화는 null 이다.

	/*
	 * 정수의 기본 연산은 int 참여하는 타입에 따라서 결과의 타입이 변화될 수 있다. promotion(자동 형변환) , casting
	 * (명시적 형변환)
	 */
	public void calculation() {
		byte b1 = 127;
		byte b2 = 1;
		int nSum = b1 + b2;
		int bSum = (byte) (b1 + b2);
		// b1 + b2 타입은 byte 이지만 + 연산이 되면 값의 타입은 int가 되고 int nSum 변수에 복제
		System.out.println(nSum);
		System.out.println(bSum);

		// 참여하는 타입에 따른 결과 => 큰걸로 따라간다.
		long l = 100;
		short s = 20;
//		int sumLs = l + s ; -> l 의 타입이 long 이기 때문에 l+s는 값과 상관없이 long 타입이되어 에러가난다.
		int sumLs = (int) (l + s);
		System.out.println(sumLs);

		float f = 10.0f; // 실수 float 의 리터럴 값을 f변수에 대입
		float fDiv = f / 2; // float 과 정수가 참여하기 때문에 float의 크기로 대입된다.
		System.out.println(fDiv);

		double d = 11.0;
		double dDiv = d / 2;
		System.out.println(dDiv);

		float fCal1 = 10 / 3f;
		float fCal2 = 10 / (float) 3f;
		float fCal3 = (float) 10 / 3f;
		float fCal4 = (float) 10 / (float) 3;
		float fCal5 = 10f / 3f;
		float fCal6 = (float) (10 / 3);
		float[] farr = { fCal1, fCal2, fCal3, fCal4, fCal5, fCal6 };
		for (int i = 0; i < farr.length; i++) {
			System.out.println("fCal" + (i + 1) + "=" + farr[i]);
		}

	} // calculation end

	public void floatFn() {
		// 실수는 부동소수점이다. 실수와 정수부가 필요에 의해서 늘어나거나 줄어듬.
		// 크기를 알아보자.
		// float 과 double 기본타입을 클래스로 만들어서 정의한 Float, Double의 멤버필드에 정의되어 있다.
		// oracle > java se api-document > api > java.base > java.lang > Double
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);

		float f1 = 2.22f; // 실수의 리터럴 값은 double크기 이기 때문에 반드시 해당 리터럴 확인
		float f2 = (float) 2.22f; // casting 연산자 = 명시적 형변환

		double d1 = f1; // 같은 타입일 경우 작은 크기의 값을 큰 크기 값으로 대입 : Promotion = 자동형변환
		float f3 = (float) d1; // 같은 타입일 경우 큰크기에서 작은크기로 대입 : casting : 명시적 형변환

		// *** 특수한 경우
		// 정수와 실수의 관계
		// 타입이 변하는 것이기 때문에 반드시 casting연산자를 사용해야 한다.
		int n1 = 100;
		long n2 = 100;
		// 정수를 실수에 대입할때에는 promotion : 자동 형변환
		double dc1 = n1; // promotion
		double dc2 = n2; // promotion

		float fc1 = n1; // promotion
		float fc2 = n2; // promotion

		// 실수를 정수에 대입할때에는 casting : 명시적 형변환
		double dVal = 1.3;
		float fVal = 1.3f;

		int id = (int) dVal; // casting
		int id2 = (int) fVal; // casting

	} // floatFn end
	
}
