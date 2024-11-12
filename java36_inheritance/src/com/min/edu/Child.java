package com.min.edu;

// TODO 00102 Parent를 extends하여 부모클래스로 사용하고 있는 Child클래스
public class Child extends Parent {
	
	// 멤버필드는 자신이 가지고 있는 특징
	// 멤버필드는 오버라이드 되지 않고 사용되는 타입에 따라 호출이 달라진다.
	public int n = 100;

	// VMI가 동작되어 외부에서 절대 부모의 메소드를 실행 할 수 없게 된다.
	@Override
	public void parentMake() {
		
		//  외부에서 오버라이드된 부모의 메소드를 호출 할 수 없지만 자식은 "super."을 통해서 호출 할 수 있다.
		super.parentMake();
		System.out.println("난 부모의 메소드를 재정의함");
	}
	
	public void childToParent() {
		parentMake();
	}
	
}
