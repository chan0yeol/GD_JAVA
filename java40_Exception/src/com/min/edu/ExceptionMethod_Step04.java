package com.min.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMethod_Step04 {
	/*
	 * java 1.7 이후부터는 Multi-Catch block을 한 문장으로 작성 가능
	 * |(or)를 사용하여 한줄 처리
	 * 단점 : 반드시 "같은" 등급의 예외처리 클래스여야 한다.
	 */
	public int calculation() {
		int n = 0;
		
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("정수 입력하세요");
				n = scan.nextInt() / scan.nextInt();
				// | (or)를 사용하려면 작성하는 Exception이 동급이어야 한다. 
			} catch (ArithmeticException | InputMismatchException e) {
				e.printStackTrace();
			}
		return n;
	}// calculation end
}
