package com.min.edu;

import java.util.Arrays;

public class FinalMain {

	public static void main(String[] args) {
		// TODO 005 static으로 선언된 멤버필드는 해당 클래스에서
//					Application이 실행되면 가장 먼저 실행되는 static 생성자를 통해서 1회만 입력이 가능하다.
		
		System.out.println(FinalClass.AGE);
//		FinalClass.AGE = 110;
		
		// TODO 007 멤버필드의 객체 타입으로 되어 있는 final을
		//			객체는 변수에 주소를 담고, 주소가 고정된다.
		System.out.println(Arrays.toString(FinalClass.arr));
		FinalClass.arr[0] = 100;
		System.out.println(Arrays.toString(FinalClass.arr));
		
//		FinalClass.arr = new int[10]; 불가하다.
		
		FinalClass f = new FinalClass();
		System.out.println(f.refArray.length);
		f.refArray = new int[5];
		System.out.println(f.refArray.length);
		
	
		
	}
}
