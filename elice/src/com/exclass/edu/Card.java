package com.exclass.edu;

public class Card {
	 String kind;
	 int number;
	 static int width = 100;
	 static int height = 250;
	 public Card(String kind, int number) {
		 this.kind = kind;
		 this.number = number;
	 }
	 public String toString() {
	  return kind + ":" + number + "(" + width + "," + height + ")";
	  }
}
