package com.example.edu;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// 문제
//		입력되는 값은 정수(음수 혹은 양수)
//		2이하의 숫자가 들어오면 생성할 수 없습니다. 메세지 출력
//		3 5 7 9 => 1그룹 
//		4 8 => 2그룹
//		6 10 => 3그룹
//		예시된수를 (3 ~ 10)의 숫자를 입력받을 때 3영역으로 구분하여 출력하는 if문을 작성해보자.
		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력해 주세요");
		int n = scan.nextInt();
		boolean isBool = false;
		if(n <= 2 || n > 10) {
			System.out.println("생성할 수 없습니다.");
		} else if (n%2 != 0) {
			System.out.println("1그룹");
		} else if (n%4 == 0) {
			System.out.println("2그룹");
		} else {
			System.out.println("3그룹");
			isBool = true;
		}

	}

}
