package com.min.edu;

// TODO 002 interface를 implement 하고 있는 일반 클래스
//			반드시 interface의 추상메소드를 구현 해야한다.
public abstract class AbstractParent implements IParent{

	public int x = 100, y=100;
	
	
	// 공통기능으로 사용하기 위한 print 메소드를 구현
	@Override
	public void print() {
		System.out.printf("x: %d | y:%d\n",x,y);
	}
	// interface의 구현 기능을 현재 클래스에서 구현하지 않고 또 다시
	// 현재 클래스를 extends한 클래스에 구현을 강요하겠다.
	@Override
	public abstract void make();
	
	
	
	
	
}
