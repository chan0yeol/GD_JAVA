package com.exam.edu;

// TODO 002 ValueDto를 Argument로 입력받아 연산 후에 연산의 결과를 ValueDto로 만들어 반환
public class Object_Calculation {
	public static ValueDto add(ValueDto dto1, ValueDto dto2) {
		return new ValueDto(dto1.getM() + dto2.getM(), dto1.getN() + dto2.getN()); 
	}
	
	public static ValueDto minus(ValueDto dto1, ValueDto dto2) {
		return new ValueDto(dto1.getM() - dto2.getM(), dto1.getN() - dto2.getN()); 
	}
}
