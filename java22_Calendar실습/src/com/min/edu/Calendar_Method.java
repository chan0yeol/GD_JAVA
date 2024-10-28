package com.min.edu;

import java.time.LocalDate;
import java.time.Year;

/**
 * 연산을 통한 메소드 호출 방식으로 구현한 달력 출력 클래스
 * 
 * @author 오찬열
 * @since 2024.10.25.
 * @version 1.0
 *
 */

public class Calendar_Method {
	// TODO 001 필요한 고정 값인 윤년과 평년의 각 월에 최대일수를 가지고 있는 변수 Array
	private final int[] LEAF = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 윤년
	private final int[] PLAIN = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 평년
	// TODO 002 윤년 판단 메소드

	/**
	 * 년도 정수를 입력받아 해당 년도가 윤년여부를 판단하는 메소드 윤년은 4의 배수
	 * 
	 * @param year 년도
	 * @return true 윤년 , false 평년
	 */
	public boolean isCheckYear(int year) {
//		boolean isc = false;
//		if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			isc = true;
//		}
		return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
	}

	/**
	 * 연도를 입력받아 이전까지 연도의 윤년/평년을 판단하여 <br>
	 * 366일 혹은 365일을 더해 일수의 총합을 구하는 메소드
	 * 
	 * @param year 년도
	 * @return 입력년도 이전까지(1~year)의 총 일수의 합
	 */
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
		// TODO 004 해당년도의 월을 누적하여 일수의 총 합을 반환하는 메소드.

	/**
	 * 입력받은 년, 월에서 년도를 윤년 판단하고 입력받은 월 이전까지의 최대 월 일수의 총 합을 반환하는 메소드.
	 * 
	 * @param year  년도
	 * @param month 월
	 * @return 입력받은 년도의 1월부터 month 까지의 총 일수
	 */
	public int calDay(int year, int month) {
		int days = calDay(year);
		for (int i = 1; i < month; i++) {
			if (isCheckYear(year)) {
				days += LEAF[i - 1]; // 입력값은 월 숫자이기 때문에 1부터 시작하지만 값을 가져오는 곳은 array index로 되어있기 때문에 0
			} else {
				days += PLAIN[i - 1];
			}
		}

		return days;
	}// calDay 년도 + 월 누적 일수
		// TODO 005 해당 연도 + 월 + 일 까지의 총 일수 합.

	/**
	 * 입력받은 년/월/일 <br>
	 * 1) 년도(윤년판단) 이전의 일수 누적(calDay(int)) <br>
	 * 2) 해당년도(윤년판단) 입력받은 월 이전 까지의 일수 누적 (calDay(int,int))<br>
	 * 3) 입력 일 까지 누적
	 * 
	 * @param year  대상년도
	 * @param month 대상월
	 * @param date  대상 일
	 * @return 1~year + 1~month + date 의 총 일수 합
	 */
	public int calDay(int year, int month, int date) {
		int days = calDay(year, month);
//		days += date;
		return days + date;
	} // calDay year+month+date 총 일수 합 end

