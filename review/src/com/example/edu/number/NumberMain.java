package com.example.edu.number;

public class NumberMain {

	public static void main(String[] args) {
		RevieVariable rv = new RevieVariable();
//		rv.variableUse();	
//		System.out.println(rv.isChkYaksu(6, 4)?"약수":"약수아님");
//		System.out.println(rv.yaksuSum(7));
		
		//범위의 숫자를 입력 받아 범위 내에 (3 ~ 범위) 까지 있는 친화수를 출력
		long start = System.currentTimeMillis();
//		rv.friendlyNum(2000);
		rv.friendlyFianl(10000);
		long end = System.currentTimeMillis();
		
		System.out.println(end - start);
	}

}
