package com.card.game;

import java.util.Objects;

/*
 * 모양과 숫자가 조합되어 있는 한장의 카드를 만들어 내는 클래스
 */
public class CardOne {
	private String one;
	public static final String[] SHAPE = {"♠","◆","♥","♣"};
	public static final String[] NUMBER = 
		{"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
	
	public CardOne() {
		int a =(int)(Math.random()*SHAPE.length);
		int b =(int)(Math.random()*NUMBER.length);
		
		one = SHAPE[a]+NUMBER[b];
	}

	public String getOne() {
		return one;
	}

	@Override
	public String toString() {
		return one;
	}

	@Override
	public int hashCode() {
		return Objects.hash(one);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CardOne other = (CardOne) obj;
		return Objects.equals(one, other.one);
	}
	
	
}
