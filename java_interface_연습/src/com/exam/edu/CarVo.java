package com.exam.edu;

public class CarVo {
	private String carName;
	private int carTire;
	private int carDoor;
	private int carPrice;
	public CarVo(String carName, int carTire, int carDoor, int carCC,int carPrice) {
		super();
		this.carName = carName;
		this.carTire = carTire;
		this.carDoor = carDoor;
		this.carCC = carCC;
		this.carPrice = carPrice;
	}
	public int getCarPrice() {
		return carPrice;
	}
	public String getCarName() {
		return carName;
	}
	public int getCarTire() {
		return carTire;
	}
	public int getCarDoor() {
		return carDoor;
	}
	public int getCarCC() {
		return carCC;
	}
	private int carCC;
	
	
}
