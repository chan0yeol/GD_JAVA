package com.example.edu;

public class Switch_Main {

	public static void main(String[] args) {
		
//		1) switch ~ case 조건 선택문인 if문과 다르게 한개의 값에 한개의 판단
//		   "한개의 값이고 한개의 판단
//			key와 value의 타입은 반드시 같은 타입이어야 한다.
//		 	key와 value 정수만된다.
//			java 1.7 이상부터는 String도 된다.
		
		int x= -1 ;
		switch(x) {
			case 0 : 
				System.out.println("이건 0");
				break;
			case 1 : 
				System.out.println("이건 1");
				break;
			default :
				System.out.println("숫자다");
		}
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		2) java 1.7 부터는 문자열(String)도 비교 가능하다.
		String fruit = "apple";
		switch(fruit) {
		case "apple" : 
			System.out.println("사과");
			break;
		case "orange" : 
			System.out.println("오렌지");
			break;
		default : 
			System.out.println("귤");
		
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		3) java 14 버전부터 case에 값이 아닌 표현식(값으로 평가되는 코드 비교 ==)가 사용가능
//		   => 입력이 가능하다.
		String result;
		int y = 2;
		switch (y) {
		case 1: {
			result = "case 1";
			break;
		}
		case 2: {
			result = "case 2";
			break;
		}
		case 3: {
			result ="case 3";
			break;
		}
		default: result = "case default";
			
		}
		System.out.println(result);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		// 화살표 레이블은 폴스루를 허용하지 않으므로 break; 를 사용하지 않는다.
		String result2;
		int z = 1;
		switch (z) {
		case 1 -> result2 = "case one";
		case 2,3 -> result2 = "case two or three";
		
		default -> result2 = "case defalut";
		}
		System.out.println("화살표 레이블 : "+result2);
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		int a = 2;
		String result3 = switch (a) {
				case 1 ->  "case one";
				case 2,3 -> "case two or three";
				
				default -> "case defalut";
		};
		System.out.println(result3);
	}

}
