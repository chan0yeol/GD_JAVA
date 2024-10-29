package com.min.one;

/*
 * TODO 001 접근제한자를 종류별(public default protected private)로 가지고 있는 메소드의 클래스 
 * 
 */
public class MyClass {

	public void publicMethod() {
		System.out.println("public은 모두 사용 가능");
	}

	void defaultMethod() {
		System.out.println("default는 패키지에 따라서 제한이 있다.");
	}

	protected void protectedMethod() {
		System.out.println("protected는 기본적으로 extends 문법에 관련이 있다.");
	}

	private void privateMethod() {
		System.out.println("private은 같은 클래스 내에서만 사용 가능하다.");
	}
	
	// TODO 002 같은 클래스 내에서 호출 가능한 접근제한자의 종류는 ?
	// 			같은 클래스 내에서는 모두 내 멤버이기 때문에 접근제한자의 영향을 받지 않는다.
	//			** static은 메모리의 할당 방식 순서가 다르기 때문에 static - static, non-static은 호출이 가능하고
	
	public void classAccessTest() {
		publicMethod();
		defaultMethod();
		protectedMethod();
		privateMethod();
	}

}
