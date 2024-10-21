package com.example.edu.poketmon;

//TODO 005 포켓몬을 가지고 있는 한개의 객체
public class MonsterBall {

	private String name;
	private float height;
	private String feature;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public float getHeight() {
		return height;
	}


	public void setHeight(float height) {
		this.height = height;
	}


	public String getFeature() {
		return feature;
	}


	public void setFeature(String feature) {
		this.feature = feature;
	}


	public MonsterBall(String name, float height, String feature) {
		super();
		this.name = name;
		this.height = height;
		this.feature = feature;
	}


	@Override
	public String toString() {
		return String.format("포켓몬 %s : 키 : %f, 특성 : %s", name, height, feature);
	}
}
