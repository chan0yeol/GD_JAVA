package com.example.edu;

import com.util.edu.EducationUtility;

public class Number_Main {

	public static void main(String[] args) {
		// 약수 합
		YaksuSum ys = new YaksuSum();
//		System.out.println(ys.yaksusum(18));
		AmicableNumbers an = new AmicableNumbers();
//		int n = EducationUtility.getNumericValue();
//		System.out.println(ys.yaksusum(n));
//		// 완전수  = n이 n의 약수의 합과 같은 수 
//		PerfectNumber pn = new PerfectNumber();
//		pn.pNum(10000);
//		
//		System.out.println("어디까지 찾을까요?");
//		int n = EducationUtility.getNumericValue();
//		System.out.println(n + "이하의 수중의 친화수");
		an.check_amicableNumbers(100000);

	}

}
