package com.example.edu;


public class Break_Label {
	//TODO 002 이중 for문에서 현재 루프의 위에 루프 벗어나기 위해서 사용
//				해당 루프에 이름을 추가하고 그 앞에 :을 추가하여 이름 부여
	public static void main(String[] args) {
		myLoop:for(int i = 0; i < 10; i++) {
			System.out.println("상위 i for문 :"+i);
			for(int j = 0; j<10; j++) {
				System.out.println("\t하위 j for문 : " + j);
				break myLoop;
			}
		}
	}
}
