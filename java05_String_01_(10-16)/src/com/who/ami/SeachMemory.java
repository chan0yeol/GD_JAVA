package com.who.ami;

import com.example.edu.compare.A;

//TODO 004 String 객체의 Hashcode 값 확인
public class SeachMemory {
	public static void main(String[] args) {
		//String Override된 hashcode 
		//String new의 Override 된 hashcode
		//추적을 통한 String Pool(SP) 의 값
		
		String str1 = "Sunny"; // -> SP에생성
		System.out.println("SP의 \"Sunny\"의 hashcode : " + str1.hashCode()); // 80247031
		System.out.println("SP의 \"Sunny\"의 override 되기 전의 hashcode : " + System.identityHashCode(str1));  
		A a = new A();
		System.out.println(a.hashCode());
		System.out.println(System.identityHashCode(a)+"\n -------------------------------------");
		
		String str2 = new String("Sunny"); // heap에 생성 
		System.out.println("new로 생성한 \"Sunny\"의 hashcode : " + str2.hashCode()); // 80247031
		System.out.println("SP의 \"Sunny\"의 override 되기 전의 hashcode : " + System.identityHashCode(str2));
		
		String str3 = "Sunny";
		System.out.println("toString()");
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		System.out.println(str3.toString());
		System.out.println("System.out.println(str1.toString() == str2.toString()); ,  System.out.println(str1.toString() == str3.toString())");
 		System.out.println(str1.toString() == str2.toString());
		System.out.println(str1.toString() == str3.toString());
		
		// str2는 new를 통해 생성되었기 때문에 heap에 위치해 있다.
		// str1은 StringPool에 위치해 있다.
		// str2는 heap에 있지만 값은 String Pool을 가르키고 있다.
		System.out.println("System.identityHashCode(String.intern())");
		System.out.println(System.identityHashCode(str1.intern()));
		System.out.println(System.identityHashCode(str2.intern()));
		
		
		
	}

}