	// TODO 006 메소드에서 반환된 전체일수를
//				1) 일주일 7일이라는 기준에 따라 연산하여 나머지를 구하고
//	  			2)1년1월1일은 월요일이기 때문에 연산된 일수에 +1 해줘야함.
//				3) 이전달의 마지막 요일을 구하기 힘들때(달의 최대일수는 계속해 변하기 때문에) 구하고자 하는 달의 1을 입력하여 일수를 구하고 -1을 하면 이전달의 마지막을 구할 수 있다.
	/**
	 * 년도와 월을 입력받아 달력을 계산하여 출력해주는 메소드
	 * 
	 * @param year
	 * @param month
	 */
	public void calendar_Print(int year, int month) {
		System.out.printf("\t\t%d년도\t%d월\n", year, month);
		System.out.print("일\t월\t화\t수\t목\t금\t토\n");
		// 월의 첫1일 전의 공백
		// 총일수 -1 (전달의 마지막 일수) +1(그레고리력의 시작은 1년1월1일 월요일이기 때문)
		// %7을하면 이전달의 7일내의 공간이 나옴
		int dayOfWeek = (calDay(year, month, 1) - 1 + 1) % 7;
//		System.out.print(dayOfWeek);
		// 이전달력의 최대값을 구함 getDayOfMonth(year,month-1) - 공백

//		int beforeDayOfMonth = getDayOfMonth(year, month-1); // 1월이라면 -1하면 0월이 되어버려 IndexOutOf... Exception이 발생한다
		// 1월이 입력되면 년도를 -1하고 월을 12로 만들어주는 메소드를 추가하자.
		int beforeDayOfMonth = beforeMonth(year, month); // 선생님은 메소드를 만들어 1월이라면 연도를 -1해주고 월을 12월로 변경해주는 메소드를 작성함
//		int beforeDayOfMonth = month!=1?getDayOfMonth(year, month-1):getDayOfMonth(year-1, 12); // 난 이렇게 함.

		for (int i = beforeDayOfMonth - dayOfWeek + 1; i <= beforeDayOfMonth; i++) {
			System.out.printf("%d\t", i);
		}
//		for(int i=0;i<dayOfWeek;i++) {
//			System.out.print("-\t");
//		}			

		// 해당 달의 최대 일수
		// TODO 007_02
		int dayOfMonth = getDayOfMonth(year, month); // 윤년인지 판단하여 해당 월의 일수 받아옴.
//		System.out.println(dayOfMonth);
		for (int i = 1; i <= dayOfMonth; i++) {
			System.out.print(i + "\t");
			if ((dayOfWeek + i) % 7 == 0) {
				System.out.print("\n");
			}
		}

		// 다음 달의 일수
//		int afterDays = 7 - (dayOfWeek+dayOfMonth)%7;
		int afterDays = (7 - (dayOfWeek + dayOfMonth) % 7) % 7;

//		System.out.println(nextDay);
		for (int i = 1; i <= afterDays; i++) {
			System.out.printf("%d\t", i);
		}
	}

	private int beforeMonth(int year, int month) {
		return month == 1 ? getDayOfMonth(year - 1, 12) : getDayOfMonth(year, month - 1);
	}

	// TODO 007_01
	// ** 메소드내 에서 int dayOfMonth = getDayofMonth(year,month) 선언 // // todo 007_02
	// 선언된 라인에서 라인번호 도움말 버튼 create문을 자동 생성할 수 있도록 된다.
	// 1)int dayOfMonth 대입 변수가 선언되어 있기 때문에 생성되는 메소드는 반환타입으로 int를 갖게 된다.
	// 2)getDayOfMonth(year,month) 에서 year와 month는 argument의 paramenter 변수 이다. 타입이
	// int 이기 때문에 생성시 int로 되고 변수명은 자동으로 year/month로 된다.
	// ***** 메소드를 실행(호출)한다는 의미는 작성된 메소드의 부탁하는 타입과 필요로 argument의 갯수를 넣어 주는 것을 의미하고
	// 반환은 메소드를 확인하면 반환되는 타입이 있다면 같은 타입으로 받아주고 변수에 담아준다.
	// 어떠한 것도 반환하지 않는다는 것은 메소드가 void로 선언되어 있다.
	/**
	 * 년도와 월을 입력받아 해당 년도의 해당월의 최대일수를 반환한다.
	 * 
	 * @param year  윤년판단을 위한 년도
	 * @param month 구하고자 하는 월 <b> 입력은 숫자이기 때문에 1부터이지만 검색 index는 0부터이기 때문에 -1
	 * @return 윤년/평년을 판별한 구하고자 하는 달의 최대 일수
	 */
	private int getDayOfMonth(int year, int month) {
//		if(isCheckYear(year)) {
//			return LEAF[month-1];
//		} else {
//			return PLAIN[month-1];
//		}
		return isCheckYear(year) ? LEAF[month - 1] : PLAIN[month - 1];
	}

	/**
	 * 해당 일자까지의 총 일수의 합을 입력받아 무슨요일인지 판단해서 리턴하는 메소드.
	 * 
	 * @param days => 1~year + 1~month + date 의 총 일수 합
	 * @return String ["일","월","화","수","목","금","토"]
	 */
	public String dayCheck(int days) {
		days = days % 7;
		String[] dayStr = { "일", "월", "화", "수", "목", "금", "토" };
		return dayStr[days];
	}

	/**
	 * 
	 * @param toDay     오늘 날짜까지의 총 일수의 합
	 * @param targetDay 해당 날짜까지의 총 일수의 합
	 * @return
	 */
	public int dDay(int toDay, int targetDay) {
		return Math.abs(toDay - targetDay) + 1;
	}

}
