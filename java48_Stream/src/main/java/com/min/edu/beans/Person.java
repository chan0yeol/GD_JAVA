package com.min.edu.beans;
// TODO 002 people.json을 자바 객체로 사용하기 위한 DTO/VO 객체
public class Person {
	private final Integer id;
	private final String firstName;
	private final String lastName;
	private final String email;
	private final String gender;
	private final Integer age;

	public Person(Integer id, String firstName, String lastName, String email, String gender, Integer age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public Integer getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmail() {
		return email;
	}

	public String getGender() {
		return gender;
	}

	public Integer getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "PeopleDto [id=" + id +
				", firstName=" + firstName +
				", lastName=" + lastName +
				", email=" + email +
				", gender=" + gender +
				", age=" + age +
				"]";
	}

	
}
