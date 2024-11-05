package com.elicecollectiong.edu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/*
 * 
화면에서 여러개의 자연수를 입력받아(0을 입력시 입력종료) 이들 중 
홀수인 자연수들만 이루어진 List 객체에 저장, [출력] 예시를 참고하여 
List 객체의 요소들의 합, 최대값과 위치, 최소값과 위치, 중간값을 찾는 프로그램을 작성하시오



조건

1) 자연수가 아닌 경우가 입력되면 무시

2)

- 요소의 갯수가 홀수인 경우의 중간값 : 정렬하여 가운데 위치의 값

- 요소의 갯수가 짝수인 경우의 중간값 : 정렬하여 가운데 위치의 값 2개의 평균

3) 최대값&최소값의 위치는 List의 인덱스 번호로 출력할 것

[입력]

12 77 38 41 53 92 85 aaa 0


 */
public class Collection_ex03 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		while(true) {
			try {
				int n = scan.nextInt();
				if(n == 0) {
					break;
				} else if(n%2 == 0) {
					continue;
				} else {
					list.add(n);
				}
			} catch (Exception e) {
				continue;
			}
		}
		int sum = 0;
		int minIdx = 0, maxIdx = 0;;
		
		for (Integer integer : list) {
			sum += integer;
		}
		for(int i =1; i<list.size();i++) {
			if(list.get(i) < list.get(minIdx)) {
				minIdx = i;
			}
			if(list.get(i) > list.get(maxIdx)) {
				maxIdx = i;
			}
		}
		System.out.println(list+"의 합:"+sum);
//		List<Integer> list2 = list;
		
		Collections.sort(list);
		System.out.println("홀수의 최대값:"+list.get(list.size()-1));
		System.out.println("홀수의 최소값:"+list.get(0));
		System.out.println("홀수의 최대값 위치"+ maxIdx);
		System.out.println("홀수의 최소값 위치"+ minIdx);
		if(list.size()%2 != 0) {
			System.out.println("중간값:"+list.get(list.size()/2));
		} else {
			int n1 = list.get(list.size()/2);
			int n2 = list.get(list.size()/2-1);
			double avg = (n1+n2)/2;
			System.out.println("중간값:"+(double)avg);
		}
		
	}

}
