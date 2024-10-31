package com.min.edu;

import com.min.edu.IGame.HelperClass;

public class InterfaceRunMain {

	// TODO 005 각 Interface의 멤버필드의 접근과 구현된 추상메소드의 호출
	public static void main(String[] args) {
		// interface에 선언된 멤버필드의 형태, static final
		System.out.println(IGame.age);
		System.out.println(IGame.name);
		System.out.println(IGame.val);

		// 일반클래스는 생성자를 통해서 객체화
		// 변할 수 있는 "타입"은 3개가 있다.
		GameImpl g = new GameImpl();
		IGame ig = g;
		IGame_Bin bg = g;
		IGame_Conf cg = g;

		// 타입이 추상메소드를 가지고 있는 IGame으로 변경했지만 (up casting)
		// 자식 클래스인 GameImpl 에서 Override 했기 때문에 자동으로 구현되어 있는 자식 메소드를 실행 VMI
		ig.makeA();
		ig.makeB();
		ig.printConf();

		// printConf() 는 IGame_Bin interface가 가지고 있는 추상메소드
		// 생성된 GameImpl을 up casting하여 IGame_Bin로 타입을 변경하면
		// 보여지는 메소드는 IGame_Bin의 메소드인 printConf 보여지게 된다.
		// 실행하면 VMI 구현되어 있는 GameImpl을 실행시킨다.
		bg.printConf();
		// -------- 추가된 주요 기능 -----------//
		g.print(" IGame에 interface에 구현한 공통 메소드");
		g.print(" default 메소드는 공통 기능을 구현할 때 사용한다.");

		// --------------------------------- //
		int res = IGame.sum(100);
		System.out.println("intefer의 static 메소드 사용 : " + res);

		// --------------------------------- //
		g.printString();
		
		// --------------------------------- //
		HelperClass hc = new HelperClass();
		hc.helpMethod();

	}
}
