package com.example.edu.review;
/* TODO 001 pass by reference를 위한 객체 선언
 * 개인정보를 입력 할 수 있는 객체
 * VO(Variable Object) /DTO(Data Transfer Object) 객체 
 * 
 */
public class InfoVo {
	public String name;
	public int age;
	public String address;
	
	public void infoPrint() {
		System.out.println("이름은?" + name);
		System.out.println("나이는?"+ age); 
		System.out.println("주소는?" + address);
	}
}
