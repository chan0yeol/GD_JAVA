package com.min.edu;

public class PrinterMain {

//TODO 00104 Printer 객체를 사용하여 Animal을 부모로하는 객체를 모두 받아 출력할 수 있다. 
	public static void main(String[] args) {
		Printer<Animal> printer = new Printer<Animal>(new Cat("냥냥이"));
		printer.print();
		
		
		
	}
}
