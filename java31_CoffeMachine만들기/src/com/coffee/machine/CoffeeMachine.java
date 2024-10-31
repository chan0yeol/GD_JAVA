package com.coffee.machine;

import com.coffee.print.CoffeePrint;
import com.coffee.vo.CoffeeVo;

/**
 * 커피를 만들기 위해 필요한 로직
 * @author 오찬열
 *
 */
public class CoffeeMachine {
	
	public String coffeeName;
	public int price;
	
	/**
	 * 커피 구매 가격을 입력받아 클래스 내부의 잔돈/커피갯수를 실행하여 Coffee 객체를 생성
	 * @param money 입력 금액
	 */
	public void coffeeProcess(int money) {
		int cup = coffeeMake(money);
		int pay = coffeePay(money);
		CoffeeVo order = new CoffeeVo(coffeeName, price, pay, cup);
		
		CoffeePrint.print(order);
	}

	/**
	 * 입력된 돈만큼 커피 값을 제외하고 남은 금액(잔돈)
	 * @param money 입력금액
	 * @return int 계산 후 남은금액
	 */
	private int coffeePay(int money) {
		
		return money%price;
	}

	/**
	 * 입력된 금액 만큼 커피를 게산하여 잔수를 반환함
	 * @param money
	 * @return int 계산 된 잔수
	 */
	private int coffeeMake(int money) {
		
		return money/price;
	}
}
