package com.min.edu.step02;

import com.min.edu.step02.LamdaExam01_Inner.Inner;

public class LamdaMain {
	public static void main(String[] args) {
		LamdaExam01_Inner lamdaExam01 = new LamdaExam01_Inner();
		Inner inner = lamdaExam01.new Inner();
		
		LamdaExam01_Inner.Inner inner02 = lamdaExam01.new Inner();
		
		inner.method();
		inner02.method();
		System.out.println(" ---- -- -- -- - - - -- ---- --- --- -- ");
		LamdaExam02_Variable lv = new LamdaExam02_Variable();
		lv.method(22);
	}
}
