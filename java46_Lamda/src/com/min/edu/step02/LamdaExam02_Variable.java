package com.min.edu.step02;

public class LamdaExam02_Variable {

	void method(int age) { // 메소드의 final 특징을 가짐 Override 안됨
		int localVariable = 10; // 변수의 final 특징을 가짐 : 값이 재입력되지 않음 / 주소 고정
		
		// 람다에서 사용되는 모든 변수는 final로 정의된다.
//		age = 10; // age = parameter이지만 값이 고정되어 버린다. final됨
//		localVariable = 40;
		
		MyFunction f = () -> {
			System.out.println("age:"+age);
			System.out.println("localVariable" + localVariable);
		};
 		
		f.method();
	}
}
