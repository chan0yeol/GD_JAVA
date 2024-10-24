package com.example.edu.a;

import java.util.Scanner;

public class Ant {

	public static void main(String[] args) {
		System.out.println("개미수열 몇항까지 출력할까요?");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String ant = "1";
		System.out.println("--------개미수열 출력 -------");

		antProcese(ant,n);
		
	}
	public static void antProcese(String str, int n) {
		for(int i = 1; i<=n;i++) {
			String result = next(str);
			System.out.println(result);
			str = result;
		}		
	}
	public static String next(String str) {
		String next = "";
		char currentC = str.charAt(0);
		int cnt = 1;
		for(int i = 1; i <str.length(); i++) {
			if(str.charAt(i) == currentC) {
				cnt++;
			} else {
				next = next+currentC+cnt;
				currentC = str.charAt(i);
				cnt = 1;
			}
		}
		next = next + currentC+cnt;
		return next;
	}
	

}
