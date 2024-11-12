package com.min.edu.step04;

// TODO 00501 제네릭 코드의 타입의 정보를 제거하는 프로세스를 유형 삭제라고 한다.
/*
 * T는 자바의 최상위부모객체인 Object에 포함되는 객체가 아니다.
 */
public class DeleteType<T> {

	public void myMethod(Object o) {
		T t1; // 선언
		t1 = null; // null 대입
		t1 = (T)o; // 외부에서 전달 받은 객체를 Casting 가능
		System.out.println(t1.toString());
		// TODO 00502 T는 Object의 자식클래스로 타입확인할 수 없다.
//		if(o instanceof T) {}// 확인이 되지 않음
//		T tt = new T(); 
		// Gemeric 으로 입력받아 설정되는 T는 타입을 알 수 없기 때문에 new를 할 수 없다.
		
		o = t1;
		
	}
}
