package com.min.edu;

//TODO 00103 Generic을 사용하여 Printer는 반드시 Animal의 자식들만 사용하여 출렬될 수 있도록
public class Printer <T extends Animal> {

	private T prinerValue;

	public Printer(T prinerValue) {
		super();
		this.prinerValue = prinerValue;
	}
	
	public void print() {
		System.out.println("무엇이든 Animal 자식 클래스는 출력 가능 : "+prinerValue);
	}
}
