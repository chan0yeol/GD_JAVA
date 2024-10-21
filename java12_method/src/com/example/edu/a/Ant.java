package com.example.edu.a;

public class Ant {

	public static void main(String[] args) {
		int n = 3;
		String ant = "1";
		String next = "";
		System.out.println(ant);
		int cnt = 0;
		for(int i = 1; i<n;i++) {
			next(ant);
			
		}

	}
	public static String next(String str) {
		String next = "";
		char currentC = str.charAt(0);
		int cnt = 1;
		for(int i = 1; i <str.length(); i++) {
			if(str.charAt(i)== currentC) {
				cnt++;
			} else {
				
			}
		}
		next += currentC;
		next += Character.getNumericValue(cnt);
	
		return next;
	}
	

}
