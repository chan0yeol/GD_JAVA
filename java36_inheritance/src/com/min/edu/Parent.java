package com.min.edu;


// TODO 00101 다른 클래스의 부모가 될 수 있는 클래스이다.
//				문제점 ? 1) 모든 클래스 parent를 extends 할 수 있다.
//						=> 오버라이드가 되어 질 수 있다.
//						=>final을 선언하여 extends가 되지 않는 클래스가 될 수 있다.
//						2) 부모가 되거나 안되거나 극단적인 상태
//							sealed 문법을 통해서 허용 클래스를 정의
public class Parent {
	public int n = 200;
	
	public void parentMethod() {
		
	}
	
	public void parentMake() { 
		System.out.println("parentMake");
	}
}
