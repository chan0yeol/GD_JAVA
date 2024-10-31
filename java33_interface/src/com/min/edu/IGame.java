package com.min.edu;

//TODO 003 IGame 게임의 기능을 정의 하는 interface 
public interface IGame extends IGame_Conf, IGame_Bin {

	// interface에서 사용할 수 있는 접근제한자는 public,default
	public int age = 100;
	String name = "큐피트";

	// interface는 반드시 다른 일반 클래스에서 implements
	// 하여 사용이 기본이기 때문에 private은 의미상 기능에 맞지 않다.
	// private int num = 200;
	// 전제 조건이 implements라고 상속을 기반으로 하기 때문에 명시적으로 protected를 사용하지 않음.
	// protected String addr = "서울시";

	// 추상메소드의 집합체 란?
	// 추상메소드는 메소드 구성에서 {} 가 없는 메소드를 얘기한다. -> 선언되어 있는 메소드
	public String makeA();

	String makeB();

	// TODO 006 java1.8에서 인터페이스에 기본메소드를 정의 하는 기능이 추가
	// 메소드는 "기본키워드(default 예약어)"를 사용하여 지정된 인터페이스 내부 "구현"을 포함
	// 구현(implements)한 클래스에서 재정의(Override)하지 않는 한 기본 메소드가 사용된다.
	// 사용하는 이유 : 인터페이스를 사용하는 기존 클래스를 손상시키지 않고 인터페이스에 새 메소드를 추가 할 수 있다.
	default void print(String a) {
		System.out.println("interface 일반(default) 메소드" + a);
	}

	// TODO 007 java1.8 에서 정적 인터페이스 메소드
	// 정적 클래스 메소드와 유사하게 이러한 메소드는 인터페이스에 속하여
	// 속해 있는 interface의 이름으로(context) 에서만 호출이 가능하다.
	static int sum(int n) {
		return n + 10;
	}

	// TODO 008 java9 static메소드를 내부에서만 사용할 수 있도록 되었다.
	//
	private static String getString() {
		return "내부 private static ";
	}
	
	default void printString() {
		System.out.println("호출 : "+getString());
	}
	
	// TODO 009 interface 내부에서 class를 생성하여 사용할 수 있다.
	class HelperClass{
		public void helpMethod( ) {
			System.out.println("interface 안에 속해있는 내부클래스(innerclass)");
		}
	}
}// main class end
