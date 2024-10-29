package com.exam.edu;

// TODO 001 DTO(Data Transfer Object = VO)
// 			두개의 실수값을 담고 있는 객체
public class ValueDto {
	private double m;
	private double n;
	
	//ValueDto는 생성시 무조건 멤버필드의 값을 담을 수 있도록 만듬
	// 생성자 오버로딩을 하겠다.
	public ValueDto(double m, double n) {
		super();
		this.m = m;
		this.n = n;
	}

	public double getM() {
		return m;
	}

	public void setM(double m) {
		this.m = m;
	}

	public double getN() {
		return n;
	}

	public void setN(double n) {
		this.n = n;
	}

	// TODO 004 자식의 객체를 출력할 때 toString() 요청된다.
	// 			부모의 toString Override 하여 VMI동작을 통해 자식 메소드가 호출되도록 하자.
	@Override
	public String toString() {
		System.out.println("부모의 toString() 자식에서만 실행 : " + super.toString());
		return String.format("m의 값은 %.2f, n의 값은 %.2f", this.m, this.n);
	}
	

	
}
