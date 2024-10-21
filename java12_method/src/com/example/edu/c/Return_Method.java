package com.example.edu.c;

// TODO 004 리턴타입
// 리턴타입은 void와 타입(기본타입, 참조타입)을 작성할 수 있다.
// - 반환타입이 없는 메소드는 void로 선언한다. 
// - 반환타입이 있을경우 실행 후 반드시 호출한 곳으로 전달한다. return
public class Return_Method {
	/**
	 * 이름(String)과 나이(int)를 Argument로 입력받아 String문장으로 리턴하는 메소드
	 * @param name String
	 * @param age int
	 * @return 나의 이름은 000 이고 나이는 000 이다.
	 */
	public String returnValue(String name, int age) {
		String tmp = "";
		tmp = String.format("나의 이름은 %s 이고 나이는 %d 이다", name,age);
		return tmp;
	}
	
	public String returnValue2(String name, int age) {
		return String.format("나의 이름은 %s 이고 나이는 %d 이다", name,age);
	}
	
	// TODO 005 skip return 처리
	/**
	 * 반환타입이 없는 메소드에서 
	 * return은 끝의 블럭(})에 도달하기 전 종료한다.
	 * void에서도 사용할 수 있다.
	 * 중간에 메소드를 종료
	 * @param s
	 */
	public void myPrint(String s) {
		if(s == "") {
				return;
		}
		System.out.println(s + "입력 받음");
	}
}
