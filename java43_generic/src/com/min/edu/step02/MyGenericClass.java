package com.min.edu.step02;

// TODO 00301 제네릭을 메소드/생성자 정의하여 사용
public class MyGenericClass {
	
	private String s;

	public <T> MyGenericClass(T t) {
		
//		this.s = s;
		this.s = t.toString();
	}

	public String getS() {
		return s;
	}
	
	// 모든 타입의 Array를 출력해주는 메소드
	public static <T> void printArray(T[] array) {
		for (T t : array) {
			System.out.println(t);
		}
	}
	
}
