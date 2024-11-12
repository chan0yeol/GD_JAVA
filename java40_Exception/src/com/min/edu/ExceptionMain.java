package com.min.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ExceptionMain {

	public static void main(String[] args) {
		// STEP 01
//		ExceptionMethod_Step01 ems = new ExceptionMethod_Step01();
//		int res = ems.calculation();
//		System.out.println("Step01의 결과 : " + res);

		// STEP 02
//		ExceptionMethod_Step02 ems = new ExceptionMethod_Step02();
//		int res = ems.calculation();
//		System.out.println("Step02의 결과 :" + res);
		// STEP 03
//		ExceptionMethod_Step03 ems = new ExceptionMethod_Step03();
//		ems.calculation();
//		ExceptionMethod_Step05 ems = new ExceptionMethod_Step05();
//		int res = ems.calculation();
//		System.out.println("step05의 결과 : " + res);

		// STEP 07
		// Checked Exception
//		ExceptionMethod_Step07 step07 = new ExceptionMethod_Step07();
//		try {
//			step07.makeException();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// STEP 01 외부에서 예외처리
		// 예외처리를 발생하는 곳이 아닌 실행하는 곳에서도 할 수 있다.
//		ExceptionMethod_Step01 exStep01 = new ExceptionMethod_Step01();
//		int res = 0;
//		try {
//			res = exStep01.calculation();
//		} catch (Exception e) {
////			e.printStackTrace();
//		}
//		System.out.println("외부 예외처리 : " + res);

//		Scanner scan = new Scanner(System.in);
//		String str1 = scan.next();
//		String str2 = scan.next();
//
//		int num1 = 0;
//		int num2 = 0;
//		try {
//			num1 = Integer.parseInt(str1);
//			try {
//				num2 = Integer.parseInt(str2);
//				System.out.println(num1 + num2);
//			} catch (NumberFormatException e) {
//				System.out.println(str2 + "는 정수가 아닙니다");
//			}
//		} catch (NumberFormatException e) {
//			System.out.println(str1 + "는 정수가 아닙니다");
//		}
		Collections.sort(null);
		Scanner scan = new Scanner(System.in);
		String str1 = scan.next();
		String str2 = scan.next();
		int num1 = 0;
		boolean isc1 = false;
		int num2 = 0;
		boolean isc2 = false;
		
		try {
			num1 = Integer.parseInt(str1);
		} catch (NumberFormatException e) {
			isc1 = true;
		}
		try {
			num2 = Integer.parseInt(str2);
			
		} catch (NumberFormatException e) {
			isc2 = true;
		}
		
		if(isc1 == false && isc2 == false) {
			System.out.println(num1 + num2);
		} else {
			if(isc1) {
				System.out.println(str1+"는 정수가 아닙니다");
			} else {
				System.out.println(str2+"는 정수가 아닙니다");
			}
		}
		
	
	}
}
