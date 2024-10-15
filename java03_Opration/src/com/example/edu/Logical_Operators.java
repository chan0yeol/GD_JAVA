package com.example.edu;

// TODO 004 논리 연산자
public class Logical_Operators {
	public void logical() {
		boolean b1 = true & false; // 두개가 같냐 ? false
		boolean b2 = true | false; // 두개중에 참이 있냐 ? true
		boolean b3 = !(true); // 부정연산자 ! 사용 false

		System.out.println(5 & 2);
		System.out.println(5 | 2);
	}

	// short circuit (&&, ||)
	public void shortCircuit() {
		// & 선행의 결과와 상관 없이 연산하기 때문에 선행 후행 모두 실행됨
//		boolean isc1 = returnTrue() & returnFalse(); // returnTrue 실행 returnFalse 실행
//		boolean isc2 = returnFalse() & returnTrue(); // returnFalse 실행 returnTrue 실행
		
		// && 선행의 결과(true/false)에 따라서 후행의 동작을 하지 않는다.
		boolean isc3 = returnTrue() && returnFalse(); // returnTrue 실행 returnFalse 실행
		boolean isc4 = returnFalse() && returnTrue(); // returnFalse 실행

		
		
	} // shortCircuit end

	private boolean returnTrue() {
		System.out.println("returnTrue 메소드 실행");
		return true;
	}

	private boolean returnFalse() {
		System.out.println("returnFalse 메소드 실행");
		return false;
	}
}
