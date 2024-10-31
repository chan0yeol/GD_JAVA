package com.area.calculation;

public class CirCle extends AreaImpl implements ICircle{
	
	public CirCle(int r) {
		super.x = r;
	}
	public CirCle() {
	}
	
	@Override
	public void cal(int x, int y) {
//		super.x = x;
//		super.y = y;
		super.result = x * y * PI;
	}
	
	
	// ICircle에 의해서 구현해야 하는 메소드
	@Override
	public void result(int r) {
		cal(r,r);
	}
	
}
