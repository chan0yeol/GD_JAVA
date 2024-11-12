package com.min.edu.beans;

//TODO 003 Person 객체의 값중 필요한 값을 PersonDTO
/*
 * 프로덕션 :
 */
public class PersonDTO {
	private final Integer id;
	private final String name;
	private final Integer age;
	public PersonDTO(Integer id, String name, Integer age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	// TODO 004 Person 데이터를 입력받아 필요한 값만 추출하여 새로운 객체로 만듬 프로덕션
	public static PersonDTO map(Person person) {
		
		return new PersonDTO(person.getId(), 
				person.getFirstName(), 
				person.getAge());
	}
	
}
