package com.example.edu.a;

/*
 * Static이란?
 * 	- 멤버필드와 멤버메소드에 작성이 가능하다.
 *  - static으로 선언된 멤버는 new를 하지 않아도 Application 실행 될 때 클래스명의 주소로 메모리에 할당된다.
 *   => 호출시 클래스명.멤버 로 new 생성없이 사용할 수 있다.
 *   
 *  - static으로 만든 멤버는 모두 어떠한 곳에서도 사용이 가능하다.(예외사항: 접근제한자에 의해서 접근제어 할 수 있다.)
 */
public class Static_IncludeClass {
	//static으로 선언된 Static_IncludeClass에 있는 make() 메소드
	public static void make() {
		
	}
	// 같은 클래스의 메소드에 static으로 선언된 멤버를 호출할 경우
	// Italic 체로 만들어 진다.
	public void makeA() {
		make();
	}
	
	//static 메소드에서는 non-static 메소드를 호출 할 수 없다.
	// 메모리에 객체가 생성되는 시점이 다르기 때문에
	// static은 항상 메모리에 할당됨
	// non-static은 포함하는 class가 new 되었을 때 메모리에 할당 되기 때문에 생성시간과 생성 메모리의 시점이 다름 -> 호출 불가
	public static void makeEtc() {
//		makeA();
	}

}
