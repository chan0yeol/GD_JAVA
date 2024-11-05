package com.min.edu;

/*
 * throws 현재에서 예외처리를 하지 않고
 * 외부에서 실행할 때 예외처리를 하여 호출해라
 *  ** 반드시 호출 한 곳에서 예외처리(try~catch) 코드를 작성해 주어야 한다.
 */
public class ExceptionMethod_Step07 {
	
	// 실질적으로 예외처리 하지 않고 throw를 통해서 makeException을 사용한 곳에서 try catch 문법을 작성하여 사용
	public void makeException() throws Exception {
		throw new Exception("사용자 예외 처리");
	}
}
