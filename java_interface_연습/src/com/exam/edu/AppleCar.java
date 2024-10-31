package com.exam.edu;

public class AppleCar extends CarImpl {
	@Override
	public void car() {
		super.name = "애플카";
		super.tire = 8;
	}

	@Override
	public void makeCar(String carName, int carTire, int carDoor, int carCC, int carPrice) {
		super.carVo = new CarVo(carName, carTire, carDoor, carCC, carPrice);
	}
}
