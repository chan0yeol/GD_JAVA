package com.min.edu.inner;


// TODO 010 인터페이스 내에 인터페이스를 포함하고 있는 interface
public interface IShow {

	void show();
	
	// 내부 interface
	interface InnerMessage{
		void msg();
	}
}
