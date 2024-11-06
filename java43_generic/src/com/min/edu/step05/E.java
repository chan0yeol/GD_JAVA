package com.min.edu.step05;

// TODO 00606 제네릭의 타입이 2개가 필요한 경우 ,(comma)를 통해서 구분하여 사용한다.
public class E <T extends A&I, U extends A & I> {
	private T m;
	private U n;
}
