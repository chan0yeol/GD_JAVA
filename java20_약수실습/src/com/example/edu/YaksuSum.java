package com.example.edu;

import java.util.Calendar;

public class YaksuSum {
	public void perfectNum(int range) { // 1000
		for(int i = 4; i < 1000; i++) {
			if(i == yaksusum(i)) {
				System.out.println(i+"는 완전수");
			}
		}
	}
	public boolean isCheck(int num, int chknum) {
		boolean isc = false;
		if (num % chknum == 0) {
			isc = true;
		}
		return isc;
	}
	
//	public void yaksu_print(int num) {
//		int sum = 0;
//		for (int i = 1; i < num; i++) {
//			if (isCheck(num, i)) {
//				System.out.println(i);
//				sum += i;
//			}
//		}
//		System.out.println("약수의 합 :" + sum);
//	}

	public int yaksusum(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (isCheck(n, i)) {
				sum += i;
			}
		}
		return sum;
	}
}
