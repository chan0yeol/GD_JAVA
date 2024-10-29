package com.exam.edu;

// TODO 001 parentClass를 extends 하고 있는 자식 클래스
// 			클래스의 생성은 부모가 먼저 생성되어야 한다.
//			=> 자식의 생성자에서 먼저 부모의 생성자를 호출한다 - super()
public class ChildClass extends ParentClass {
	private int x;
	private int y;

	// 기본생성자를 호출 했을 경우
	public ChildClass() {
		
	}

	

	// 값을 입력하는 생성자를 호출 했을 경우
	// 멤버필드를 초기화 하는 생성자 Overloading
	// TODO 003 생성자로 Overloading을 하면 default 생성자를 명시적으로 작성해주어야 한다.
	public ChildClass(int x, int y) {
		super(); // 부모의 default 생성자를 호출하고 있음
		this.x = x;
		this.y = y;
	}
	public ChildClass(int x) {
		super();
		this.x = x;
		this.y = x;
	}
	
	// 부모의 메소드를 재정의 하는 Override 
	// 외부에서 VMI에 의해서 자식에서 재정의된 메소드만 호출이 가능하다.
	public void make() {
		System.out.println("자식의 make 메소드");
	}
	

}
