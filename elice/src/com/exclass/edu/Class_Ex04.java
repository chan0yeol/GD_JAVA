package com.exclass.edu;

import java.util.Scanner;

class Circle {
	int r;
	static int cnt = 0;
    final double PI = 3.14;
	public Circle(int r) {
		this.r = r;
        cnt++;
	}
	//넓이
	public double w() {
		return PI*this.r*this.r;
	}
    //둘레
	public double d() {
		return 2*PI*this.r;
	}
	@Override
	public String toString() {
		return String.format("%d번원:반지름:%d, 넓이:%.2f, 둘레:%.2f",cnt, r,w(),d());
	}
	
}
public class Class_Ex04 {
	 public static void main(String args[]) {
		  Scanner scan = new Scanner(System.in);
		  int r = scan.nextInt();
		  Circle c1 = new Circle(r);
		  System.out.println(c1);
		  r = scan.nextInt();
		  Circle c2 = new Circle(r);
		  System.out.println(c2);
//		  System.out.println(3.14*r*r);
//		  System.out.println(2*3.14*r);
		 }
}
