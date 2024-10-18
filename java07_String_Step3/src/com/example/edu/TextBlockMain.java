package com.example.edu;

import java.util.Scanner;


public class TextBlockMain {

	private static int count(String str1, String str2) {
		  //String result = str1.replaceAll(str2, "-");
		  int cnt =0;
		  int idx = 0;
		  while((idx = str1.indexOf(str2, idx)) != -1) {
			  cnt++;
			  idx += str2.length();
		  }
		return cnt;
	}
	public static void main(String[] args) {
//		TextBlock tb = new TextBlock();
//		tb.text();
		/*
		 * Scanner scan = new Scanner(System.in); String str = scan.next(); int num =
		 * Integer.parseInt(str.replace(",", "")) + 1000; str = Integer.toString(num);
		 * 
		 * System.out.println(str.format("%,d", num));
		 * 
		 */
		/*
		 * Scanner scan = new Scanner(System.in); String str = scan.next();
		 * 
		 * String reg = "[^0-9]"; String result = str.replaceAll(reg,"");
		 * //System.out.println(result); char[] cArr = result.toCharArray(); int sum =
		 * 0; for(int i=0; i<cArr.length; i++) { // System.out.println(cArr[i]);
		 * 
		 * sum += Character.getNumericValue(cArr[i]); } System.out.println(sum);
		 */
		Scanner scan = new Scanner(System.in);
		  String str1 = scan.next();
		  String str2 = scan.next();
		  
		 // count(str1, str2);
		  
		  System.out.println(count(str1, str2));			  
		  
	}

}
