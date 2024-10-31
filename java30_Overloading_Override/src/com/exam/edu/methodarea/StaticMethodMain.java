package com.exam.edu.methodarea;


// TODO 004 static으로 선언된 메소드는 Override 되지 않고 Hide되어 실행된다.
public class StaticMethodMain {

	public static void main(String[] args) {
		int child = ChildStatic.newArea(10, 10);
		int parent = ParentStatic.newArea(10, 10);
		System.out.println(child);
		System.out.println(parent);
		
	}
}
