package com.min.one;

// TODO 003 외부클래스에서 MyClass의 객체를 생성하여 호출한다면?
//			접근할 수 있는 접근제한자는 public, default, protected
//			같은 package에선 default와 protected는 public로 동작한다.
public class ExternalClass {
	
	public void exMyClass() {
		MyClass my = new MyClass();
		my.publicMethod();
		my.defaultMethod(); // 같은 패키지 public 으로 동작
		my.protectedMethod(); // 같은 패키지 public 으로 동작
//		my.private() 접근 불가
	}
}
