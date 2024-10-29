package com.min.edu;

public class Null_Main {

	/*
	 *  Null 이란? 
	 *  클래스가 인스턴스화 하여 heap 영역에 생성이 된다 (reference/hashcode)
	 *  객체의 생성(instance화)없이 stack에 변수와 아무것도 없는 것이 연결된 상태
	 *  즉, 변수는 객체타입으로 선언이 되어 있고, 연결(참조하는)된 heap객체가 없는 상태
	 *  
	 *  객체가 연결되어있지 않다는것은 실행할 수 있는 기능이 없다는 것. => NullPointerException 발생
	 *  
	 *  거꾸로 stack에 연결은 되어 있지 않는데 heap에만 있는 상태 JVM에 의해서 자동으로 삭제된다.
	 *  
	 */
	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println("객체 확인 : "+obj);
		
		obj = null; //기존의 객체는 끊어지고 null의 상태가 된다.
		System.out.println("객체 확인 : " + obj);
		
//		System.out.println(obj.getClass());
		
		
	
	}

}
