package com.area.calculation;

public class Square extends AreaImpl{
	
	// 면적
	@Override
	public void cal(int x, int y) {
		super.x = x;
		super.y = y;
		super.result = x*y;
	}
}
