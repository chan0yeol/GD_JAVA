package com.min.edu;

/*
 * 삼각형을 계산하여 면적으로 출력해 주는 클래스
 */
public class Triangle {
	public int x; // 높이
	public int y; // 밑변
	public double res; // 면적결과
	
	
	public void cal() {
		res = x*y*0.5;
	}
	public void print() {
		System.out.printf("%d와 %d의 면적 결과는 %f\n",x, y, res);
	}
	
}
