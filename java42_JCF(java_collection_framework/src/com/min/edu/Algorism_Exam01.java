package com.min.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set으로 풀자
 * 
 * 서로 다른 자연수들로 이뤄진 배열과 숫자 n이 입력으로 주어진다.
 * 만약 배열(array[])에 서로 다른 2개의 자연수를 합하여 숫자 n을 만드는 것이 가능하다면 true
 * 아니라면 false를 반환하는 함수를 작성하세요
 * 
 * 예를들어
 * 배열이 [5,3,9,13]으로 주어지고 n이 8이라면 5+3은 8이 되기 때문에 true를 반환
 * 배열이 [5,3,9,13]으로 주어지고 n이 7이라면 조합이 없기 때문에 false를 반환
 * 
 * 조건
 * 배열의 크기는 1이상 500,000 이하의 자연수
 * 배열의 원소는 1이상 1,000,000 이하의 자연수
 * n은 자연수 입니다
 * 
 * 
 */

public class Algorism_Exam01 {
	public boolean solution(int[] arr, int n) {
		boolean answer = false;
//		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i<arr.length;i++) {
//			set.add(arr[i]);
//			for(int j =0; j<arr.length;j++) {
//				if((arr[i]+arr[j]) == n) {
//					answer = true;
//					break;
//				}	
//			}
			if(chk(arr,i,n)) {
				answer = true;
				break;
			}
		}
//		Iterator iter = set.iterator();
//		while(iter.hasNext()) {
//			
//		}
		return answer;
	}
	public boolean chk(int[] arr, int i, int n) {
		for(int j = i+1; j<arr.length;j++) {
			if((arr[i]+arr[j]) == n) {
				return true;
			}	
		}
		return false;
	}
}
