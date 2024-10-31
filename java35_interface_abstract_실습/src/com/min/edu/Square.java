package com.min.edu;

public class Square {
	public int x; // 높이
	public int y; // 밑변
	public double res; // 면적결과
	
	
	public void cal() {
		res = x*y;
	}
	public void print() {
		System.out.printf("%d와 %d의 면적 결과는 %f\n",x, y, res);
	}
	
}
