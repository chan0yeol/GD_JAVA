package com.min.edu.restricting;

// TODO 00301 sealed 클래스에서 작성을하면 반드시 해당 제한적으로 받을 수 있는 자식클래스가 있어야 한다.
/*
 * sealed 란? 
 * 클래스의 문제인 모든 final을 선언하지 않으면 모든 클래스의 extends의 대상이 될 수 있다.
 * 클래스에 sealed 선언을 통해서 제한적으로 특정 클래스에만 해당 클래스를 extends 할 수 있도록 한다.
 */
public sealed class Fruit permits Orange, Lemon {
	
	public void print() {}
}
