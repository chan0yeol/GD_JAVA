package com.min.edu;

/*
 * Enum에 따른 값 설정
 * 필드에 값을 설정하려면 생성자를 추가 해야 한다.
 * 열거형 생성자는 항상 비공개이며 일반 클래스와 같은 방식으로 호출되지 않는다.
 */
public enum Speed_Value {
	
	STOP(0), SLOW(5), NOMAL(10), FAST(20);
	
	public int velocity;
	
	private Speed_Value(int s) {
		velocity = s;
	}

}
