package com.exam.edu;

// TODO 001 출력의 기능만을 가지고 있는 메소드의 집합 클래스
public class PrintClass {
	// 문자열, 숫자, 실수, Argument 2개, Argument 2타입
	public void userPrint(String msg) {
		System.out.println("문자" + msg);
	}

	public void userPrint(int n) {
		System.out.println("숫자" + n);
	}

	public void userPrint(double d) {
		System.out.println("실수" + d);
	}

	public void userPrint(String name, int age) {
		System.out.printf("이름 %s / 나이 %d\n",name,age);
	}

	public void userPrint(String address, long height) {
		System.out.printf("주소 %s / 키 %d\n",address, height);
	}
}
