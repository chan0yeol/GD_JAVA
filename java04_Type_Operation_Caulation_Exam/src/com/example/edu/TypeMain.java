package com.example.edu;

import java.util.Scanner;

public class TypeMain {

	//TODO 001 main 메소드 생성
	public static void main(String[] args) {
		TypeProcess tp = new TypeProcess();
//		tp.calculation();
//		tp.floatFn();
		Scanner scan = new Scanner(System.in);
	    int i = scan.nextInt();
	    switch(i) {
	        case 1 : 
	        	System.out.println("가위");
	        	break;
	        case 2 : 
	        	System.out.println("바위");
	        	break;
	        case 3 : 
	        	System.out.println("보");
	        	break;
	    }
	}

}
