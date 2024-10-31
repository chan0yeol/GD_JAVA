package com.min.edu.inner;

public class NestedIntefaceMain {
	public static void main(String[] args) {
		IShow.InnerMessage is = new NestedInterfaceImpl();
		is.msg();
		NestedInterfaceImpl nest = new NestedInterfaceImpl();
		nest.msg();
	}
}
