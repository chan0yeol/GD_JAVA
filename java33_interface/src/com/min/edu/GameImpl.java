package com.min.edu;

// TODO 004 GameImpl은 공통값과 구현해야할 기능을 
//			가지고 있는 IGame interface를 implements 하고 있는 일반 클래스
public class GameImpl implements IGame{
	
	// IGame_bin에서 선언한 추상메소드의 구현
	@Override
	public void printConf() {
		System.out.println("GameImpl이 구현한 IGame_bin > printConf()");
	}
	
	//IGame 에서 선언한 추상메소드의 구현
	@Override
	public String makeA() {
		System.out.println("GameImpl이 구현한 IGame > makeA()");
		return null;
	}
	
	//IGame 에서 선언한 추상메소드의 구현
	@Override
	public String makeB() {
		System.out.println("GameImpl이 구현한 IGame > makeB()");
		return null;
	}
}
