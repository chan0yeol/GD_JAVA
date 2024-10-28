package com.min.edu;

public class Calendar_Example {
	private final int[] LEAF = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private final int[] PLAIN = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeaf(int year) {
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	public int calDay(int year) { // 1/1/1일부터 입력받은 year 전까지의 일수 총합
		int days = 0;
		for (int i = 1; i < year; i++) {
			if (isLeaf(year)) {
				days += 366;
			} else {
				days += 365;
			}
		}
		return days;
	}

	public int calDay(int year, int month) { // 2 4 연도와 월을 입력받아 해당 월 전까지의 일수 총합.
		int days = calDay(year);
		for (int i = 1; i < month; i++) { // 0 1 2 3
			if (isLeaf(year)) { // 연도가 윤년이라면
				days += LEAF[i - 1]; // 윤년이라면
			} else {
				days += PLAIN[i - 1]; // 윤년이 아니라면
			}
		}
		return days;
	}

	public int calDay(int year, int month, int day) { // 입력받은 년도와 월의 1일 까지의 누적 일수를 반환한다.
		int days = calDay(year, month);
		return days + day;
	}

	private int chkMonthd(int year, int month) {
		return isLeaf(year) ? LEAF[month - 1] : PLAIN[month - 1];
		// 윤년이라면 윤년의 달의 일수를 갖고 있는 LEAF array에서 가져와야한다
		// 가져올떄 입력받은 현재 달이 아닌 이전 달의 최대 일수를 가져올 것 이기 때문에
		// index번호를 맞추기 위해 month-2를 해서 가져온다
	}

	private int chkOne(int year, int month) {
		return month == 1 ? chkMonthd(year - 1, 12) : chkMonthd(year, month - 1);
		// 입력받은 월이 1월일때 이전달을 구하려 -2을하면 indexException이 발생하기 때문에 체크해준다.
	}

	public void cal_Print(int year, int month) {
		int monthStartDay = (calDay(year, month, 1) - 1 + 1) % 7; // 입력받은 월의 시작요일을 구한다.
		// 우리의 달력은 일요일부터 시작하기 때문에 1.일요일 2.월요일 3.화요일 --- 7.토요일로 하기 위해 +1을 한후 %7을 하여 요일을
		// 구한다.
//		System.out.println(monthStartDay); => 3 시작요일은 화요일이기 때문에 제대로 나옴 
		int chkMonthDay = isLeaf(year) ? LEAF[month - 1] : PLAIN[month - 1]; // 해당 월의 최대 일수 확인
		// 출력하고자 하는 달은 month이나 LEAF,PLAIN은 array 이기때문에
		// index 는 0에서 시작한다. 따라서 month에서-1을 해준다.

		int p = chkOne(year, month); // 입력받은 달의 이전 달의 최대 일 수를 받아온다.
		// year,month가 전달되면 chkOne에서 month가 1인지 체크하고 chkMonthd 에서
		// 윤년 여부를 체크하여 LEAF,PLAIN에서 해당하는 달의 최대일수를 가져온다.
//		System.out.println(p); // -> 9월이기 때문에 30 으로 잘 나왔다.

		// 입력받은 달의 이전인 요일에 이전 달의 일수를 찍어줄 것이다.
		// 그러기 위해선
		for (int i = p - monthStartDay + 1; i <= p; i++) {
			System.out.printf("%d\t", i);
		}

//		for(int i=1; i<monthStartDay;i++) { // 입력받은 달의 1일보다 이전인 요일에 -를 넣어주는 for문
//			System.out.print("-\t");
//		}

		for (int i = 1; i <= chkMonthDay; i++) { // 입력받은 월을 출력해주는 for문
			System.out.printf("%d\t", i);
			if ((monthStartDay + i) % 7 == 0) {
				System.out.print("\n");
			}
		}

		int afterMonthDay = (7 - (monthStartDay + chkMonthDay) % 7)%7;
		for (int i = 1; i <= afterMonthDay; i++) { // 입력받은 달의 마지막 남는 요일을 채워주는 for문
			System.out.printf("%d\t", i + 1);
		}

	}
	
	public void cal_Print(int year) {
		
		for(int i = 1 ; i<=12; i++) {
			System.out.printf("\t\t%d년도\t%d월\n", year, i);
			System.out.print("일\t월\t화\t수\t목\t금\t토\n");
			cal_Print(year,i);
			System.out.println();
			System.out.println();
		}
		
	}

}
