package com.min.edu;

import java.time.LocalDate;
import java.util.Calendar;

public class Calendar_Main {

	public static void main(String[] args) {
//		Calendar_Method cm = new Calendar_Method();
//		String chkStr = cm.isCheckYear(4)?"윤년":"평년";
//		System.out.println(chkStr);
//		int days = cm.calDay(2024,10,25); // 1~2023년까지의 일수의 총 합 + 2024.1~2024.9 까지의 일수의 총합.
//		System.out.println(days);
//		System.out.println(days%7);
//		System.out.println(cm.dayCheck(days));

//		달력찍기 테스트 날짜 2025년 1월
//		System.out.println("2025년 1월");
//		System.out.println("\"일\",\"월\",\"화\",\"수\",\"목\",\"금\",\"토\"");
//		cm.calendar_Print(2024, 1);

//		for (int i = 1; i <= 12; i++) {
//			cm.calendar_Print(2024, i);
//			System.out.println("\n\n");
//		}
		
//		d-day를 구하자.
//		int today = cm.calDay(2024, 10, 25);
//		int targetDay = cm.calDay(2025, 4, 7);
//		System.out.println(cm.dDay(today, targetDay));
		
		// TODO 009 달력 API인 java.util.Calendar를 사용한 달력 출력
		// Abstract
//		Calendar_API cApi = new Calendar_API();
//		cApi.calendar_Print(2024, 1);
		CalendarUse cu = new CalendarUse();
		cu.calendar_Api();
		
		
		
		
	}

}
