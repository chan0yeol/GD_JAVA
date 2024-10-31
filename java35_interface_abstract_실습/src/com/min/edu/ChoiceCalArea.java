package com.min.edu;

import java.util.Scanner;

public class ChoiceCalArea {
	public void choiceShape() {
		System.out.println("Shape을 선택해 주세요");
		System.out.println("1. 삼각형 2. 사각형");
		Scanner scan = new Scanner(System.in);
		int ch = scan.nextInt();
		
		switch (ch) {
		case 1: {
			Triangle t = new Triangle();
			t.x = 10;
			t.y = 10;
			t.cal();
			t.print();
			break;
		}
		case 2:
			Square s = new Square();
			s.x = 10;
			s.y = 10;
			s.cal();
			s.print();
		}
	}
}
