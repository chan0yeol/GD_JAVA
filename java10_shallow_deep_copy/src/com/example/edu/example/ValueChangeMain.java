package com.example.edu.example;

import java.util.Arrays;
import java.util.Scanner;

public class ValueChangeMain {
	public static void main(String[] args) {

		 Pass_Argument_Change pac = new Pass_Argument_Change(); int n = 100; int[]
		 nArr = {100,200,300,400}; pac.change(n); pac.change(nArr);
		 System.out.println("기본타입의 값 변경 확인 : "+n);
		 System.out.println("참조타입의 값 변경 확인 : "+ Arrays.toString(nArr));
		  
		 /* 
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * if((year%4 == 0) && (year%100 != 0) || (year%100 == 0) && (year%400 == 0)) {
		 * System.out.println("윤년"); } else { System.out.println("평년"); }
		 * 
		 * 
		 * int num = scan.nextInt(); int sum = 0; for (int i = 0; i <= num;) { int lnum
		 * = num%10; sum += lnum; num /= 10; if(num == 0) { break; } }
		 * System.out.println(sum);
		 */
			/*
			 * int n = 3; int sum = 0; for (int i = 1; i <= n; i++) { System.out.print("(");
			 * for (int j = 1; j <= i; j++) { System.out.print(j + "+"); sum += j; if (j + 1
			 * == i) { System.out.print(j + 1); break; } else {
			 * 
			 * } } System.out.print(")");
			 * 
			 * } System.out.println("=" + sum);
			 */
	}
}
