package com.exam.edu;

public interface ICar {

	void car();

	void makeCar(String carName, int carTire, int carDoor, int carCC, int carPrice);

	/**
	 * 출력 하는 메소드 선언
	 */
	void print();

	void print(CarVo carVo);
}
