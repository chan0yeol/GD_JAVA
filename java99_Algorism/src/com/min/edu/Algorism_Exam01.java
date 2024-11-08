package com.min.edu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Algorism_Exam01 {
	public boolean solution(int[] arr, int n) {
		boolean answer = false;
		Set<Integer> set = new HashSet<Integer>();
//		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			int val = n - arr[i]; // 8 -3
			if(set.contains(val)) { // set에 5가 있는지 확인
				answer = true;
				break;
			}
			set.add(arr[i]); // 아니면 3
		}
		
//		Iterator iter = set.iterator();
//		while(iter.hasNext()) {
//			
//		}
		return answer;
	}
	
	
	public boolean solution_01(int[] arr, int n) {
		boolean answer = false;
		// sort 진행
		Arrays.sort(arr);
		Set<Integer> set = new HashSet<Integer>();
		for (int i : arr) {
			if(i<n) {
				set.add(i);
			} else {
				break;
			}
		}
		
		// n값보다 작은 수들의 집합(Set)에서 한개씩 꺼내서 n에서 차를 구한다. 
		// 구한 차의 값이 set에 존재한다면 조합이 있다.
		
		Iterator<Integer> iter = set.iterator();
		int tmp = 0;
		while(iter.hasNext()) {
			tmp = iter.next();
			set.remove(tmp);
			if(set.contains(n-tmp)) {
				answer =true;
				break;
			}
		}
		return answer;
	}
}
