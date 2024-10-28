package com.min.edu;

public class Calendar_No_Comment {

	private final int[] LEAF = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 윤년
	private final int[] PLAIN = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 평년

	public boolean isCheckYear(int year) { // 윤년체크 
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	public int calDay(int year) {
		int days = 0;
		for (int i = 1; i < year; i++) {
			if (isCheckYear(i)) {
				days += 366;
			} else {
				days += 365;
			}
		}
		return days;
	} // calDay 입력받은 연도 이전까지 누적 일수

	public int calDay(int year, int month) {
		int days = calDay(year);
		for (int i = 1; i < month; i++) {
			if (isCheckYear(year)) {
				days += LEAF[i - 1];
			} else {
				days += PLAIN[i - 1];
			}
		}

		return days;
	}// calDay 년도 + 월 누적 일수

	public int calDay(int year, int month, int date) {
		int days = calDay(year, month);
		return days + date;
	} // calDay year+month+date 총 일수 합 end

	public void calendar_Print(int year, int month) {
		System.out.printf("\t\t%d년도\t%d월\n", year, month);
		System.out.print("일\t월\t화\t수\t목\t금\t토\n");
		int dayOfWeek = (calDay(year, month, 1) - 1 + 1) % 7;
		int beforeDayOfMonth = beforeMonth(year, month); // 선생님은 메소드를 만들어 1월이라면 연도를 -1해주고 월을 12월로 변경해주는 메소드를 작성함

		for (int i = beforeDayOfMonth - dayOfWeek + 1; i <= beforeDayOfMonth; i++) {
			System.out.printf("%d\t", i);
		}
		int dayOfMonth = getDayOfMonth(year, month);
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

	private int beforeMonth(int year, int month) {
		return month == 1 ? getDayOfMonth(year - 1, 12) : getDayOfMonth(year, month - 1);
	}

	private int getDayOfMonth(int year, int month) {
		return isCheckYear(year) ? LEAF[month - 1] : PLAIN[month - 1];
	}

	public String dayCheck(int days) {
		days = days % 7;
		String[] dayStr = { "일", "월", "화", "수", "목", "금", "토" };
		return dayStr[days];
	}

	public int dDay(int toDay, int targetDay) {
		return Math.abs(toDay - targetDay) + 1;
	}

}
