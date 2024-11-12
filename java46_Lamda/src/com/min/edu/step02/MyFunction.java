package com.min.edu.step02;

//TODO 00401 @FunctionalInterface 
	/*
	 * java8에서 도입된 annotation으로
	 * 람다표현식과 메소드를 참조할 수 있는 단일 추상 메소드 인터페이스를 정의 할 때
	 *  @FunctionalInterface 선언된 인터페이스는
	 *  1) 람다에서 사용할 단 "한개의 추상메소드를 가질 수 있다."
	 */
@FunctionalInterface
public interface MyFunction {
	void method();
}
