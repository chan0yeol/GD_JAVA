package com.goo.dee;

//TODO 003 import를 확인하기 위한 main 메소드를 포함하고 있는 클래스
import com.example.edu.DataType;

public class DataTypeMain {

	// TODO 004 com.example.edu.DataType의 클래스 들을 생성하여 호출 하거나 호출하기 위한 실행메소드
	// jvm 이 처음 자동으로 호출하는 메소드
	public static void main(String[] args) {
		DataType dt = new DataType(); // 클래스를 사용하기 위해 메모리에 올리는 방법 new = instance화 객체생성
//		dt.declaring_assignment(); // 호출
		dt.charType();
	}

}
