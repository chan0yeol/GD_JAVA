package com.min.edu.sort;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionsSortMain {

	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<Integer>();
		numList.add(1);
		numList.add(11);
		numList.add(2);
		System.out.println("sort전 출력" + numList);
		// List의 출력을 뒤집어준다.
		// => List의 sort는 오름차순이 기본이고
		// => 내림차순으로 만들기 위해서는 sort한 후 reverse()를 통해 역으로 출력해야함.
		Collections.sort(numList);
		System.out.println("sort후 출력" + numList);
		Collections.reverse(numList); 
		System.out.println("리버트 출력 : " + numList);
		
		System.out.println("-0-------------------");
		List<String> strList = new ArrayList<String>();
		strList.add("1");
		strList.add("2");
		strList.add("11");
		System.out.println("sort전 출력" + strList);
		Collections.sort(strList);
		Collections.sort(strList, null);
		System.out.println("sort후 출력" + strList); // 문자열 알파벳 순으로 정렬이 되기 때문에 문자열 숫자는 sort하기 어렵다.
		
		System.out.println("-------------------------");
		System.out.println("문자열 숫자의 정렬은 문자를 숫자로 변경후에 비교하여 버블정렬을 만들어 냄");
		Collections.sort(strList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare(Integer.parseInt(o2), Integer.parseInt(o1));
//				return o1.compareTo(o2);
			};
		});
		System.out.println("compare Override를 통한 sort : "+strList);
		List<String> sortStrStream = strList.stream().sorted((o1,o2) 
				-> Integer.compare(Integer.parseInt(o1), Integer.parseInt(o2))).collect(Collectors.toList());
		System.out.println("Stream을 통한 sort : " + sortStrStream);
		
	}
	
	
}
