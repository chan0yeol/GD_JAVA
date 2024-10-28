package com.example.ant;

public class AntP {
//	public void antProcess(String str, int n) {
//		for(int i = 1; i<=n;i++) {
//			String result = next(str);
//			System.out.println(result);
//			str = result;
//		}		
//	}
	public String next(String str, int n) {
		String next = "";
		char currentC = str.charAt(0);
		int cnt = 1;
		for(int i = 1; i <str.length(); i++) {
			if(str.charAt(i) == currentC) {
				cnt++;
			} else {
				next = next+currentC+cnt;
				currentC = str.charAt(i);
				cnt = 1;
			}
		}
		next = next + currentC+cnt; 
		System.out.println(next);
		n--;
		if(n <= 0) {
			return next;
		}
		return next(next, n);
	}
}
