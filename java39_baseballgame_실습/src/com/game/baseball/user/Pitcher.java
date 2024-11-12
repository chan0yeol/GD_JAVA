package com.game.baseball.user;

/**
 * 컴퓨터가 입력받은 크기의 Array에 중복되지 않는 렌덤숫자를 입력하는 클래스<br>
 * 렌덤숫자는 1 ~ 9 이하의 숫자이다
 * @author 전민균
 *
 */
public class Pitcher extends GameImpl {

	/**
	 * Pitcher의 default 생성자<br>
	 * default 생성자를 호출 자동으로 chaining을 통해서 3의 값을 전달
	 */
	public Pitcher() {
		this(3);
	}
	/**
	 * 입력받은 숫자를 통해서 부모의 생성자를 호출해주는  overloading된 생성자
	 * @param 배열의 크기 정수
	 */
	public Pitcher(int n) {
		super(n);
	}
	
	/**
	 *  물려받은(protected) 멤버필드 렌덤수 3개를 입력하는 메소드 
	 */
	@Override
	public void make() {
		int idx = 0;
		int len = box.length;
		while (idx != len) {
			int rNum = makeNum();
			if(!isDuplicate(rNum)) {
				box[idx++] =rNum;
			}
		}
	}
	
	
	/**
	 * Math.ramdom()을 통해서 1~9까지 숫자를 렌덤으로 반환하는 메소드
	 * @return 렌덤숫자 정수
	 */
	private int makeNum() {
		int num = 0;
		num = (int)(Math.random()*9)+1;
		return num;
	}
	
	
	/**
	 * 렌덤숫자를 입력받아 멤버필드의 Array를 모두 확인하여 같은 숫자가 있는지 확인하는 메소드<br>
	 * 같은 값이 있다면 true, 아니라면 false
	 * @param 판단 숫자 정수
	 * @return 중복 true
	 */
	private boolean isDuplicate(int tmp) {
		boolean isc = false;
		for (int i = 0; i < box.length; i++) {
			if(box[i] == tmp) {
				isc = true;
				break;
			}
		}
		return isc;
	}
	
	
	

}



