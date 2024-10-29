package com.lotto.box;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 멤버필드에 로또 한줄(6개의 랜덤숫자)을 가지고 있는 객체
 * 판단(중복검사), 입력(한개의 숫자)
 * 생성자(default로 멤버필드를 6개 array 만들어주는 기능 - Chaining)
 * 생성자 overloading (숫자를 입력받아서, 입력 받은 숫자만큼 멤버필드 array를 초기화)
 * 멤버필드를 외부에서 입력되지 않도록 하고, 생성자를 통해서만 lotto를 만들 수 있도록 함 private - getter 메소드만 생성  
 */
// 반자동
// 수동
// 5개 뽑기
public class LottoRow {
	private int[] lotto_one;
	
	public LottoRow() {
		this(6); // 기본 생성성자로 생성시 6개의 Array를 가진 멤버필드를 만듬
	}
	
	
	public LottoRow(int n) {
		super();
		lotto_one = new int[n];
		this.lottoMake();
//		this.lotto_print();
	}
	
	// 생성은 무조건 생성자를 통해서만 생성하고
	// 외부에서 lotto_one의 객체는 가져갈 수 만 있게 만든다.
	public int[] getLotto_one() {
		return lotto_one;
	}	
	
	// 랜덤의 숫자를 입력받아 멤버필드의 Array와 비교하여 같은 값이 있는지 확인하는 메소드
	public boolean isCheck(int rNum) {
		boolean isc = false;
		for (int i = 0; i < lotto_one.length; i++) {
			if(lotto_one[i] == rNum) {
				isc = true;
				break;
			}
		}
		return isc;
	}
	
	public void setLotto_one(int[] lotto_one) {
		this.lotto_one = lotto_one;
	}


	private void lottoMake() {
		int idx = 0; // 입력할 Array의 위치
		while(true) {
			int rNum = (int)(Math.random()*45)+1;
			if(!isCheck(rNum)) {
				lotto_one[idx++] = rNum;
			}
			if(idx == lotto_one.length) {
				break;	
			}
		}
		Arrays.sort(lotto_one);
	}
	
	private void lotto_print() {
		System.out.println(Arrays.toString(this.lotto_one));
	}
	
	public void lotto_Game(int n) {
		for (int i = 1; i <= n; i++) {
			new LottoRow();
			if (i % 5 == 0) {
				System.out.println("------------------------------------------------");
			}
		}
	}
	
	public void lotto_ChangeNum(int n) {
		Scanner scan = new Scanner(System.in);
		int[] intArr = new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("번호 넣어");
			intArr[i] = scan.nextInt();
			lotto_one[i] = intArr[i];
		}
		Arrays.sort(lotto_one);
		System.out.println(Arrays.toString(lotto_one));
	}
	
	@Override
	public String toString() {
		return   Arrays.toString(lotto_one);
	}
}
