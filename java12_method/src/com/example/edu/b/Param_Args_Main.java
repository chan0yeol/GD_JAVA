package com.example.edu.b;

public class Param_Args_Main {
	public static void main(String[] args) {
		Parameter_Arguments pa = new Parameter_Arguments();
//		 TODO 003 Arguments는 호출하고자 하는 메소드를 실행때 전달해 주는 값
//				전달받은 메소드는 선언(작성) 할 때 필요한 타입을 포함하여 작성해야 한다.
		String str = "고길동"; 
		pa.you_Name(str); // 고길동은 Parameter_Arguments의 클래스 기능인 you_Name를 실행시키기 위한 필수 arguments
	}
}
