package elice.edu;

import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		int[] coin = { 500, 100, 50, 10, 5, 1 };
	    int[] cnt = { 5, 5, 5, 5, 5, 5 };
	    int[] coinCnt = { 0, 0, 0, 0, 0, 0 };
	    Scanner scan = new Scanner(System.in);
	    
	    int money = scan.nextInt(); 
	    int maxMoney = 0;
	    for(int i=0; i<coin.length;i++) {
	    	maxMoney += coin[i]*cnt[i];
	    }
	    if(money > maxMoney) {
	    	System.out.println("동전 부족");
	    } else {
	    	for(int i=0;i<coin.length;i++) {
	    		if(money == 0) break;
	    		
	    		int needCoin = money/coin[i];
	    		
//	    		int useCoin = Math.min(needCoin, cnt[i]);
	    		int useCoin = needCoin<=cnt[i]?needCoin:cnt[i];
	    		
	    		
	    		money -= useCoin * coin[i];
	    		coinCnt[i] += useCoin;
	    		cnt[i] -= useCoin;
	    	}
	    	for (int i = 0; i < coin.length; i++) {
                    System.out.printf("%d원: %d개\n", coin[i], coinCnt[i]);
            }

            // 남은 동전 출력
            for (int i = 0; i < coin.length; i++) {
                System.out.printf("남은 동전 %d원: %d개\n", coin[i], cnt[i]);
            }
	    }
	    
	}
}
