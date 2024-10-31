package com.area.calculation;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 각 면적계산의 클래스를 선택적으로 생성하여 객체를 반환함.
 */
public final class ChoiceArea {
	
//	private static ChoiceArea factor;
//	
//	private ChoiceArea() {
//		
//	}
//	
//	public  static ChoiceArea getInstance() {
//		if(factor == null) {
//			factor = new ChoiceArea();
//		}
//		return factor;
//	}
//	
	public static AreaImpl choiceShape() {
		AreaImpl obj = null;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("선택해주세요 1. 삼각형 2. 원형 3. 사각형");
		
//		switch(scan.nextInt()) {
//		case 1: 
//			obj = new Triangle();
//			break;
//		case 2: 
//			obj = new CirCle();
//			break;
//		case 3 :
//			obj = new Square();
//			break;
//		}   
		
		switch(scan.nextInt()) {
		case 1 ->  obj = new Triangle();
		case 2 -> obj = new CirCle(10);
		case 3 -> obj = new Square();
		}  
		
	
		return obj; // 사용자가 생성한 객체가 상위 객체로 변경되 반환
	} // choiceShape end
	
	public static void delegater(AreaImpl areaImpl) {
		if(areaImpl == null) {
			System.out.println("관리자에게 문의하셈");
		} else {
			areaImpl.cal(10, 10);
			areaImpl.print();
		}
	}
}
