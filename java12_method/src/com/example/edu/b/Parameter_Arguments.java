package com.example.edu.b;

// TODO 002 Parameter란? 메소드를 실행시키기 위한 필수 전달 값을 갖고 있는 변수

public class Parameter_Arguments {
	// 외부에서 문자열(String)의 이름을 입력받아 name의 parameter명에 저장후
	// name을 사용하여 "당신의 이름은 000입니다."를 출력하는 메소드를 만들어 보자.
	public void you_Name(String name) {
		System.out.println("당신의 이름은 \"" + name + "\" 입니다.");
	}
}
