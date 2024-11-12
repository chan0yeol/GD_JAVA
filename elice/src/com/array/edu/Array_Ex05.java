package com.array.edu;

import java.util.Scanner;

public class Array_Ex05 {
	public static void main(String args[]) {
	    int[] coin = { 500, 100, 50, 10, 5, 1 };
	    int[] cnt = { 5, 5, 5, 5, 5, 5 };
	    int[] coinCnt= {0,0,0,0,0,0};
	    Scanner scan = new Scanner(System.in);
	    int money = scan.nextInt();
	    int maxMoney = 0;
	    while(money > 0) {
	    	for(int i = 0; i<coin.length; i++ ) {
	    		maxMoney = maxMoney + (coin[i]*5);
	    	}
	    	if(maxMoney <= money) {
	    		System.out.println("동전이 부족합니다.");
	    		break;
	    	}
	    	for(int i=0; money >= 0;i++) {
	    		if(money >= 500 && coinCnt[0] < 5) {
	    			money = money - 500;
	    			coinCnt[0]++;
	    		} else if(money >= 100 && coinCnt[1]<5) {
	    			money -= 100;
	    			coinCnt[1]++;
	    		}else if(money >= 50 &&coinCnt[2]<5) {
	    			money -= 50;
	    			coinCnt[2]++;
	    		}else if(money >= 10 && coinCnt[3]<5) {
	    			money -= 100;
	    			coinCnt[3]++;
	    		}else if(money >= 5 && coinCnt[4]<5) {
	    			money -= 100;
	    			coinCnt[4]++;
	    		}else if(money >= 1 && coinCnt[5]<5) {
	    			money -= 100;
	    			coinCnt[5]++;
	    		}		
	    	} // for end
	    	
	    	for(int i =0; i< cnt.length; i++) {
	    		System.out.printf("%d원:%d\n",coin[i],coinCnt[i]);
	    	}
	    	
	    	for(int i = 0; i<coin.length; i++) {
	    		System.out.printf("남은 동전 %d원:%d개\n",coin[i],cnt[i]-coinCnt[i]);
	    	}
	    }
	    scan.close();
	}
}
