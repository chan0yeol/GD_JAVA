package com.exam.edu;

import java.util.Random;

public class Calculation_Main {
	
	// TODO 003 ValueDto의 객체를 값(double)입력하여 생성하고 
//			연산을 통해 결과를 확인해 보자.
	public static void main(String[] args) {
		ValueDto dto1 = new ValueDto(10, 5);
		ValueDto dto2 = new ValueDto(2, 3);
		
		ValueDto addResult = Object_Calculation.add(dto1, dto2);
		ValueDto minusResult = Object_Calculation.minus(dto1, dto2);
		
		System.out.println(addResult.getM());
		System.out.println(addResult.getN());
		// 객체를 출력하면 java.lang.Object의 toString()
		// getClass().getName()+"@"+16진수 hashcode
		System.out.println(addResult.toString());
		System.out.println();
		
		
		

		
		
	}

}
