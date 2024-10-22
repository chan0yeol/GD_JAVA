package com.example.edu;

import java.util.Scanner;

//TODO 3항연산자 ppt 34 page 10-22
public class Ternary_Operator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력");
		int n = scan.nextInt();
//		입력받은 정수(n)이 홀수인지 짝수인지 확인하는 메소드
		System.out.println(even(n)); 
	}
	/**
	 * if문을 사용한 홀짝 판단 메소드
	 * @param n 임의 정수
	 * @return true 짝수, false 홀수
	 */
	public static boolean if_Check(int n) {
		boolean isBool = false;
			if(n%2 == 0) {
				isBool = true;
			}
		return isBool;
	}
	/**
	 * 삼항연산자를 사용한 홀짝 판단 메소드
	 * @param n 임의 정수
	 * @return true 짝수, false 홀수
	 */
	public static String even(int n) {
		return (n%2==0) ? "짝수" : "홀수";
	}
}
