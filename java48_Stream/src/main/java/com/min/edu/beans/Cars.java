package com.min.edu.beans;

// TODO 001 Cars.json을 자바객체로 사용하기 위한 DTO/VO객체
public class Cars {
	private final Integer id;
	private final String make;
	private final String model;
	private final Double price;
	private final Integer year;
	private final String color;

	public Cars(int id, String make, String model, double price, int year, String color) {
		this.id = id;
		this.make = make;
		this.model = model;
		this.price = price;
		this.year = year;
		this.color = color;
	}

	public Integer getId() {
		return id;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public Double getPrice() {
		return price;
	}

	public Integer getYear() {
		return year;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "CarsDto [id=" + id +
				", make=" + make +
				", model=" + model +
				", price=" + price +
				", year=" + year
				+ ", color=" + color +
				"]";
	}
	
	

}
