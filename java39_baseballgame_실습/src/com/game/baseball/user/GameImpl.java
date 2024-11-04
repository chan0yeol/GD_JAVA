package com.game.baseball.user;

import java.util.Arrays;

/**
 * 사용자/컴퓨터의 기능을 정의하고 출력은 구현하는 클래스<br>
 * 사용자/컴퓨터가 가지고 있는 멤버필드인 array 3의 값을 가지고 있는 클래스
 * 
 * @author 전민균
 *
 */
public abstract class GameImpl implements IGame{

	/**
	 * GameImpl을 사용하는 자식클래스에서 멤버필드로 사용하기 위한 갑
	 */
	protected int[] box;
	
	/**
	 * 멤버필드의 Array를 n의 크기만큼 초기화 하는 생성자<br>
	 * 생성된 Array를 입력값이 아닌 -1로 초기화함
	 * @param 배열의 크기 정수
	 */
	public GameImpl(int n) {
		box = new int[n];
		Arrays.fill(box, -1);
//		box = new int[]{1,2,1};
	}
	
	/**
	 * protected 로 되어 있는 멤버필드는 자식에서만 사용이 가능하기 때문에<br>
	 * getter 메소드를 생성하여 package가 다른 경우에도 값을 반환시키기 위한 get메소드 =
	 * @return 생성된 맴버필드 Array
	 */
	public int[] getBox() {
		return box;
	}

	/**
	 * Hitter와 Pitcher 클래스의 요구에 따른 멤버필드 값이 입력 메소드
	 */
	@Override
	public abstract void make();

	/**
	 * 멤버필드의 값을 출력하기 위한 메소드<br>
	 * System.out.printf(); 로 작성
	 */
	@Override
	public void print() {
		System.out.printf("[");
		int i = 0;
		for (; i < box.length-1; i++) {// 0,1
			System.out.printf("%s,",box[i]);
		}
		System.out.printf("%s]\n",box[i]);
	}
	
	/**
	 *  객체를 호출 했을경우 멤버필드의 값을 String문자열로 반환시키는 메소드<br>
	 *  <br>
	 *  [1,2,3]
	 *  <br>
	 *  String.format(); 로 문자열 작성
	 */
	@Override
	public String toString() {
		// 오버라이드 되어 있는 자식 클래스에서만 super를 통해서 부모이 오버라이드 되기 전의 메소드를 호출할 수 있다
//		System.out.println(super.toString());
		
		// 기본 멤버필드(array)의 출력
//		return "[box = "+Arrays.toString(box)+"]"; 
		
		String s ="[";
		int len = box.length;
		for (int i = 0; i < len-1; i++) {
			s += String.format("%s,", box[i]);
		}
		s += String.format("%s]", box[len-1]);
		return s;
	} // toString end
	
	

}






