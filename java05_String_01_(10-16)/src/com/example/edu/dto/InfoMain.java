package com.example.edu.dto;

public class InfoMain {
 
	public static void main(String[] args) {
		InfoDto info_001 = new InfoDto("둘리",40,"얼음별");
		InfoDto info_002 = new InfoDto("둘리",40,"얼음별");
		
		
		// new를 통한 객체의 생성은 새로운 주소를 발생시킨다. -> heap 영역에 올라가며 생성
		System.out.println("주소가 같은가?" + (info_001 == info_002));
		
		// new를 통한 객체의 생성은 각 개체의 고유한 hashcode가 만들어진다 -> java.lang.Object가 만들어줌
		System.out.println("\n hashcode()");
		System.out.println("info_001.hashCode() : "+info_001.hashCode());
		System.out.println("info_002.hashCode() : "+info_002.hashCode());
		System.out.println("\n equals()");
		System.out.println("info_001.hashCode() == info_002.hashCode() :"+(info_001.hashCode() == info_002.hashCode()));
		System.out.println("info_001.equals(info_002) : "+info_001.equals(info_002));
		System.out.println("\n System.out.println(Object) => System.out.println(Object.toString())과 같다.");
		System.out.println(info_001);
		System.out.println(info_002);
		System.out.println("\n toString()");
		String childToString = info_001.toString();
		String childToString2 = info_002.toString();
		System.out.println("info_001 : "+childToString);
		System.out.println("info_002 : "+childToString2);
	
		//값 비교
		// info_001과 info_002의 객체 특징인 내부의 멤버필드를 호출하여 값 비교
		System.out.println("\n 멤버필드 == 비교");
		boolean name = info_001.getName() == info_002.getName();
		boolean age = info_001.getAge() == info_002.getAge();
		boolean address = info_001.getAddress() == info_002.getAddress();
		System.out.printf("%b, %b, %b \n", name, age, address);
		System.out.println(name&age&address);
		System.out.println("결과가 true라면 info01과 info02는 서로 같은 값을 가진 객체로 판단됨");
		System.out.println("\n System.identityHashCode()");
		System.out.println(System.identityHashCode(info_001));
		System.out.println(System.identityHashCode(info_002));
		
	}
	class InfoMain2 {}
}
