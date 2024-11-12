package com.min.edu.step01;

import com.min.edu.Cat;

public class GenericMain01 {
	
	//TODO 00202 Generic으로 선언된 MyBox 클래스를 사용하여 객체를 생성
	/*
	 * 기존의 객체는 멤버필드의 타입을 미리 선언해 작성하기 때문에 확장성이 없다.
	 * MyBox는 Generic(<T>)을 통해 외부에서 타입을 정할 수 있기 때문에 확장성이 좋다.  
	 */
	public static void main(String[] args) {
		MyBox<String> name = new MyBox<String>();
		name.box = "동그라미";
		
		MyBox<Integer> age = new MyBox<Integer>();
		age.box = 30;
		System.out.printf("이름 %s 나이 %d \n",name.box,age.box);
		
		// TODO 00203 java 7부터는 비어있는 타입(<>)을 선언이 가능
		MyBox<Integer> iBox = new MyBox<>();
		iBox.box = 5;
		Integer i = iBox.box;
		System.out.println(iBox.box);
		//** 용어 컴파일 타임 에러
//		iBox.box = "Hello"; // compile-time error;
		
		 
		MyBox<Cat> catBox = new MyBox<Cat>();
		catBox.box = new Cat();
		catBox.box.setCatName("호두");
		
		System.out.println("고양이 박스에 담김 : "+catBox.box.getCatName());
	}
}
