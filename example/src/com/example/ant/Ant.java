package com.example.ant;

import java.util.Arrays;
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
		Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    int cnt = 1;
	    char init = str.charAt(0);
	    String next = "";
	    String str2 = "";
	    for(int i = 1; i <str.length(); i++) {
	    	if(str.charAt(i) == init) {
	    		cnt++;
	    	}else {
	    		next = next+init+":"+cnt+"개\n";
	    		init = str.charAt(i);
	    		cnt =1;
	    	}
			str2 = next + init + ":" + cnt + "개"; 
	    }
	    String[] newStr = str2.toString().split("개");
	    Arrays.sort(newStr);
	   
	    for (String string : newStr) {
	    	System.out.println(string);	
		}
	    
//	    System.out.println(Arrays.toString(c));
//		Scanner scan = new Scanner(System.in);
//		  String str = scan.nextLine();
//		 String[] str2 = str.split("[ ]");
//		  System.out.println(Arrays.toString(str2));
//		  
//		  
		  
	}
	
	

}
