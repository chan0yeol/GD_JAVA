package com.min.edu.step02;

// TODO 00302 제네릭 메소드 생성자 호출
public class Generic_Main02 {

	public static void main(String[] args) {
		MyGenericClass mgc = new MyGenericClass(10);
		MyGenericClass mgc2 = new MyGenericClass(3.14);
		System.out.println(mgc.getS()); // 숫자(정수)를 입력받아 문자열로 출력
		System.out.println(mgc2.getS());
		Boolean[] boolArr = {true,true,false,false,true};
		MyGenericClass.printArray(boolArr);
		// 필요시 명확한 타입을 정의하기 위해서 제네릭을 작성
		MyGenericClass.<Boolean>printArray(boolArr);
	}
}
