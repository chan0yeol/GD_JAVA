package com.min.one;

// TODO 00501 같은 패키지 이면서 extends로 되어있기 때문에 new를 하지 않아도 된다.
public class ExternalChildClass extends MyClass {
	
	// TODO 00502 extends MyClass는 확장 되어 있는 부모클래스 이기 때문에\
//				  부모클래스가 자식클래스에서 사용 될 수 있는 여부를 접근제한자로 나타내게 된다.
//				  new를 하지 않지만 사용할 수 있는 이유는 extends를 통해서 부모를 확장했기 때문에
//				  부모가 가지고 있는 public default protected를 사용할 수 있다.
//				  단 같은 패키지 일때.
	public void test() {
		publicMethod();
		defaultMethod(); // extends 때문에 아니라 extends한 파일이 같은 패키지에 있기 때문에
		protectedMethod();
	}
}
