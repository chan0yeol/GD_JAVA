package com.exam.magicsquare;

public class NoMakeMagicSquareException extends Exception {

	/**
	 * 같은 부모를 가진 여러명의 자식 클래스를 JVM에서 구분하기 위한 고유 값
	 */
	private static final long serialVersionUID = -4053560378562313772L;

	public NoMakeMagicSquareException() {
		this("입력한 숫자는 마방진이 될 수 없습니다");
	}

	public NoMakeMagicSquareException(String message) {
		super(message);
	}

}
  