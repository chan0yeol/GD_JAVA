package com.exam.edu;

public class CarMain {

	public static void main(String[] args) {
		CarImpl c = ChoiceCar.choice();
		ChoiceCar.delegate(c);

	}
}
