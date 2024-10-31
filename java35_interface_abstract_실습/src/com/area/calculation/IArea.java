package com.area.calculation;

public interface IArea {

	
	
	/**
	 * x와 y의 정수값을 입력받아 면적 계산하는 메소드
	 * @param x 값, 밑변, 반지름
	 * @param y 값, 높이
	 */
	public void cal(int x, int y);
	
	/**
	 * 면적의 결과를 출력하는 메소드
	 */
	public void print();
	
}
