package com.elicecollectiong.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collection_ex01 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		while(true) {
			Scanner scan = new Scanner(System.in);
//			System.out.println("정수 입력");
			int n = scan.nextInt();
			if(n == 999 && list.size()/2 != 0) {
				break;
			} else if(n == 999) {
				continue;
			} else {
				list.add(n);	
			}
			
			
		}
		Collections.sort(list);
//		System.out.println(list);
		double avg = 0;
		for (Integer integer : list) {
			avg += integer;
		}
		avg = avg / list.size();
		System.out.println("평균:"+avg);
		System.out.println("중간값:"+list.get(list.size()/2));
		
	} 
}
