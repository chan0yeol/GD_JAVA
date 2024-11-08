package com.exam.magicsquare;

import java.util.Scanner;

/*
 * 키보드로 입력받은 숫자를 판단하여 해당하는 마방진의 객체를 생성한다
 * 기능만 가지고 있다 => Single-ton을 사용하겠다.
 * 입력받는 값은 예외처리 정확한 숫자를 받을 때 까지
 * 입력받은 값이 3이하라면 유효값을 처리 -> 예외처리
 * 
 * 클래스의 특징은 부모 클래스에 의해 정해짐.
 * 
 */
public class MagicSquareFactory {
	private static MagicSquareFactory factory;

	private MagicSquareFactory() {

	}

	public static MagicSquareFactory getInstance() {
		if (factory == null) {
			factory = new MagicSquareFactory();
		}
		return factory;
	} // getInstance() end

	// factory
	public MagicSquareImpl factory() throws NoMakeMagicSquareException {
		MagicSquareImpl magic = null;

		int n = 0;
		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("만드는 마방진의 숫자를 입력하세요");
				n = scan.nextInt();
				break;
			} catch (Exception e) {
				System.out.println(e.toString());
			}
		}
		System.out.println(n + "값 마방진 생성중 ------");
		if (n < 2) {
			throw new NoMakeMagicSquareException(n + "의 값은 마방진이 될 수 없습니다.");
		} else if (n % 2 == 1) {
			magic = new OddMagicSquare(n);
		} else if (n % 4 == 0) {
			magic = new EvenMagicSquare(n);
		} else if (n % 4 == 2) {
			System.out.println("개발자에게 문의");
		}

		return magic;
	}

}
