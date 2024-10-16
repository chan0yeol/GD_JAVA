package com.example.edu.value;

//TODO 002 문자열의 "" 값이 존재하는 값일까? 답: 아니다.
// 			초기화 혹은 빈값
public class ValueCheck {

	public static void main(String[] args) {
	
		String str = "";		
		String str2 = null;
		
		
//		System.out.println("String.length()");
//		System.out.println(str.length());
//		System.out.println(str2.length());
//		
//		char ch = str.charAt(0);
//		System.out.println(ch);
		
//		System.out.println("String.hashCode()");
//		System.out.println(str.hashCode());
//		System.out.println(str2.hashCode());
		
		System.out.println("str == str2");
		System.out.println(str == str2);
		
		System.out.println("----------");
		System.out.println("str:"+str);
		System.out.println("str2:"+str2);
		
		
	}

}
