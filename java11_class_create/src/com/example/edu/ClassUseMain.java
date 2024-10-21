package com.example.edu;

public class ClassUseMain {
	// TODO 002 Class의 객체 생성과 사용
	public static void main(String[] args) {
		/*
		 * Class는 객체를 만들기 위한 설계도 이다.
		 * => 메모리에 Class를 new를 통하여 객체로 만들어 주어야 한다.
		 * 생성된 객체는 
		 * 	메모리의 heap영역에 만들어 지고 항상 새로운 reference와 hashcode가 부여된다.
		 */
//		1) 객체 생성 new
		ClassCreate cc = new ClassCreate();
		
//		2) 객체 reference / hashcode를 가지고 실질적으로 code에 사용할 수 있다.
//		  -> 주소를 통한 접근 = reference = cc라는 변수가 가지고 있다.
		cc.setAge(7);
		cc.setName("김동글");
		
//		3) 객체의 메소드 호출
		System.out.println("cc의 name?"+cc.getName());
		System.out.println("cc의 age?"+cc.getAge());
	}
}
