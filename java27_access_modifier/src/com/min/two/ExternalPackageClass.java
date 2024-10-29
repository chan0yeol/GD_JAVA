package com.min.two;

import com.min.one.MyClass;

public class ExternalPackageClass {
	// TODO 004 패키지가 다른 경우 new를 했을때 외부에서 호출할 수 있는 접근제한자는 ?
//				=> com.min.one에 있는 클래스를 com.min.two에서 객체를 생성하여 호출
//				=> 다른 패키지에서 생성하여 호출
	public void exTest() {
		MyClass my = new MyClass();
		my.publicMethod(); // package가 다를 경우 public만 호출이 가능하다.
		
		// default와 protected는 외부 package에서 new를 헀을 경우 private처럼 호출이 되지 않는다.
		// private은 당연히 안된다.
		
	}
}
