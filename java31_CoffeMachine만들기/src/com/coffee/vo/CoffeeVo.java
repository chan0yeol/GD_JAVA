package com.coffee.vo;

/**
 * <h3>커피의 정보</h3>
 * 커피의 정보(종류, 가격, 잔돈, 잔수)를 가지고 있는 클래스
 * @author 오찬열
 *
 */
public class CoffeeVo {
	/**
	 * 커피의 종류
	 */
	private String coffeeName;
	/**
	 * 커피의 가격
	 */
	private int price; // 가격
	/**
	 * 커피 구매 후 잔돈
	 */
	private int pay; // 잔돈
	/**
	 * 커피 구매 잔수
	 */
	private int cup; // 잔수
	/**
	 * 커피 객체를 생성하기 위한 생성자 오버로딩
	 * @param coffeeName 커피이름
	 * @param price 커피 가격
	 * @param pay 구매 후 잔돈
	 * @param cup 커피의 갯수
	 */
	public CoffeeVo(String coffeeName, int price, int pay, int cup) {
		super();
		this.coffeeName = coffeeName;
		this.price = price;
		this.pay = pay;
		this.cup = cup;
	}
	
	/* Getter start */
	/**
	 * 커피 이름 Getter
	 * @return String
	 */
	public String getCoffeeName() {
		return coffeeName;
	}
	/**
	 * 가격 Getter
	 * @return int 가격
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * 잔돈 Getter
	 * @return int 잔돈
	 */
	public int getPay() {
		return pay;
	}
	/**
	 * 잔수 Getter
	 * @return int 잔수
	 */
	public int getCup() {
		return cup;
	}
	/* Getter end */
	
	
	
}
