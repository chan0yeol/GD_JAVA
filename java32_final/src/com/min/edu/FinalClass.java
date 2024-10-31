package com.min.edu;

//TODO 002 클래스에 final을 작성하면 해당 클래스는 부모클래스로 사용할 수 없다.
public /* final */ class FinalClass {
	
	public int[] refArray = new int[10];
	// TODO 006 멤버필드인데 참조타입을 선언하고 final을 사용한다면?
	public static final int[] arr = new int[3];
	//TODO 004 멤버필드에 final을 사용한다면 ?
//			   멤버필드는 객체가 생성될 때 초기화를 한다. 따라서 멤버필드에서는 final을 값의 변수에 사용할 수 없다.
	public static final int AGE;
	static {
		AGE = 100;
	}
	
	
	// TODO 001 메소드에서의 final은 오버라이드 금지 메소드로 
	public /* final */ String finalMethod( ) {
		
		return "finalMethod return";
	}

 
	public void change() {
		// TODO 003 local variable로 사용할 때 선언 후 값을 입력할 수 있다.
		final int a; 
		a = 10;
//		a = 20; // final로 선언된 변수는 값을 단 1 회 선언과 동시에 입력 할 수 있다. 재입력이 되지 않는다.
		System.out.println(a);
	}
}
