package com.example.edu;

import java.util.Arrays;

public class Array_Decalaring {
	public static void main(String[] args) {
		/*
		 * 
		 * array를 선언하기 위해 array에 포함될 데이터의 유형에 [] 를 같이 작성하면 된다.
		 * array 한개의 타입이 묶음으로 만들어 지도록 한다.
		 * 		=> 모든 array의 요소는 해당 유형 타입이어야 한다
		 */
		
		// TODO 001 1차원 array의 선언 방법
		//		생성자가 없기 때문에, 즉 class가 없다.
		//		new로 생성을 하지만 생성자를 호출 하지 않는다. 변수가 여러개 묶여서 생성된 DTO 
		int[] x; // 선언
		
		int[] arr1 = new int[] {21,22,22}; // 값과 크기를 입력
		int[] arr2 = {21,22,23}; // 값만 입력하면 크기를 입력
		int[] arr3 = new int[3];// 공간만 작성
		
		// 호출은 해당 객체를 접근하여 [index] 를 통해 입력 및 호출
		int in1 = arr1[0];
		System.out.println(in1);
		arr3[0] = 100;
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		
		System.out.println("arr1.hashCode()"+arr1.hashCode());
		System.out.println("arr2.hashCode()"+arr2.hashCode());
		
		//TODO 002 n차원 array의 선언방법
		String[][] n1 = {{"A","B"},{"C","D"}};
		String[][] n2 = new String[2][2];
		
		//TODO 003 array의 길이는 length 예약어로 되어있다.
		
		String[][] m1 = new String[2][3];
		System.out.println(m1.length);
		System.out.println(m1[0].length);
		
		//TODO 004 예외상황
		// 1) 만약 index가 넘어가는 index에 값을 입력하거나 호출 할 경우.
		boolean[] boolArray = new boolean[4];
		System.out.println(boolArray[0]);
		// slice 문법 자바에서는 ArrayIndexOutOfBoundsException
//		System.out.println(boolArray[-1]);
		
		//절대 쓰지 않는 문법
		Object[] obj = {"a",1,true}; // OOP의 upCasting을 나타낸 것
		
		
		// TODO 005 Array는 클래스가 아니기 때문에 기능이 부여 되어 있지 않다.(메소드가 없다)
		// 		=> 생성된 array를 Arguments로 입력받아 메소드를 실행하는 
		//		=> java.util.Arrays 클래스를 사용해야한다.
		
		String[] tmpArray = {"1","2","11","22","3","33"};
		// 1) 출력, Array를 입력받아 출력해주는 메소드 toString();
		String pArray = Arrays.toString(tmpArray);
		System.out.println(pArray);
		
		// 2) Array 타입의 구분은? 
		//    참조타입 ? mutable 특성을 가지고 있다. 주소를 통해서 객체를 변경하면 바로 변경.     
		
		String str = "rain is back";
		str.substring(5);
		System.out.println(str);
		Arrays.sort(tmpArray);
		System.out.println(Arrays.toString(tmpArray));
		Arrays.fill(tmpArray, "nice");
		System.out.println(Arrays.toString(tmpArray));
		
		/*
		 * Array는 pass by reference 
		 * 주소를 가지고 모든 곳에서 원본의 값을 변경할 수 있다.
		 * shallow copy 얕은 복사
		 */
				 
	}
}
