package com.min.two;

import com.min.one.MyClass;

// TODO 00601 extends를 하는 Class가 부모 클래스와 다른 패키지에 있다면?
public class ExternalPackageChildClass extends MyClass {

	// TODO 00602 extends한 MyClass가 가지고 있는 메소드의 사용
//				  MyClass 부모 클래스이고 부모클래스가 가진 멤버는 접근제한자에 따라서 사용 여부
//				  default는 무조건 소속된 package의 여부를  따라간다
//				  MyClass com.min.one에 있고 ExternalPackageChildClass는 com.min.two에 있다.
//					=> default는 접근이 될 수 없다.
	public void test() {
		
		publicMethod();
		protectedMethod();
		// 따라서 private는 선언되어 있는 내부에서만 호출이 가능하다.
		// default는 new이던 extends이던 같은 패키지 내에서만 호출이 가능하다.
	}
}
