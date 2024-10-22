package com.util.edu;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

/**
 * 수업에 필요한 유틸리티를 가지고 있는 클래스 
 * @author 오찬열
 * @since 2024.10.22.
 * @version 1.0b
 */
public class EducationUtility {
	
	/**
	 * 정수를 키보드로 입력 받아 반환해주는 메소드
	 * @return 정수 int
	 */
	public static int getNumericValue() {
		int n=0;
		
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("정수만 입력해주세요");
				n = scan.nextInt();
				break;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.err.println(e.toString());
				System.err.println("정수만 입력하라고!!!!");
			} 
		}
		return n;
	}
}
