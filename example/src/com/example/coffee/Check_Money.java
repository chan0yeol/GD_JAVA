package com.example.coffee;

public class Check_Money {
	public boolean checkMoney(int menu, int money, int each) {
		switch (menu) {
			case 1: {
				menu = 1500;
				break;
			}
			case 2: {
				menu = 2500;
				break;
			}
			case 3:{
				menu = 3000;
				break;
			}
		}
		if(money < (menu * each)) {
			System.out.println(((menu*each)-money)+"원 부족합니다. 돈을 넣어주세요");
			return true;
		}
		return false;
	}
}
