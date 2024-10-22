package com.example.edu;

public class Break_Continue {
	// TODO 001 Break Continue
	public static void main(String[] args) {
		// while & for 내에서 사용할 수 있는 두개의 특수기능
		// break는 Loop를 종료
		// continue 현재 반복되는 나머지 부분을 건너 뛰고 반복의 처음으로 이동 시작
		
		for(int i=0; i< 10; i++) { // 0 ~ 9 까지 반복진행
			if(i == 5) {
				break;
			}
			if(i == 3) {
				continue;
			}
			System.out.println(i);
		}
		
	}
}
