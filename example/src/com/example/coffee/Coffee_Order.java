package com.example.coffee;

public class Coffee_Order {

	public void coffee_order(int menu, int money, int each){
		switch (menu) {
			case 1: {
				money = money - (each * 1500);
				System.out.println("아메리카노 " +each+"잔 나왔습니다.");
				System.out.println("잔돈은 : " + money);
				break;
			}
			case 2: {
				money = money - (each * 2500);
				System.out.println("카페라떼 " +each+"잔 나왔습니다.");
				System.out.println("잔돈은 : " + money);
				break;
			}
			case 3:{
				money = money - (each * 3000);
				System.out.println("바닐라라떼 " +each+"잔 나왔습니다.");
				System.out.println("잔돈은 : " + money+"원");
				break;
			}
		}
	}
}
