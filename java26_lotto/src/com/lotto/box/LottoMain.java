package com.lotto.box;

import java.util.Scanner;

public class LottoMain {
	// 5개?
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		LottoRow one = new LottoRow();
//		System.out.println(one);
//		LottoRow two = new LottoRow();
//		System.out.println(two);
		System.out.println("몇게임 할래?");
		int row = scan.nextInt(); // 5
		LottoRow[] lotto = new LottoRow[row];
		
		for(int i=1; i<=row; i++) {
			lotto[i] = new LottoRow();
			System.out.println(lotto[i]);
			if(i%5 == 0) {
				System.out.println("-------------");
			}
		}
		
		
//		System.out.println("반자동 몇게임?");
//		int n = scan.nextInt(); // 2
		
		
		
		// 수동 게임 start
			
//			LottoRow noAuto = new LottoRow();
//			System.out.println("수동 번호 6개 넣는다");
//			noAuto.lotto_ChangeNum(6);
//		// 수동 게임 end
		
		
		
		// 반자동 start
//		LottoRow one = new LottoRow();
//		System.out.println(one);
//		System.out.println("반자동 게임");	
//		System.out.println("수동 몇개?");
//		int n = scan.nextInt();
//		one.lotto_ChangeNum(n);
		// 반자동 end
		
		
		
		// 자동 게임 갯수 받아서 
//		System.out.println("몇게임");
//		int row = scan.nextInt();
//		
//		for (int i = 1; i <= row; i++) {
//			new LottoRow();
//			if (i % 5 == 0) {
//				System.out.println("------------------------------------------------");
//			}
//		}
		// 자동 게임 end
		
		
		scan.close();
	}
}
