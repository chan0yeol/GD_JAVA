package com.example.edu;
//TODO 003 비교연산자
// 기본타입 (primitive type)의 비교
public class Comparison_Operators {
	public void comparison() {
		// 정수형
		int i = 9; 
		byte b = 9;
		
		System.out.println("정수형 값은 같고 타입이 다른 경우 : " + (i==b));
	
		// 실수형
		float f = 9f;
		double d = 9;
		System.out.println("실수형 값은 같고 타입이 다른 경우 :" + (f==d));
		
		//문자형
		char c = '\u0009';
		System.out.println("'\u0009' : " + c);
		System.out.println((int)c);
		System.out.println(c==9); // 문자형의 리터럴의 int 값으로 비교가 가능하다.
		
		// 정수형(문자형)과 실수는 정수부만을 비교 해서 같은 값이라면 비교할 수 있다.
		System.out.println(i == d);
		
		/*
		 * 기본타입에서는 값을 비교한다.(immutable, 값의 복제, pbv : pass by value) 
		 * == equal
		 * != not equal 
		 * > grate than
		 * < less than
		 * >= grate than or equal
		 * <= less than or equal
		 */
	}// comparison end
}
