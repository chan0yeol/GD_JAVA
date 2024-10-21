package com.example.edu.b;

// TODO 003 같은 클래스에서는 접근제한자에 상관없이 모두호출이 가능하다
// 			하지만 static 영역과 멤버필드 영역이 다르기 때문에 사용이 불가능하다.
public class Static_NonStatic {
	/**
	 * static 키워드는 클래스의 멤버를 instance화(new)를 하지 않고 액세스(접근)할 수 있는 필드와 멤버메소드 에서만 사용 된다.
	 * static 으로 선언된 멤버는 하나의 메모리에 "한개만" 존재한다.
	 * instance로 선언된 멤버는 new를 할 경우 "각각의 새 객체"에 따라서 존재의 갯수가 정해짐
	 * 
	 * 즉, static 메소드는 인스턴스의 일부가 아니므로 인스턴스 멤버를 사용할 수 없다.
	 * 반면에 인스턴스 멤버를 static 멤버와 인스턴스 멤버를 모두 사용한다.
	 */
	
	float f = 10.0f; // default 접근제한자를 가지고있는 instance field이다.
	
//	static field의 초기화 값은 한번만 설정되며 때로는 클래스나 필드가 사용되기 전에 설정된다.
	static float pi = 3.14f;
	
	float getArea() {
		return newArea(f);
	}
	static float newArea(float a) {
		return pi * a* a;
	}
}
