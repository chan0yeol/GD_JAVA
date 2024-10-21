package com.example.edu.poketmon;

import java.util.Scanner;

// TODO 007 포켓몬의 정보를 키보드를 통해 입력받아 MonsterBall 객체를 만들어냄
public class CatchPoketInput {

	public static MonsterBall catchPoketMon() {
		MonsterBall tmpBall = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("입력방법! 이름/키/특성 의 형식으로 입력해 주세요");
		String monster = scan.nextLine();
		
		String[] tmp =monster.split("/"); 
		
		tmpBall = new MonsterBall(tmp[0], Float.parseFloat(tmp[1]), tmp[2]);
		return tmpBall;
	}
	
}
