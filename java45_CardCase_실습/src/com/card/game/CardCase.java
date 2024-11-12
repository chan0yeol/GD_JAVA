package com.card.game;

import java.util.ArrayList;
import java.util.List;

public class CardCase {
	private List<CardOne> cardcase;

	public CardCase() {
		cardcase = new ArrayList<CardOne>();

		make();
	}

	private void make() {
		int cnt = 0;
		while (true) {
			CardOne one = new CardOne();
			if (!cardcase.contains(one)) {
				cardcase.add(one);
				cnt++;
			}

			if (cnt == CardOne.SHAPE.length * CardOne.NUMBER.length) {
				break;
			}

		}

	} // make() end 

	public List<CardOne> getCardcase() {
		return cardcase;
	}
	
	
	
}
