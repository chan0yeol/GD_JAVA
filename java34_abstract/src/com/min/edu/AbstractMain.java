package com.min.edu;

public class AbstractMain {

	public static void main(String[] args) {
		Child c = new Child();
		c.make(); // Child
		c.print(); // AbstractParent
		
		IParent p = c;
		// p.make와 p.print는 VMI에 의해서 실행되는 타입은 IParent이지만
		// 실행되는 메소드는 print()는 AbstractParent에 Override되어있고, make()는 Child에 Override되어 있는 메소드가 실행된다.
		p.make(); 
		p.print();
		
	}
}
