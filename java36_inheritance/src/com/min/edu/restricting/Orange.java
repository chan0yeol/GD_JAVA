package com.min.edu.restricting;


// TODO 00302 Fruit의 자식 클래스가 될 수 있는 클래스이고
/*
 * Orange는 다른 클래스의 부모 클래스가 될 수 없도록 선언
 * 옵션은 sealed의 대상이 되는 클래스는 옵션이 두개 중에 하나를 선택
 * 1) final : 더 이상 하위 클래슨느 없다.
 * 2) non-sealed : 다음 하위 클래스를 가질 수 있다.
 */
public final class Orange extends Fruit{
	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
