package com.min.edu;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 1) method를 통해 일수에서 요일을 구하는 메소드
 * 	- calDay(int year), calDay(int, int), calDay(int,int,int) %7 -1 + 1
 * 2) 멤버필드 윤년/평년 일수
 * 3) 1월이라면 전년도 12월로 계산
 * 4) 윤년 판단
 * 
 *
 */
public class Calendar_API {
	public void calendar_Print(int year, int month) {
		System.out.printf("\t\t%d년도\t%d월\n", year, month);
		System.out.print("일\t월\t화\t수\t목\t금\t토\n");
		
		// 해당 년월의 1일의 요일을 계산하기 위한 연산
		// java.util.Calendar는 Abstract(추상클래스)
		// Abstract의 의미는 완성되어 있지 않은 메소드를 포함하고 있다.
		// - new 를 하면 Abstract를 다 구현해서 사용해야 한다.
		// - 부모클래스로 사용하게 된다.
		Calendar calen = Calendar.getInstance();
		Calendar gCal = new GregorianCalendar();
		// month는 입력은 숫자이지만 값을 처리하는 곳은 array로 index이기 때문에 -1해준다.
		// 입력할때는 -1, 출력할때는 +1
		calen.set(year, month-1, 1);
		
		int dayOfWeek = calen.get(Calendar.DAY_OF_WEEK)-1;
		System.out.println(dayOfWeek);
// 		int dayOfWeek = (calDay(year, month, 1) - 1 + 1) % 7;

		int dayOfMonth = calen.getActualMaximum(Calendar.DAY_OF_MONTH);
//		int dayOfMonth = getDayOfMonth(year, month); 
		
//		int beforeDayOfMonth = beforeMonth(year, month);
		
		calen.set(year, month-2, 1);
		
		int beforeDayOfMonth = calen.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		for (int i = beforeDayOfMonth - dayOfWeek + 1; i <= beforeDayOfMonth; i++) {
			System.out.printf("%d\t", i);
		}

		for (int i = 1; i <= dayOfMonth; i++) {
			System.out.print(i + "\t");
			if ((dayOfWeek + i) % 7 == 0) {
				System.out.print("\n");
			}
		}

		int afterDays = (7 - (dayOfWeek + dayOfMonth) % 7) % 7;

		for (int i = 1; i <= afterDays; i++) {
			System.out.printf("%d\t", i);
		}
	}
}
