package com.example.edu.concat;

// TODO 001 String의 가장 큰 특징은 Concatenation이다.
// 			문자열이 다른 타입을 만나면 보여지는 그대로의 문자열로 만들어 진다.
//			ex) 기본타입과의 concat => 값
//				참조타입과의 concat => 껍데기를 찍는다.

public class Concatenation_Main {

	public static void main(String[] args) {
		// concatenation을 많이 연결하면 메모리의 부하가 엄청 심하다.
		// -> 많은 것을 연결하기 위해서는 StringBuffer 클래스를 사용하자.
		
		int i = 10;
		char c = '0';
		boolean b = true;
		String str = "";		
		String str2 = null;
		
		// String은 concatenation이 발생하기 때문에 null 로초기화하면 null 이출력되서
		// *** 문자열을 만나는 순간 concat이 발생한다.
		System.out.println(i+c); // int
//		System.out.println(i+b); // boolean 연산을 할 수 없다. (bit 연산이 불가하다.)
		String tmp1 = i+c+(b+str); //
		System.out.println(tmp1);
		
		String tmp2 = str+i+c+b;
		System.out.println(tmp2);
		
	}

	/*
	 * 
	 * String str1 = "asd"; String str2 = new String("asd");
	 * 
	 * 
	 * 
	 * System.out.println("System.identityHashCode()");
	 * System.out.println(System.identityHashCode(str1));
	 * System.out.println(System.identityHashCode(str2));
	 * 
	 * 
	 * System.out.println("String.intern()"); System.out.println(str1.intern());
	 * System.out.println(str2.intern());
	 * 
	 * System.out.println("String.hashCode()"); System.out.println(str1.hashCode());
	 * System.out.println(str2.hashCode()); System.out.println();
	 */
}
