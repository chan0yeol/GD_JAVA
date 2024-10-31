package com.exam.edu;

public class Sonata extends CarImpl {
	@Override
	public void car() {
		super.name = "소나타";
		super.tire = 4;
	}

	@Override
	public void makeCar(String carName, int carTire, int carDoor, int carCC, int carPrice) {
		super.carVo = new CarVo(carName, carTire, carDoor, carCC, carPrice);
	}
}
