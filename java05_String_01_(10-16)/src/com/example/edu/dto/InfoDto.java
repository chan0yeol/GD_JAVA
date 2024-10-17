package com.example.edu.dto;

import java.util.Objects;

// 사람의 정보를 담거나(저장) 전송할 수 있는 객체
//각각의 멤버필드를 가져갈 수 만 있는 class
// 둘리 , 40 , 얼음별, 
public class InfoDto {
	private String name;
	private int age;
	private String address;

	@Override
	public String toString() {
		return "InfoDto [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address, age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InfoDto other = (InfoDto) obj;
		return Objects.equals(address, other.address) && age == other.age && Objects.equals(name, other.name);
	}

	public InfoDto(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddress() {
		return address;
	}

}
