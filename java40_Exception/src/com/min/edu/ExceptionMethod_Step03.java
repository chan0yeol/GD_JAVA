package com.min.edu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionMethod_Step03 {
	/*
	 * Multi-catch block 예외처리를 step02에서는 상위 부모인 Exception을 통해서 VMI동작이 되도록 만듬
	 * Exception -> ArithMeticException , InputMisMatchException 두개가 발생 개발자가 구제적으로
	 * 예외코드를 볼 수 있도록 나열하여 처리 if문과 유사한 형태로 만들면 된다. - 상위에서 높은 처리를 가지면 안된다. Exception
	 * ㅡ> ArithMeticException - 같은 예외처리 등급이라면 상관은 없다. ArithMeticException
	 * ,InputMisMatchException 순서가 상관 없다.
	 */
	public int calculation() {
		int n = 0;
//		try {
//			Scanner scan = new Scanner(System.in);
//			System.out.println("정수 입력하세요");
//			n = scan.nextInt() / scan.nextInt();
//		} catch (Exception e) { // 상위 클래스, 먼저 모든 예외처리를 하게 된다.
//			e.printStackTrace();
//		} catch (ArithmeticException e) {
//			System.out.println(e.getMessage());
//		}

		System.out.println("상위 계층의 예외는 반드시 하위에 있어야 한다.");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("정수 입력하세요");
			n = scan.nextInt() / scan.nextInt();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (Exception e) { //ArithmeticException 외의 예외처리
			System.out.println(e.getMessage());
		} catch (Throwable e ) { // Exceptiong 외의 예외처리
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("동등한 예외 계층은 순서에 상관이 없다.");
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("정수 입력하세요");
			n = scan.nextInt() / scan.nextInt();
		} catch (InputMismatchException e) {
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		return n;
	}// calculation end
}
