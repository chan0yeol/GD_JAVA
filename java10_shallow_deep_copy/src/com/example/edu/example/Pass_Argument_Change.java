package com.example.edu.example;

/**
 * 외부에서 argument로 값을 전달받아 값을 변경하는 메소드<br>
 * 기본타입을 전달받는 메소드 <br>
 * 참조타입을 전달받는 메소드 <br>
 * @author 오찬열
 * 
 *
 */
public class Pass_Argument_Change {
	/**
	 * 기본타입의 정수를 입력받아 입력받은 argument에 100을 더하는 메소드
	 * 
	 * @param 정수
	 */
	public void change(int num) {
		num += 100;
	}
	/**
	 * 참조타입의 정수 Array를 입력받아 모든 Array의 요소에 100을 더하는 메소드
	 * @param 정수 Array
	 */
	public void change(int[] num) {
		
		for(int i =0 ; i < num.length; i++) {
			num[i] += 100;
		}
		
	}
}
