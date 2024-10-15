package com.example.edu;

import java.util.Scanner;

public class Operation_main {
	//TODO 000 클래스를 생성(instance화 , 객체화)하고 클래스의 멤버를 실행
	public static void main(String[] args) {
//		Arithmetic_Operators ao = new Arithmetic_Operators();
//		ao.arithmetic();
//		ao.divisionSign();
//		Comparison_Operators co = new Comparison_Operators();
//		co.comparison();
//		Logical_Operators lo = new Logical_Operators();
//		lo.logical();
//		lo.shortCircuit(); // 접근제한자가 public 이기 때문에 객체를 생성하면 외부에서 사용할 수 있다.
		Scanner scan = new Scanner(System.in);
	    String str = scan.next();
	    char c = str.charAt(0);
	    if((int)c >= (int)'A' &&  (int)c <= (int)'Z') {
	    	System.out.println("대문자");
	    } else if ((int)c >= (int)'a' &&  (int)c <= (int)'z') {
	    	System.out.println("소문자");
	    } else if (Character.getNumericValue(c) == -1) {
	    	System.out.println("기타문자");
	    }else {
	    	System.out.println("숫자");
	    }
//	    System.out.println("소문자 'a' : "+Integer.toHexString('a'));
	    //System.out.println("소문자 'z' : "+Integer.toHexString('z'));
//	    System.out.println("소문자 'z' : "+Character.getNumericValue('z'));
	    System.out.println("대 'A' : "+Character.getNumericValue('1'));
	    System.out.println("대 'A' : "+Character.getNumericValue('가'));
	    System.out.println("대 'Z' : "+Character.getNumericValue('Z'));
	   
		/*
		 * if() { System.out.println("CCCC"); }
		 */
	}

}
