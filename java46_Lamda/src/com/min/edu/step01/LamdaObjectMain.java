package com.min.edu.step01;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class LamdaObjectMain {

	public static void main(String[] args) {
		// TODO 002 람다표현식을 이용하여 인터페이스의 기능을 정의한다.
		/*
		 * 1) 기존의 interface를 new를 통해 사용하려면 사용하는 곳에서 클래스 영역({ }) 내부에서 해당 추상 메소드를 구현해야 한다.
		 */
//		ILamdaObejct lamda = new ILamdaObejct() {
//			@Override
//			public int combine(int a, int b) {
//				return a+b;
//			}
//		};
		/*
		 * 2) 람다 표현식을 Override 하여 body(block)를 구현해야 한다.
		 */
		ILamdaObejct lamda = (x, y) -> x + y;
		int res = lamda.combine(10, 20);
		System.out.println("람다로 전달된 표현식 실행 : " + res);
		
		// TODO 003 인터페이스를 통해서 매번 구현체를 만들어 사용하지 않고
		/* 
		 * 공통 인터페이스인 java.util.function 패키지에 정의
		 */
		BinaryOperator<Integer> add = (x,y) -> x+y;
		int sum = add.apply(10, 20);
		System.out.println("java.util.function 정의"+sum);
		
		UnaryOperator<Integer> fn01 = x -> x*2;
		int p = fn01.apply(10);
		System.out.println(p);
	}
}
