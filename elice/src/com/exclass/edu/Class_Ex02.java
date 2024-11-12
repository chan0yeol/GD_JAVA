package com.exclass.edu;

import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.util.Arrays;
import java.util.Scanner;

public class Class_Ex02 {
	class Animal{
		public Animal() {
		
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] str2 = str.split("[ ]");
//		System.out.println(Arrays.toString(str2));
	
		Card c1 = new Card(str2[0], Integer.parseInt(str2[1].trim()));
		Card c2 = new Card(str2[2], Integer.parseInt(str2[3].trim()));

		System.out.println(c1);
		System.out.println(c2);
		Card.width = 50;
		Card.height = 80;
		System.out.println(c1);
		System.out.println(c2);
	}

}
