package com.min.edu;

import java.util.Scanner;

public class ExceptionMethod_Step01 {

	/*
	 * Scanner을 통해서 분모와 분자를 입력받아 몫을 구하는 연산
	 * - 10/2 => 5 
	 * - 10/0 => 연산이 되지 않는 작성 ArithmeticException
	 * ---------------------------------------------\
	 * - Scanner를 통한 입력시 nextInt()를 사용하는데
	 * 	 만약 사용자가 숫자를 제외한 a 혹은 특수문자 등을 입력하면 InputMisMatchException
	 */
	public int calculation() {
		int n = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력하세요");
		// ArithMeticException, InputMisMatchException
		n = scan.nextInt() / scan.nextInt(); 		
		return n;
	}// calculation end
}
