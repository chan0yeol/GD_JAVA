package com.min.edu.step04;

public class Generic_Main04 {


	public static void main(String[] args) {
		DeleteType<String> myMhod = new DeleteType<>();
		myMhod.myMethod("hello world!!!!");
		
		DeleteType<Integer> myInt = new DeleteType<>();
		myInt.myMethod(1234);
		

		
	}
}
