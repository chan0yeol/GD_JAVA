package com.exam.edu;

import java.util.Scanner;

public class ChoiceCar {
	public static CarImpl choice() {
		CarImpl obj = null;
		System.out.println("1.소나타2.애플카");
		Scanner scan = new Scanner(System.in);
		switch (scan.nextInt()) {
		case 1 -> obj = new Sonata();
		case 2 -> obj = new AppleCar();
		}
		return obj;
	}

	public static void delegate(CarImpl carImpl) {
		if (carImpl == null) {
			System.out.println("아직 안만들어짐");
		} else {
			carImpl.car();
			carImpl.makeCar("소방차", 2, 2, 1000, 5000);
			carImpl.print();
			carImpl.print(carImpl.carVo);
		}
	}
}
