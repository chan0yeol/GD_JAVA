package com.min.edu.inner;

public class NestedInterfaceImpl implements IShow.InnerMessage {

	@Override
	public void msg() {
		System.out.println("hi");
	}
}
