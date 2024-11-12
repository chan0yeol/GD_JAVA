package com.min.edu.step02;

/*
 * 람다 실행 블럭 ({ }) 에서는 
 * 클래스인 멤버필드와 메소드를 제약없이 사용가능하다.
 * this를 사용시 람다식의 실행 객체를 참조하게 된다.
 */
public class LamdaExam01_Inner {
	public int memberField = 10;
	
	class Inner {
		int innerField = 20;
		
		void method() {
			// 람다식 작성
			/* 람다 표현식에서
			 * arguments가 없다면 () 작성
			 * 기능이 많다(단일 X) { } 작성
			 */
			MyFunction f = () -> {
				System.out.println("memberField" + memberField);
				System.out.println("innerField" + LamdaExam01_Inner.this.memberField);
				
				System.out.println("innerField" + innerField);
				// 람다 표현식 내부에서 this는 Inner객체를 참조하게 된다.
				System.out.println("innerField" + this.innerField);
				
			};
			f.method();
		}
	}
}
