package com.eliceextends.edu;

import java.util.Scanner;

public class Extends_ex01 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		Point3D p = new Point3D(x, y, z);
		System.out.println(p.location());
	}
}

class Point {
	protected int x;
	protected int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	String location() {
		return "x=" + x + ",y=" + y;
	}
}

class Point3D extends Point {
	private int z;

	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	@Override
	String location() {
		return super.location() + ",z=" + z;
	}

}
