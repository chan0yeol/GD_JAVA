package com.example.edu.compare;
// 1. 객체는 new를 통해서만 생성할 수 있다.
// 2. 객체를 생성하면 항상 새로운 주소/hashcode를 부여 받는다.
// 3. 특징(멤버필드의 값)이 같다고 해서 같은 객체라고 이야기 할 수 없다.
// 4. 대입연산을 통해서 전달 받는 것은 주소
public class PublicClassMain {
	public static void main(String[] args) {
		A a1 = new A(); // r01, h0A
		A a2 = new A();
		
		System.out.println(a1);
		
		System.out.println("a1의 멤버필드 name : " +a1.name);
		System.out.println("a2의 멤버필드 name : " +a2.name);
		
		System.out.println("==을 통해 a1과 a2의 주소를 비교 : " + (a1==a2));

		System.out.println("String.hashcode()");
		System.out.println("a1.hashcode : " + a1.hashCode());
		System.out.println("a2.hashcode : " + a2.hashCode());
		// == 
		System.out.println("a1.name == a2.name : " + (a1.name == a2.name));
		
		// equals
		System.out.println("a1.equals(a2) : " + a1.equals(a2));
		System.out.println("a1.name.equals(a2.name) : " + a1.name.equals(a2.name));
		
		
		
		
	}
}
