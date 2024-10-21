package com.exmaple.edu.array;

import java.util.Arrays;

/*
 * shallow copy (얕은 복사) 란?
 * 	- 참조타입에서 객체를 복제하는 것이 아닌 해당 객체의 메모리의 주소를 전달한다.
 *  - 주소를 통해서 변경하면 어디서든 변경이 가능하고 연결된 모든 사용하는 곳에서 변경이 이루어 진다.  
 * deep copy 란?
 * 	- 주소를 전달하는 것이 아닌 객체를 복제하여 전달하는 방법
 *  - java.lang.Object => protected clone()
 */
public class Shallow_Deep {
	 public void shallow() {
		 // pass by reference
		 
		 int[] arr = {1,2,3,4};
		 int[] cArray = arr;
		 
		// 참조타입에서 ==으로 주소를 비교
		 // 기본 타입에서 ==으로 값을 비교한다
		 System.out.println("arr == cArray");
		 System.out.println(arr == cArray); // true 라면 같은 객체를 바라보고 있다.
		 
		 System.out.println("arr.equals(cArray)"); // hashcode 비교 true 라면 같은 객체를 바라보고 있다.
		 System.out.println(arr.equals(cArray)); // hashcode 비교 true 라면 같은 객체를 바라보고 있다.
		 
		 System.err.println("System.identityHashCode(arr) == System.identityHashCode(cArray)");
		 System.err.println(System.identityHashCode(arr) == System.identityHashCode(cArray));
		 
		 System.out.println("-----------------------------------------------------------------------------");
		 System.out.println("원본:"+Arrays.toString(arr));
		 System.out.println("복사:"+Arrays.toString(cArray));
		 cArray[2] = 99;
		 System.out.println("원본:"+Arrays.toString(arr));
		 System.out.println("복사:"+Arrays.toString(cArray));
	 }
	 public void deep() {
		 String[] strs = new String[] {"d","r","e","a","m"};
		 //    사용영역
		 // 1) stack : 복사객체를 만들어서 각 위치에 값을 입력해주는 방식(for문, index)
		 String[] strsCopy = new String[strs.length];
		 
		 for(int i = 0; i< strsCopy.length; i++) {
			 strsCopy[i] = strs[i];
		 }
		 
		 // 2) heap : java.lang.Object 자식 클래스가 복제될 수 있도록 해줌 => clone
		 String[] strsClone = strs.clone();
		 System.out.println(Arrays.toString(strsClone));
		 
		 // 3) 메모리(System) :
		 String[] strsCopy3 = new String[10];
		 System.arraycopy(strs, 0, strsCopy3, 3, 3);
		 
		 System.err.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		 System.out.println("Arrays.toString()");
		 System.out.println("strs : " + Arrays.toString(strs));
		 System.out.println("strsCopy : " + Arrays.toString(strsCopy));
		 System.out.println("strsClone : " + Arrays.toString(strsClone));
		 System.out.println("stsrCopy3 : "+Arrays.toString(strsCopy3));
		 System.err.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		 System.out.println("hashCode()");
		 System.out.println("strsCopy.hashCode() : "+strsCopy.hashCode());
		 System.out.println("strsClone.hashCode() : "+strsClone.hashCode());
		 System.out.println("strsCopy3.hashCode() :"+strsCopy3.hashCode());
	 }
	 
	 
	 
	 
	 
	 
}
