package com.min.edu;

// TODO 00102 Animal을 extends하는 자식 클래스
public class Cat extends Animal {

	/* 멤버필드 */
	private String catName;

	/* 생성자, 생성자오버로딩 */
	public Cat() {
	}

	public Cat(String catName) {
		super();
		this.catName = catName;
		
	}

	/* getter / setter */
	public String getCatName() {
		return catName;
	}

	public void setCatName(String catName) {
		this.catName = catName;
	}

	/* toString() */
	@Override
	public String toString() {
		return "Cat [catName=" + catName + "]";
	}

}
