package com.example.edu.c;

//TODO 004 클래스의 생성 및 실행 순서
// 생성자, 연산자 블럭, static 생성
public class Class_Process {
	
//	외부에서 현재 클래스를 메모리에 할당하기 위해 호출 메소드 => 생성자(Constructor)
	public Class_Process() {
		System.out.println("난 생성자!!!!!!!");
	}
	
	{ // 연산자 블럭
		System.out.println("난 Initialization block !!!!!!!!!!");
	}
	
	static {
		System.out.println("난 static생성자!!!!!!!!!!!!!!!!!!!");
	}
}
