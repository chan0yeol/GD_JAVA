package com.exam.edu;

public abstract class CarImpl implements ICar {

	protected String name;
	protected int tire;

	protected CarVo carVo;

	@Override
	public abstract void car();

	@Override
	public abstract void makeCar(String carName, int carTire, int carDoor, int carCC, int carPrice);

	@Override
	public void print() {
		System.out.printf("%s는 바퀴가 %d개\n", name, tire);
	}

	@Override
	public void print(CarVo carVo) {
		System.out.printf("내가만든차 %s 타이어%d개 %d도어 %dCC %d만원\n", carVo.getCarName(), carVo.getCarTire(),
				carVo.getCarDoor(), carVo.getCarCC(), carVo.getCarPrice());
	}

}
