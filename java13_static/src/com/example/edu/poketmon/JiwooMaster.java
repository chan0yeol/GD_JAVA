package com.example.edu.poketmon;

import java.util.Arrays;
import java.util.Scanner;

public class JiwooMaster {
	// TODO MonsterBall 가지고 있는 객체 
	
	public static MonsterBall[] bag;
	private static int bagIdx;
	
	public JiwooMaster() {
		bag = new MonsterBall[3];
	}
	
	public void addPoketMon() {
		if(bagIdx == 3) {
			System.out.println("더 이상 포켓몬을 가질 수 없어요 (가방 꽉참)");
			System.out.println("여행 후 지우 가방의 포켓몬" + Arrays.toString(JiwooMaster.bag));
			Scanner scan = new Scanner(System.in);
			System.out.println("포켓몬을 버리겠습니까? 1. 버린다 | 2.안버린다");
			int idx = scan.nextInt();
			if(idx == 1) {
				System.out.print("1."+ bag[0].getName()+ " | 2."+bag[1].getName()+" | 3."+bag[2].getName());
				System.out.println(" 버릴 포켓몬을 입력:");
				int poketNum = scan.nextInt();
				deletePoketMon(poketNum);
			} else {
				return;	
			}
			
			
		}
		MonsterBall tmp = CatchPoketInput.catchPoketMon();
		bag[bagIdx++] = tmp;
	}
	public void deletePoketMon(int n) {
		System.out.println(bag[n].getName()+"를 버렸습니다.");
		bag[n] = null;
	}
}
