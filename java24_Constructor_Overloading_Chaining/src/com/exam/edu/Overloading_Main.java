package com.exam.edu;

public class Overloading_Main {

	public static void main(String[] args) {
		// TODO 002 default 생성자의 호출 
		ChildClass child = new ChildClass();
		child.make();
		ParentClass p = new ParentClass();
		System.out.println("p name: " + p.getName());
		System.out.println("p age: " + p.getAge());
		ParentClass p2 = new ParentClass("이름만 입력");
		System.out.println("p2 name: " + p2.getName());
		System.out.println("p2 age: " + p2.getAge());
	}

}
