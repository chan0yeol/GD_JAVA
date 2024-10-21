package com.example.edu.review;

/*
 * 1). pass by reference는 주소를 전달한다. 따라서 주소를 가지고 있는 
 * 	   모든 곳에서(class 혹은 위치에 상관 없이) 처음의 값이 변경됨.
 * 2). pass by value (기본타입, byte short int long float double boolean char)
 *     는 값을 복제한다. 
 *     => 값을 복제하여 전달하기 때문에 입력된 원본의 값과 상관 없이 전달됨
 * 3). static
 * 	   => static으로 선언된 멤버(필드, 메소드)는 메모리에 공개되기 때문에 new를 하지 않고
 * 		  클래스명.멤버 를 통해 호출 할 수 있다.
 */
public class PrintMain {

	public static void main(String[] args) {
		InfoVo info = new InfoVo();
		
		info.name = "토마토";
		info.age = 123;
		info.address = "케찹";
		
		// 부모의 toString() 을 override하지 않았기 때문에
		// getClass().getName()@16진수hashcode
		
		System.out.println(info);
		info.infoPrint();
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		// 1) pass by reference에 의해서 infoInput에 의해서 변경이 되면
		//    현재 클래스가 아니지만 전달된 주소에 의해서 info 객체가 변경된다.
		ChangeInfo.infoInput(info);
		info.infoPrint();
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
//		2) pass by value에 의해서 전달된 argument는 값을 복제해서 전달.
//		따라서 현재의 클래스 값은 영향을 받지 않음.
		int v = 100; 
		ChangePrimitive.chanyeVal(v);
		System.out.println(v);
	}

}
