package com.example.edu.scope;

// TODO 011 변수의 사용 범위 (scope)
/* 
 * 1) 메소드 내에서만 사용하는 지역변수(local variable)
 * 2) 클래스를 instance화(객체생성) 했을경우 사용할 수 있는 instance변수 
 * 3) 클래스에 속해 있으나 객체 생성없이 사용할 수 있는 static 변수
 */
public class VariableScope {
	// 멤버필드 영역
	public int instaceVar; // instance 변수
	public static int staticVar; // static 변수
	//멤버필드 영역 end
	
	//멤버 메서드 영역
	public void localVariable() {
		//method 영역
		int localVar;
//		int localVar; 같은 영역에서 같은 이름의 변수를 사용할 수 없다.
		int instanceVar=10; // 이 값은 멤버필드의 instanceVar 일까? local의 instanceVar 일까? local 
		System.out.println(instanceVar + instanceVar);
		System.out.println("내 멤버필드 호출 this.instanceVar : " + this.instaceVar);
	}
	//멤버 메서드 영역 end
}
