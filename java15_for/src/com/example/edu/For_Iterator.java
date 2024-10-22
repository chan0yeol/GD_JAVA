package com.example.edu;

import java.util.Iterator;

public class For_Iterator {

	public static void main(String[] args) {
		/*
		 * for문은 코드블럭 ({})을 특정 횟수 만큼 반복한다.
		 * 세가지의 local variable
		 * 
		 * 	첫번째 : 초기값
		 *  두번째 : 제어 판단문
		 *  세번째 : 초기값을 증가하는 증감연산자
		 *  1.초기화, 2.판단, 3.연산, 4.증감
		 *  1234 -> 234 -> ... 2 => 종료
		 */
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}
		// for문의 변수는 여러개를 사용하여 처리할 수 있다.
		// local variable을 for문법에 포함 시킨다.
		for (int i = 0, m=0; i < 5; i++,m++) {
			System.out.println(i+m);
		}
		
		// 향상된 for문(enhanced for)
		// Array에 index를 사용하여 array의 index 호출 방식이 아닌
//		index 0 부터 끝까지 모두 호출하는 방식
		int[] arr = {1,10,20,99};
//		arr에 요소를 미리 캐스팅하여 값을 가져올 수 있다.
		for (int i : arr) {
			System.out.println(i);
		}
		
//		Object[] obj = {1,2,3,4};
//		for (Integer object : obj) {
//			
//			
//		}
	}

}
