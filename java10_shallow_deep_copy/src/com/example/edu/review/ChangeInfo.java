package com.example.edu.review;
/*
 * TODO 002 pass by reference의 객체(InfoVo)를 받아서 name을 변경하는 메소드 클래스
 */
public class ChangeInfo {
	/**
	 * InfoVo를 입력받아 멤버필드의 name값을 변경하는 메소드
	 * @param 사용자 정보 객체(name, age, address)
	 */
	public static void infoInput(InfoVo info) {
		info.name = "고길동";
		info.age = 42;
		info.address ="서울시";
	}
}
