package com.game.baseball.play;

/**
 * Hitter와 Pitcher에서 생성된 array를 비교하여 strike과 ball의 갯수를 판단하는 클래스
 * @author 전민균
 *
 */
public final class Umpire {

	private int[] pBox;
	private int[] hBox;
	
	/**
	 * 사용자가 키보드로 입력받아 완성된 Array를 멤버필드에 대입하는 메소드
	 * @param 사용자 int[]
	 */
	public void setpBox(int[] pBox) {
		this.pBox = pBox;
	}
	/**
	 * 컴퓨터가 자동으로 생성된 Array를 멤버필드에 대입하는 메소드
	 * @param 컴퓨터 int[]
	 */
	public void sethBox(int[] hBox) {
		this.hBox = hBox;
	}
	
	/**
	 * 멤버필드 두개의 Array 비교하여<br>
	 * index 같고, 해당 값이 같은 것을 찾아 count를 세주는 메소드
	 * @return index와 값이 같은 갯수 정수
	 */
	public int getStrike() {
		int cnt =0;
		for (int i = 0; i < hBox.length; i++) {
			if(hBox[i] == pBox[i]) {
				cnt++;
			}
		}
		return cnt;
	}
	/**
	 * 멤버필드 두개의 Array 비교하여<br>
	 * index는 다르지만 같은 값을 가진 것을 찾아 count를 세주는 메소드
	 * @return 값은 같고 index 다른 것의 갯수 정수
	 */
	public int getBall() {
		int cnt = 0;
			for (int i = 0; i < hBox.length; i++) {
				for (int j = 0; j < pBox.length; j++) {
					if(i != j && hBox[i] == pBox[j]) {
						cnt++;
					}
				}
			}
		return cnt;
	}
}







