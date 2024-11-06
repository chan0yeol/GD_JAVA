package com.min.edu.step05;

// TODO 00609 Fruit타입만을 입력 받아 사용할수 있는 T 타입 클래스
public class FruitBox<T extends Fruit> {
	private T box;

	public FruitBox(T box) {
		this.box = box;
	}
	
	public String getFruitName() {
		// TODO 00610 T가 Fruit을 확장함으로 Fruit의 멤버 사용이 가능하다.
		return box.name;
	}
	
	
}
