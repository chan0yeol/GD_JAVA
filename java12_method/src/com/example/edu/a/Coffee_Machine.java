package com.example.edu.a;

public class Coffee_Machine {
	//class 명 커피머신
		//method 명 머신
		// 반환타입 void
		// 아규먼트와 정수값
		// 파라미터가 전달되었을때 몇개의 커피가 나오냐 ? 출력
	public void machine(int money) {
		System.out.println("커피는 1잔에 10원");
		System.out.println("받은금액 : " + money + "원");
		System.out.println((money/10)+"잔의 커피");
	}
}
