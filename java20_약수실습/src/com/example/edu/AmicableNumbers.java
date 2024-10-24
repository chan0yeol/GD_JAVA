package com.example.edu;

public class AmicableNumbers {
	public void check_amicableNumbers(int range) {
		YaksuSum ys = new YaksuSum();
		
		/*
		 * for (int i = 1; i < n; i++) { for (int j = i + 1; j < n; j++) { if
		 * (ys.yaksusum(i) == j && ys.yaksusum(j) == i) { System.out.println(i + "와" + j
		 * + "는 친화수"); } } }
		 */
		
		for(int i = 3; i <range;i++) {
			int tmp = i;
			int aSum = ys.yaksusum(tmp);
			int bSum = ys.yaksusum(aSum);
			if(tmp < aSum && tmp == bSum ) {
				System.out.println(aSum + "과" + bSum + "은 친화수");
			}
		}
	}
}
