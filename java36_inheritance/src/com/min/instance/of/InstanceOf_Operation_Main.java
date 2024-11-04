package com.min.instance.of;

public class InstanceOf_Operation_Main {

	public static void main(String[] args) {
		//TODO 00401 Apple은 Fruit의 자식 클래스이다.
		//			 Vegetable은 Fruit의 자식 클래스이다.
		// 			 하지만 Apple이 Vegetable
		Apple a = new Apple();
		Apple b = new Apple();
		// 객체는 Apple이지만 타입은 부모 타입인 Fruit으로
		Fruit f = a; 
		
		// 생성된 원래 기존의 형태로만 타입을 변경할 수 있다.
		// Apple -> Fruit -> Vegetable => ClassCastException 발생
//		Vegetable v = (Vegetable) f;
		System.out.println(b.hashCode());
		System.out.println(a.hashCode());
		System.out.println(f.hashCode());
		if(f instanceof Apple) { // f가 Apple로 변경이 될 수 있나?
			Apple myApple = (Apple)f; // down casting 원래 자식의 형태로 변경
			System.out.println("f는 사과가 될 수 있다." + myApple);
		} 
		
		if(f instanceof Apple myApple) { // 일반적으로 casting과 같이 사용
			System.out.println("f는 원래 사과");
		}
		
		if(!(f instanceof Vegetable)) {
			System.out.println("f의 이전 형태는 채소가 아니다 vegetable");
		}
		
	}

}
