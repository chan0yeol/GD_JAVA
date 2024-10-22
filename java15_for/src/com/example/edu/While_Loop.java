package com.example.edu;

public class While_Loop {

	public static void main(String[] args) {
		// while은 지정된 조건이 true 일때만 코드블럭을 실행
		// while을 사용하는 문법에는 논리적인 오류로 인해 무한 loop에 빠지기도한다.
		
		// x가 0부터 시작해서 1씩 증가하는데
		// x가 5가 되면 중지하는 코드
		int x = 0;
		while(x < 5) {
			System.out.println(x++);			
		}
		
		// do ~ while은 while과 작동방식은 같으나 한번 연산 후 판단함.
		int y = 0;
		do {
			System.out.println(y++);
		} while (y<5);
	}
}
