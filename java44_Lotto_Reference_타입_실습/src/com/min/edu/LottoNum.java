package com.min.edu;

/*
 * 로또 번호 한개를 만들어 내는 클래스
 */
public class LottoNum {
	private String one;

	// new를 하면 멤버필드 값에 01~45까지 문자열 대입해줌
	public LottoNum() {
		String tmp = String.valueOf((int) (Math.random() * 45) + 1);
		one = tmp.length() == 2 ? tmp : "0" + tmp;
	}

	public String getOne() {
		return one;
	}

	// 객체의 멤버필드가 출력되도록
	@Override
	public String toString() {
		return one;
	}

}
