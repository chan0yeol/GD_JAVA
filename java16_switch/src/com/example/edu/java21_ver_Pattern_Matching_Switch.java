//package com.example.edu;
//
///**
// * java 17 에서 미리보기 기능으로 나옴
// * switch 문 및 표현식에 대한 패턴 일치 방식이 추가됨
// * java 21 에서 동작
// * 
// * @author GD
// *
// */
//// java 21버전
//public class java21_ver_Pattern_Matching_Switch {
//	public void pattern_check() {
//		Object obj = 5l; // long 타입 리터럴
//		String myType = switch (obj) {
//			case null ->  "null";
//			case Integer i ->  "Integer is " + i;
//			case Long l -> "Long is" + l;
//			default -> obj.toString();
//		};	
//		System.out.println("입력된 타입의 결과는?" + myType); // Long is 5
//	}
//	
//	
//}
