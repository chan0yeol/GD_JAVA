package com.example.calendar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Calendar {
	public boolean isYoon(int year) {
		return (year % 4 == 0) && (year % 100 != 0) || (year % 100 == 0) && (year % 400 == 0);
	}

	public int countDayToYear(int year) {
		int sumDay = 0;
		for (int i = 1; i < year; i++) {
			if (isYoon(i)) {
				sumDay += 366;
			} else {
				sumDay += 365;
			}
		}
		return sumDay;
	}
	
	public int countDaysToDate(int year, int month) {
//		int sumDay = 0;
		int[] monthArr = { 0, 31,isYoon(year) ? 29:28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int sum=0;
		for(int i = 1; i < month; i++) {
			sum += monthArr[i];
		}

		/*
		 * for (int i = 1; i < month; i++) { switch (i) { case 1, 3, 5, 7, 8, 10, 12:
		 * sumDay += 31; break; case 4, 6, 9, 11: sumDay += 30; break; case 2: if
		 * (isYoon(year)) { sumDay += 29; } else { sumDay += 28; } break; } }
		 */
//		sum += day - 1;
//		sumDay = sumDay + day - 1;
		return sum;
	}
	
	public String isDay(int year, int month, int day) {
		int sumDay = 0;
		// 현재 연도까지 총합
		sumDay += countDayToYear(year);
		// 00월00일 까지의 날짜수 총합
		sumDay += countDaysToDate(year, month);
		sumDay += day-1;
		int today = sumDay % 7;
		return checkDay(today);
	}

	public String checkDay(int day) {
		String[] chkday = { "월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" };
		return chkday[day];
	}
	public int d_Day(int year, int month, int day) {
		LocalDate targetDate = LocalDate.of(year,month,day);
		LocalDate today = LocalDate.now();
		
		return Math.abs((int) ChronoUnit.DAYS.between(targetDate, today));
	}
}
