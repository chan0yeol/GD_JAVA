package com.game.baseball;

import java.util.Arrays;

import com.baseball.util.UserDefineUtil;
import com.game.baseball.play.BaseBallGame;
import com.game.baseball.play.Umpire;
import com.game.baseball.user.GameImpl;
import com.game.baseball.user.Hitter;
import com.game.baseball.user.Pitcher;

public class BaseBallGameMain {

	public static void main(String[] args) {
		//TEST 1 reference library 
//		int intVal =UserDefineUtil.inputNum();
//		String stringVal = UserDefineUtil.inputString();
//		System.out.println(intVal + "/" + stringVal);
		
		//TEST 2 abstract class 
//		GameImpl game = new GameImpl(3) {
//			@Override
//			public void make() {
//				// TODO Auto-generated method stub
//			}
//		};
//		System.out.println(game);
//		game.print();
		
		
		//TEST 3 Pitcher 클래스에서 필요로 하는 렌덤숫자, 중복검사
//		Pitcher p = new Pitcher();
//		int num = p.makeNum();
//		System.out.println(num);
//		boolean isc = p.isDuplicate(-1);
//		String msg = isc ? "중복":"값입력";
//		System.out.println(msg);
		
		//TEST 4 Pitcher의 make()를 실행해서 생성된 Array 확인
//		GameImpl pit =  new Pitcher(5);
//		pit.make();
//		pit.print();
		
		//TEST 5 Hitter의 중복검사/입력
		Hitter hit = new Hitter(3);
//		boolean isc = hit.isSame(); // -1로 넣어 초기값 false로 출력
//		System.out.println(isc?"중복":"다른값");
		
//		int[] tmp = hit.makeNum();
//		System.out.println(Arrays.toString(tmp));
		
//		hit.make();
//		int[] resultHit = hit.getBox();
//		System.out.println(Arrays.toString(resultHit));
//		hit.print();
		
		//TEST 6 비교클래스 Umpire 
//		Umpire up =new Umpire();
//		up.sethBox(new int[] {1,2,3});
//		up.setpBox(new int[] {5,7,9});
//		
//		int strike = up.getStrike();
//		int ball = up.getBall();
//		System.out.printf("strike:%d / ball:%d \n" , strike, ball);
		
		// TEST 7 BaseBallGame play 
		BaseBallGame game = new BaseBallGame();
//		game.play();
		game.newGame();
		
	}
}






