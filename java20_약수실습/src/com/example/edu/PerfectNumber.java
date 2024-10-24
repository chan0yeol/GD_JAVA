package com.example.edu;

public class PerfectNumber {
	YaksuSum ys = new YaksuSum();
	public void pNum(int range) {
		int cnt =0;
		for (int i = 2; i < range; i++) {
			if (pnumCheck(ys.yaksusum(i),i)) {
				System.out.println(i + "는 완전수?");
				cnt++;
			}
		}
		System.out.println(range+"까지 완전수는 총 : " + cnt);
	}
	public boolean pnumCheck(int num, int chkn) {
		return num==chkn;
	}
}
