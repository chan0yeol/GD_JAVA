package com.min.edu;

import java.util.Scanner;

public class ExceptionMethod_Step02 {

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
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("정수 입력하세요");
			n = scan.nextInt() / scan.nextInt();
		} catch (Exception e) { // 19 ~ 22번 사이의 코드중 예외가 발생 했을 경우 실행되는 곳
			e.printStackTrace();
		}		
		return n;
	}// calculation end
}
