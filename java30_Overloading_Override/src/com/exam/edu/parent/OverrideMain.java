package com.exam.edu.parent;

public class OverrideMain {
	public static void main(String[] args) {
		// TODO 002-03 타입에 따른 호출 메소드, VIM의 강제적인 실행
		// 자식의 타입으로 자식을 생성
		// 자식을 생성하면 부모도 생성된다.
		Child c = new Child();
		c.parentMake(); // 생성된 타입이 Child이기 때문에 호출 Child => 잘못된 답변
		c.childMethod(); // Child 타입이 가질 수 있는 고유한 메소드
		c.parentMethod(); // Child 클래스가 Parent 클래스를 extends 하여 사용 할수 있는 메소드
		System.out.println(c.n); // Child 의 멤버필드 100 실행
		
		// up casting
		Parent p = c; // 생성은 Child 이지만 타입은 부모의 타입인 Parent를 사용
		p.parentMake();
		System.out.println(p.n); // 오버라이드는 메소드에서만 발생, 멤버필드는 타입에 따라서 호출된다.
		c.callParent(); // Parent > parentMake() -> Child > parentMake()
	}
}
