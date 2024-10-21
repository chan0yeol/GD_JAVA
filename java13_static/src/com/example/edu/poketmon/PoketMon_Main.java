package com.example.edu.poketmon;

import java.util.Arrays;
import java.util.Scanner;

public class PoketMon_Main {

	public static void main(String[] args) {
		//TODO 006 005 객채 생성(new) 및 출력 Test(toString() Override)
//		MonsterBall ball01 = new MonsterBall("파이리", 0.6f, "맹화");
//		System.out.println("너로 정했다 !! " + ball01);
		//TODO 008 Test 007에서 만들어진 MonsterBall객체를 확인
//		MonsterBall catchPoket = CatchPoketInput.catchPoketMon();
//		System.out.println(catchPoket);
		
		// TODO 010 TEST 009에 MonsterBall의 집합에 객체를 입력한다.
		JiwooMaster jiwoo = new JiwooMaster();
		int cnt = 0;
		System.out.println("가방의 크기 : " + JiwooMaster.bag.length);
		while(cnt < 4 ) {
			jiwoo.addPoketMon();
			cnt++;
		}
		System.out.println("처음 여행 후 지우 가방의 포켓몬" + Arrays.toString(JiwooMaster.bag));
	}

}
