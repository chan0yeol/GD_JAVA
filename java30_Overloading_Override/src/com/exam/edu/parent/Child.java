package com.exam.edu.parent;

// TODO 002-02 부모 Parent 클래스를 extends 하고 있는 자식클래스
public class Child extends Parent{
	int n = 100; // Parent 클래스도 가지고 있는 변수명
	
	public void childMethod() {
		
	}
	
	// Annotation
	// @Override Annotation 은 java 1.5 에서 생성되었으며
	// 어떠한 기능도 하지 않고 Override된 메소드를 표시하기  위해서 사용.
	@Override
	public void parentMake() {
//		super.parentMake();
		System.out.println("난 부모의 메소드를 재정의 했다");
	}


	public void callParent() {
		parentMake();
	}
}
