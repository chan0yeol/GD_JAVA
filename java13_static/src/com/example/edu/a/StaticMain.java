package com.example.edu.a;

public class StaticMain {
	public static void main(String[] args) {
		// TODO 001 static으로 선언된 멤버는 new를 하지 않아도 메모리에 할당되어 있기 때문에
//			// 		=> 속해있는 "클래스명.멤버"를 사용하여 호출 할 수 있다.
//					=> ex) String.valueOf(),  Character.getNumericValue()
		Static_IncludeClass.make();
		Static_IncludeClass.makeEtc();
		
		// TODO 002 non-static으로 선언된 클래스의 멤버는 사용하기 위해 new를 통해 객체를 생성 후
		// 			=> "객체명.멤버"를 사용하여 호출 할 수 있다.
		// 			Scanner scan = new Scanner(System.in);
//					scan.nextInt(); 
		Static_IncludeClass si = new Static_IncludeClass();
		si.makeA();
	}
}
