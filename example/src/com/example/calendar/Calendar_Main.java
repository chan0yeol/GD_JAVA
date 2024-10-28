package com.example.calendar;

public class Calendar_Main {

	public static void main(String[] args) {
		Calendar cal = new Calendar();
		System.out.println(cal.isDay(1, 3, 1));
		System.out.println(cal.d_Day(2024, 10, 26) + "일 후");

	}

}
