package com.exam.edu.field;

public class FieldMain {
	
	// TODO 003 멤버필드는 오버라이드 되지 않고 타입에 따라서 멤버필드의 값이 사용된다.
	public static void main(String[] args) {
		// 생성된 객체가 Triangle의 자식 클래스 이다.
		// 따라서 변화될 수 있는 타입은 자신의 클래스인 Rectangle와 부모의 클래스인 Triangle로 될 수 있다.
		// 멤버필드는 사용되는 타입에 따라서 정해진다.
		// Override가 절대 아니다
		
		Rectangle r = new Rectangle();
		Triangle t = r;
		System.out.println(r.w);
		System.out.println(t.w);
	}
}
