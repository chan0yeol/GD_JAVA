package com.min.edu;

public class Child extends AbstractParent {

	@Override
	public void make() {
		System.out.println("IParent > abstractParent > Child가 구현한 메소드");
	}

}
