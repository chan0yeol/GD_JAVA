package com.example.ant;

import java.util.Arrays;
import java.util.Scanner;

public class Ant {

	public static void main(String[] args) {
		AntP ap = new AntP();
		System.out.println("개미수열 1에서 시작합니다\n 몇항까지 출력할까요?");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String ant = "1";
		System.out.println("--------개미수열 출력 -------");
		ap.next(ant, n);

//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		String str = Integer.toString(num);
//		boolean is = true;
////		if(str.length()%2 == 1) {
//		int mid = str.length()/2;
//		for(int i=0; i<mid; i++) {
//			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
//				is = false;
//				break;
//			} 
//			
//		}
//		if(is) {
//			System.out.println("대칭수");
//		} else {
//			System.out.println("대칭수 아님");
//		}
//		} 
		
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		System.out.println("2진수:"+ Integer.toBinaryString(num));
//		System.out.println("8진수:"+ Integer.toOctalString(num));
//		System.out.println("16진수:"+Integer.toHexString(num));
//		
		
//		ap.antProcess(ant,n);
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		char[] tmp = str.toCharArray();
//		Arrays.sort(tmp);
//		String newStr = new String(tmp);
//		int cnt = 1;
//		char init = newStr.charAt(0);
//
//		for (int i = 1; i < newStr.length(); i++) {
//			String next = "";
//			if (newStr.charAt(i) == init) {
//				cnt++;
//			} else {
//				next = next + init + ":" + cnt + "개";
//				System.out.println(init + ":" + cnt + "개");
//				init = newStr.charAt(i);
//				cnt = 1;
//			}
//		}
//		System.out.println(init+":"+cnt+"개");

		
//	    System.out.println(Arrays.toString(c));
//		Scanner scan = new Scanner(System.in);
//		  String str = scan.nextLine();
//		 String[] str2 = str.split("[ ]");
//		  System.out.println(Arrays.toString(str2));
//		  
//		  

	}

}
