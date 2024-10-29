package com.exam.edu;

public class ParentClass {
	
	private String name;
	private int age;
	// TODO 004 this의 체이닝 방식
	// this(T) 키워드를 사용해서 다른 생성자를 호출 할 수 있다.
	// 이와 같은 기술을 체이닝 이라한다.
	// 체이닝을 통해서 복잡한 코드의 재사용이 가능하다.
	// *** 
	public ParentClass() {
		this("기본이름",100);
	}

	public ParentClass(String name) {
//		super(); // 체이닝의 호출에는 반드시 마지막에 실행되는 생성자에서 부모를 호출하게 된다.
		this(name,0);
		System.out.println("부모의 생성자 체이닝 : " + name);
	}
	public ParentClass(String name, int age) { 
		super(); // 체이닝의 호출에는 반드시 마지막에 실행되는 생성자에서 부모를 호출하게 된다.
		this.name = name;
		this.age = age;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void make() {
		System.out.println("부모의 make 메소드");
	}
}
