package com.min.edu.step05;

public class Generic_Main05 {
	public static void main(String[] args) {
		// TODO 00607 B의 T타입은 extends되어있는 A 또는 A의 자식클래스 만을 사용할 수 있다.
//		B<String> b = new B<>();
		
		// TODO 00611 사용되는 T 타입이 extends 되었다면 extends된 클래스의 멤버를 사용할 수 있다.
		Fruit banana = new Fruit();
		banana.name = "바나나";
		
		FruitBox<Fruit> box = new FruitBox<Fruit>(banana);
		System.out.println("담긴 과일 : " + box.getFruitName());
		
	}
}
