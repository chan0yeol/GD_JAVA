package com.goo.dee;

import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

public class ConverType {
	// String -> char[]
	public void fn01() {
		/*
		 * 내가한거 String str = "abcde"; int arrleng = str.length(); char[] cArray = new
		 * char[arrleng]; for(int i = 0; i<str.length(); i++ ) { cArray[i] =
		 * str.charAt(i); }
		 * 
		 * for (char c : cArray) { System.out.print(c); } System.out.println();
		 */
		/*
		 * 풀이 1) 각 문자열의 index를 통해서 분리하자. java.lang.String.charAt(int index) 
		 * 문자열의 길이를 판단하는 메소드 java.lang.String.length() 범위가 있는 반복문 for index는 0부터 시작
		 */

		/*
		 * 2) 문자열의 길이만큼 chatAt()을 사용해서 자동으로 array로 반환해주는 메소드를 사용. => toCharArray(String str)
		 */
		String str = "abcde";
		char[] c = str.toCharArray();
		/*
		 * for (char d : str.toCharArray()) { System.out.print(d); }
		 */
		System.out.println();
		System.out.println(Arrays.toString(c));
	} // fn01 end

	// 10진수 -> 2진수
	public void fn02() {
		int a = 10;
		String toBinary = Integer.toBinaryString(a);
		System.out.println(toBinary);
	} // fn02 end

	// 10진수 -> 8진수
	public void fn03() {
		int a = 10;
		String toOctal = Integer.toOctalString(a);
		System.out.println(toOctal);
	} // fn03 end

	// 10진수 -> 16진수
	@Test
	public void fn04() {
		int a = 11;
		String toHex = Integer.toHexString(a);
		System.out.println(toHex);
	} // fn04 end
	
	// int -> char 66 -> 'A'
	public void fn05() {
		int n = 66;
		char c = (char) n;
		System.out.println((char) (c - 1));
	} // fn05 end

	// char -> int 'A' -> 65 : casting 연산자, 연산자
	public void fn06() {
		char c = 'A';
		int n = c;
		System.out.println(n);
	
	
		for(int i = 'ㄱ'; i <= '뷁'; i++) {
			char tmp = (char)i;
//			System.out.print(i+":"+tmp+",");
			System.out.printf("%d : %c %n", i, tmp);
	
		}
	} // fn06 end

	// int -> char -> int 'A'를 연산을 통해서 'C' 출력
	public void fn07() {
		int n = 65;
		char c = (char) (n + 2);
		System.out.println(c);
	}

	// char 숫자 -> int 숫자(연산) '0'-'9' = -9 증명
	public void fn08() {
		char c1 = '0';
		char c2 = '9';
		int cal = (int) (c1 - c2);
		System.out.println(cal);
		int abs = Math.abs(cal);
		System.out.println(abs);
//		
	}

	// char숫자 -> int숫자(api) Character.getNumericValue('9') => 9 ; API문서를 번역하여 기능을
	// 분석해 보시오
	@Test
	public void fn09() {
		char c = '9';

		System.out.println(c+ "/" +Character.getNumericValue(c));
//		=> 알파벳 파라미터 전송시 - 10~35 숫자값을 뱉어준다.
//		=> 정수 숫자 (0~9)파라미터 전송시 - int 값으로 뱉어줌
//		=> 알파벳과 숫자가 아닌 다른 값이 들어가면 -1 뱉어줌
//		=> 문자에 숫자 값이 없으면 -1 뱉어줌 ex)음수
//		=> 문자에 음이 아닌 정수로 표현할 수 없는 숫자 ex)분수 -> -2 뱉어줌

	}

	// String 숫자 -> int String.valueOf("1") => 1
	// 참조타입을 기본타입으로 변경
	// 기본타입을 참조타입으로 변경 출력
	public void fn10() {
		String strNumber = "1234";
		int strToNum = Integer.valueOf(strNumber);
		int i = 1234;
		System.out.println(String.valueOf(i));
		System.out.println(strToNum);
		
	}

	// String Double -> double Double.parseDoubel("3.14") => 3.14
	// 문자열을 기본타입으로 변경한다.
	public void fn11() {
		String strDouble = "3.14";
		double strToDouble = Double.parseDouble(strDouble);
		System.out.println(strToDouble);
	}

	// int -> String 검색용어 Concatenation
	public void fn12() {
		int n = 1234;
		String str = String.valueOf(n);
		String str2 = Integer.toString(n);
		System.out.println(str);
		System.out.println(str2);

	}
	@Test
	public void fn13() {
		Scanner scan = new Scanner(System.in);
		char c =  scan.next().charAt(0);
		if(Character.getNumericValue(c) <= 9 &&  Character.getNumericValue(c) >= 0) {
			System.out.println(Character.getNumericValue(c) * 2);
		} else if (Character.isUpperCase(c) ) {
			System.out.println(Character.toLowerCase(c));
		} else if (Character.isLowerCase(c)) {
			System.out.println(Character.toUpperCase(c));
		} else { 
			System.out.println("기타문자"); 
		}
		System.out.println(Character.getNumericValue('a'));
		System.out.println(Character.getNumericValue('A'));
			
	}
	public void fn14() {
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if(year % 4 == 0 && !(year%100 == 0)) {
			System.out.println("윤년");
		} else if(!(year%100 == 0) && year%400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
		
	}
	
}
