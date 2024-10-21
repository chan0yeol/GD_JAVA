package com.example.edu;

//TODO 001 Class의 요소와 설정

public class ClassCreate {
	/*
	 * 클래스는 객체를 사용하는데 사용되는 템플릿이다.
	 * 클래스는 멤버로 구성되어 있다.
	 * 1) 멤버필드 : 객체의 상태 특징을 가지는 변수 - heap 영역에 올라감 (객체마다 다름)
	 * 2) 멤버메소드 : 메소드는 객체가 할 수 있는 일 즉, 객체의 동작을 정의 - method area에 올라감 (같은 class라면 공유해서 사용)
	 * 
	 * 정의 클래스 외부에서 멤버(필드 또는 메소드)를 접근하려면 반드시 객체를 선언해야 한다.
	 * 객체를 선언하기 위해서 new를 사용한다.
	 */
	
//	 멤버필드 영역 ------------------------------------
	private String name;
	private int age;
//	 멤버필드 영역 end---------------------------------
	
//	생성자(Constructor)
	public ClassCreate(){
		
	}
//	생성자(Constructor) end 
	
//	멤버메소드 영역
	
	public void memberMethod() {
		
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
//	멤버메소드 end

	
} // class end
