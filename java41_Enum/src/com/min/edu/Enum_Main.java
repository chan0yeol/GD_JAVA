package com.min.edu;

import java.util.Arrays;

public class Enum_Main {

	public static void main(String[] args) {
		// 1 enum 타입은 정적(static) 방법과 같이 사용한다
		// 하지만 변수의 타입은 반드시 enum이어야 한다.

		Speed s = Speed.SLOW;

		// switch case의 비교 값은
		// key와 value는 항상 같은 타입이어야 한다.
		// 정수, 문자열(1.7이후 가능), enum타입

		switch (s) { // enum타입의 값이 key
		case SLOW:
			System.out.println("SLOW");
			break;
		case FAST:
			System.out.println("FAST");
			break;
		case NOMAL:
			System.out.println("NOMAL");
			break;
		case STOP:
			System.out.println("STOP");
		} //switch end

		
		// 2. enum이 가지고 있는 값 출력
		Speed_Value sv = Speed_Value.NOMAL;
		System.out.println(sv.velocity);
		
		// 3. enum의 주요 메소드
		// 	1) enum이 가지고 있는 모든 값을 출력 => values()
		Speed_Value[] a = Speed_Value.values();
		String speedName = a[2].toString();
		System.out.println(speedName);
		System.out.println(Arrays.toString(a));
		
		
		Speed_Value bName = Speed_Value.valueOf(speedName);
		System.out.println(bName);
		System.out.println(bName.velocity);
		
		
		
		
		
		
	}// main end
}
