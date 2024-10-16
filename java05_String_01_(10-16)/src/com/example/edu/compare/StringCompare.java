package com.example.edu.compare;


//TODO 003 String 생성방법과 생성된 String객체의 비교
public class StringCompare {
	/*
	 * 생성방법
	 * 1) 선언방법 : String str1 = "hppaY";
	 * 2) 객체화방법 : String str2 = new String("happy");
	 */
	public static void main(String[] args) {
		String str1 = "happy"; 
		String str2 = str1; // pass by reference 으로 되지 않고 값을 전달한 것 처럼 보임.
		String str3 = "happy"; // 객체를 생성하면 새로운 "주소"와 "Hashcode"를 부여
		String str4 = new String("happy"); // 선언방법과 new로 생성한 객체를 서로 같은것인가?
		
		String str5 = "hap"+"py"; // 리터럴과 같은 연산 // 연산이 끝난시점의 값으로 만들어 짐
		
		String tmp1 = "hap";
		String tmp2 = "py";
		String str6 = tmp1+tmp2; // 변수를 concat // new String 한것과 같음.
		
		String str7 = null;
		str7 = "happy"; 
		
		String str8;
		str8 ="happy"; 
		System.out.println("o(*￣▽￣*)ブo(*￣▽￣*)ブo(*￣▽￣*)ブ");
		System.out.println("String.hashcode()");
		System.out.println("str1:"+str1.hashCode());
		System.out.println("str2:"+str2.hashCode());
		System.out.println("str3:"+str3.hashCode());
		System.out.println("str4:"+str4.hashCode());
		System.out.println("str5:"+str5.hashCode());
		System.out.println("str6:"+str6.hashCode());
		System.out.println("str7:"+str7.hashCode());
		System.out.println("str8:"+str8.hashCode());
		System.out.println("-----------------------------------------------------");
		// == ()값이 같냐? 참조타입은 주소를 비교
		System.out.println("생성(str1) vs 연산(str5) : " + (str1==str5)); 
		System.out.println("생성(str1) vs Concat(str6) : " + (str1==str6));
		System.out.println("생성(str1) vs new 객체(str4) : " + (str1==str4)); // 주소가 다름
		System.out.println("생성(str1) vs 대입(str2) : " + (str1==str2));
		System.out.println("생성(str1) vs 생성(str3) : " + (str1==str3));

		
		// 같은 객체를 바라보고 있는가?
		System.out.println("같은 객체를 바라보고 있는가?");
		System.out.println(str1 == str2 && str1 == str3 && str1 == str5);

		
	}
}
