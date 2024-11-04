package com.min.edu;

public class A_Main {
	public static void main(String[] args) {
		// TODO 00103 생성되는 객체에 따라서 VMI가 동작된다
		//			  부모의 클래스가 자동으로 생성되어 있지 않는 자식클래스 호출하지 못함.
		
		// 생성된 객체가 Parent 객체이다.
//		   따라서 실행되는 멤버는 모두 Parent 객체.
		Parent p = new Parent();
		p.parentMake();
		
		// 타입은 Parent여도 객체를 생성한 생성자는 Child이기 때문에
		// 실행되는 parentMake는 override 된 Child의 멤버를 실행
		// 타입은 Parent로 Up Casting 되었음으로 보여지는 메소드는 Parent만 보임
		// 하지만 생성된 객체가 Child이기 때문에 parentMake()를 실행 시키면
		// 오버라이드 된 Child의 parentMake()가 실행
		
		Parent c = new Child();
		c.parentMake();
		System.out.println(c.n);
		
	}
}
