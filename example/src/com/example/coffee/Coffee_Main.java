package com.example.coffee;

import java.util.Scanner;

public class Coffee_Main {
	public static void main(String[] args) {
		Coffee_Order co = new Coffee_Order();
		Check_Money cm = new Check_Money();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("|      1.아메리카노  2.카페라떼 3.바닐라라떼 0.주문종료     |");
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			System.out.println("                   메뉴를 골라주세요\n");
			int menu = scan.nextInt();
			if(menu == 0) break;
			switch (menu) {
			case 1: System.out.println("아메리카노는 한잔에 1500원 입니다.");  break;
			case 2: System.out.println("카페라떼는 한잔에 2500원 입니다.");  break;
			case 3: System.out.println("바닐라라떼는 한잔에 3000원 입니다.");  break;
			}
			System.out.println("몇잔 살꺼야 ?\n");
			int each = scan.nextInt();
			System.out.println("돈을 넣어주세요\n");
			int money = scan.nextInt();
			System.out.println(money + "원 받았습니다\n");
			while(cm.checkMoney(menu, money, each)) {
				int money_add = scan.nextInt();
				System.out.println(money_add+"원 받음\n");
				money += money_add;
				System.out.println("받은돈 : " + money);
			}
			
			co.coffee_order(menu, money, each);	
			System.out.println();
		}
		System.out.println("bye");
		
	}
}
