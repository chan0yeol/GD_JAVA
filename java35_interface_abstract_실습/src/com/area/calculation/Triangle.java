package com.area.calculation;

/**
 * 삼각형의 면적을 계산
 */
public class Triangle extends AreaImpl{
	// 면적
	@Override
	public void cal(int x, int y) {
		super.x = x;
		super.y = y;
		super.result = x*y*0.5;				
	}
	
}
