package com.area.calculation;

/**
 * 면적 계산에 필요한 공통 멤버를 선언한다.<br>
 * 입력 x, y <br>
 * 최종결과 result
 *
 */
public abstract class AreaImpl implements IArea {
	
	protected int x;
	protected int y;
	
	protected double result;
	
	
	@Override
	public abstract void cal(int x, int y);

	@Override
	public void print() {
		System.out.printf("%d와%d의 면적결과는 %.2f\n",x,y,result);
	}

}
