package com.example.edu.scope;

//TODO 010 변수의 범위를 설명하기 위한 VariableMain 클래스 
public class VariableMain {

	public static void main(String[] args) {
		//TODO 012 local variable은 외부에서 입력 및 수정이 불가능.
		// VariableScope 클래스에 있는 멤버를 호출 하고 싶다.
		// -> VariableScope 클래스를 객체화(instance화 - new)를 통해 메모리에 할당하고 접근 .
		VariableScope vs = new VariableScope();
		vs.localVariable(); //local변수로 선언된 instanceVar 연산되어 출력되고 멤버필드의 instanceVar은 객체화되면서 default값인 0으로 자동초기화되어 0이 출력된다.
		
		
		//TODO 013 instance variable는 new를 했을 경우 사용할 수 있는 변수 
		// instance 변수는 멤버필드(member field)에 작성
		// ** 선언만 했다면 자동으로 타입의 default 값으로 초기화 됨.
		VariableScope vs1 = new VariableScope();
//		System.out.println(vs == vs1);
		System.out.println("vs1의 멤버 필드 값 : "+vs1.instaceVar);
		vs1.instaceVar = 99;
		System.out.println("vs1의 멤버 필드 값 입력 후: "+vs1.instaceVar);
		System.out.println("vs의 멤버 필드 값 : "+vs.instaceVar);
		
		
		//TODO 014 static variable은 메모리에 미리 할당되기 때문에 new를 하지않고
		// 사용할 변수의 위치와 이름만 알면 된다.
		System.out.println("static 변수 : "+VariableScope.staticVar);
		vs.staticVar = 100;
		System.out.println(vs1.staticVar);
		System.out.println("static 변수 : "+VariableScope.staticVar);
		
		
		
		
	}

}
