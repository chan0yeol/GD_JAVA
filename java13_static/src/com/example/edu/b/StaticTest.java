package com.example.edu.b;

public class StaticTest {

	public static void main(String[] args) {
		// Static_NonStatic에 있는 static 멤버를 호출해 보자
		System.out.println(Static_NonStatic.pi);
		float f = Static_NonStatic.newArea(5);
		System.out.println(f);
		
		// instance 처리
		Static_NonStatic sn = new Static_NonStatic();
		System.out.println(sn.f);
		float fsn = sn.getArea();
		System.out.println(fsn);

	}

}
