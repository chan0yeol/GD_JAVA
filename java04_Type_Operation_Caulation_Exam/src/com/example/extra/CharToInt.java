package com.example.extra;


import org.junit.Test;

import com.util.edu.MakeUserCharacter;

public class CharToInt {
	@Test
	public void fnExtra() {
		char a ='!';
		int r = MakeUserCharacter.getNemericValue(a);
		System.out.println("결과 : " + r);
		System.out.println();
	}
}
