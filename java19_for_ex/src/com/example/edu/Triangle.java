package com.example.edu;

public class Triangle {
	
	/**
	 * 이중 for문을 사용한다
	 * 외부 for문은 층수를 반복해줌
	 * 내부 for문은 각층수에 따른 그림을 출력해주는 갯수를 반복
	 * 입력은 main에서 argument 정수 
	 */
	public void triangle_One(int stage) {
		for(int i = 0; i< stage; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("@");
			}
			System.out.print("\n");
		}
	}
	public void triangle_Two(int stage) {
		for(int i = 0; i < stage; i++) {
			for(int j = 0; j<(stage-i); j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
	public void triangle_Three(int stage) {
		for(int i = 0; i<stage; i++) {
			for(int j = 0; j<i;j++) {
				System.out.print(" ");
			}
			for(int j = 0 ; j < (stage-i); j++) {
				System.out.print("@");
			}
			System.out.println();
		}
	}
	public void triangle_four(int stage) {
		for(int i = 0; i<stage;i++) {
			for(int j = 0; j < (stage-i-1); j++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (i+1); j++) {
				System.out.print("@");
			}
			System.out.println();
			
		}
	}
	
	
}
