package com.array.edu;

import java.util.Scanner;

public class Aarray_Ex03 {
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		if (num < 0) {
			System.out.println("대칭수 아님");
			return;
		}

		// 문자열로 변환하여 팔린드롬 여부 체크
		String strNum = String.valueOf(num);
		if (isPalindrome(strNum)) {
			System.out.println("대칭수");
		} else {
			System.out.println("대칭수 아님");
		}
//		Scanner scan = new Scanner(System.in);
//	    if(scan.hasNextInt()){
//	        int n = scan.nextInt();
//	        String str = Integer.toString(n);
//	        
//	        boolean is = true;
//	        if(n < 0) {
//	        	System.out.println("대칭수아님")
//	        }
//	    }
	}

	public static boolean isPalindrome(String str) {
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - 1 - i)) {
				return false;
			}
		}
		return true;
	}
	
}


//
//public static void main(String args[]) { 
//    Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		String str = Integer.toString(num);
//		boolean is = true;
//       if (num < 0) {
//           System.out.println("대칭수 아님");
//           return;
//       }
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
//}
//}