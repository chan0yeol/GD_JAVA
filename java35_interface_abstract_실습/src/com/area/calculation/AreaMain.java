package com.area.calculation;

public class AreaMain {

	public static void main(String[] args) {
		AreaImpl area = ChoiceArea.choiceShape();
		ChoiceArea.delegater(area);
	}
}
