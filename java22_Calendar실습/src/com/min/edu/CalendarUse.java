package com.min.edu;

import java.util.Calendar;
import java.util.Date;

public class CalendarUse {
	public void calendar_Api() {
		// java에서 날짜 관련 클래스
		// java.util.Date, java.sql.Date, java.util.Calendar
//		Date myDate = new Date(2024, 1, 1); // deprecate 된 메소드는 가능하면 사용하지 말자.
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR) + "현재년도");
		
		cal.set(2024, 0-1, 1); // Calendar 클래스에 년 월 일 세팅  2023 12 1이 된다. month는 -1을 해라
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)+ "입력된 요일"); 
		System.out.println(cal.getActualMaximum(Calendar.DAY_OF_MONTH )); // 입력월의 최대 일수 
		
	}
}
