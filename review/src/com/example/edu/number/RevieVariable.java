package com.example.edu.number;

public class RevieVariable {
	// TODO 003 친화수 로직에 따라서 for문으로 값을 입력하여 처리하자.
	// 220 일때 284의 진약수의 합과 비교가 참일때 (a) 
	// 220 진약수의 합을 284와 비교하여 참이라면(b)
	// a && b 참이라면 친화수 이다 출력
	// 1) 두개의 값을 입력 받는다. 220,284는 친화수  이다 라고 출력
	// 2)입력되는 값은 친화수를 구하고자 하는 범위 argument
	public void friendlyNum(int range) {
		for (int iNum = 3; iNum <= range; iNum++) {
			for (int jNum = iNum+1; jNum <= range; jNum++) {
//				boolean aCheck = (iNum == yaksuSum(jNum));
//				boolean bCheck = (jNum == yaksuSum(iNum));
				// aCheck && bCheck 
				if (iNum != jNum && iNum < jNum && (iNum == yaksuSum(jNum)) && (jNum == yaksuSum(iNum))) {
					System.out.printf("%d 과 %d 는 친화수 이다. \n", iNum, jNum);
				} 
			} // 하위 j for문
		}// 상위 i for문
		
	}
	
	public void friendlyFianl(int range) {
		for(int i = 3; i < range; i++) {
			int tmp = i; // i 가 220일때 
			int iSum = yaksuSum(i); // iSum = yaksuSum(220) => 284
			int jSum = yaksuSum(iSum); // jSum = yaksuSum(284) => 220
			
			if(tmp < iSum && tmp == jSum) {
				System.out.printf("%d 와 %d는 친화수로 판단됨 \n", tmp, iSum);
			}
		}
	}// friendlyFianl
	public boolean perfectNum(int num, int chknum) {
		
		return num == chknum;
	}
	//TODO 002 숫자 n을 입력받아 1부터 n미만 까지의 약수의 합을 반환하는 메소드
	public int yaksuSum(int n) {
		int res = 0;
		for(int i = 1; i<n; i++) {
			if(isChkYaksu(n, i)) { // isChkYaksu를 통해 약수인지 판별
				res += i;
			}
		}
		return res;
	}
	
	
	// TODO 001 판단메소드 두수가 약수인지 판별
	public boolean isChkYaksu(int num, int chkNum) {
//		boolean isc = false;
//		if(num%chkNum ==0) {
//			isc = true;
//		}
		return (num % chkNum == 0);
	} // isChkYaksu End
	
	
	// 변수의 범위
	// 변수 누적
	// 1부터 10까지의 값을 모두 더하는 메소드 -> 55
	public void variableUse() {
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
//			int sum = sum +i; // 대입 연산자를 기준으로 오른쪽부터 실행
//								sum은 선언이 되어 있지 않은 그냥 변수명 따라서 문법 오류 발생;

			sum = sum + i;
		}
	} // variableUse end
	
}
