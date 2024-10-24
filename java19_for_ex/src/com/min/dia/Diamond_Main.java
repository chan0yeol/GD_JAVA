package com.min.dia;

import com.util.edu.EducationUtility;

public class Diamond_Main {
	public static void main(String[] args) {
		int check = 1;
		do {
			System.out.println("1번 다이아몬드, 2번 모래시계");
			// 스캐너
			int choice = EducationUtility.getNumericValue();
			System.out.println("원하는 층수는 ?");
			int stage = EducationUtility.getNumericValue();
			Diamond p = new Diamond();
			switch (choice) {
			case 1:
				p.diamond(stage);
				break;
			case 2:
				p.sandClock(stage);
				break;
			default:
				System.out.println("아직 준비중인 기능입니다.");

			}
			System.out.println("1.종료, 2.재시작");
			check = EducationUtility.getNumericValue();
		} while (check == 2);
		
	}
}
