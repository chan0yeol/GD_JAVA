package com.coffee.print;

import com.coffee.vo.CoffeeVo;

/**
 * 최종적으로 사용자에게 보여줄 출력
 * @author 오찬열
 *
 */
public class CoffeePrint {
	
	public static void print(CoffeeVo coffeeVo) {
		System.out.println("ヾ(•ω•`)oヾ(•ω•`)oヾ(•ω•`)oヾ(•ω•`)o");
		System.out.println(coffeeVo.getCoffeeName());
		System.out.println("가격"+coffeeVo.getPrice());
		System.out.println("ヾ(•ω•`)oヾ(•ω•`)oヾ(•ω•`)oヾ(•ω•`)o");
		System.out.printf("잔돈:%d / 커피:%d잔\n",coffeeVo.getPay(),coffeeVo.getCup());
	}
}
