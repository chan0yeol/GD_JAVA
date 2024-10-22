package com.example.ant;

import java.util.Scanner;

public class Ant {

	public static void main(String[] args) {
//		AntP ap = new AntP();
//		System.out.println("개미수열 1에서 시작합니다\n 몇항까지 출력할까요?");
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		String ant = "1";
//		System.out.println("--------개미수열 출력 -------");
//
//		ap.antProcess(ant,n);
//		
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    int sum = 0;
	    for(int i = 1; i<=n; i++) {
	        System.out.print("(");
	        for (int j = 1; j<= i; j++){
	        	if(j == i) {
	        		sum += j;
	        		System.out.print(j+")");
	        	} else {
	        		sum += j;
	        		System.out.print(j+"+");	
	        	}
	        }
	        if (i != n) {
	        	System.out.print("+");	
	        }
	        
	    }
	    System.out.print("=" + sum);
	}
	
	

}
