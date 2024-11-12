package com.game.baseball.play;

import com.baseball.util.UserDefineUtil;
import com.game.baseball.comm.BaseBallConst;
import com.game.baseball.user.Hitter;
import com.game.baseball.user.Pitcher;

/**
 * 숫자 야구게임을 진행해 주는 클래스
 * @author 전민균
 *
 */
public class BaseBallGame { 

	private Pitcher pBox;
	private Hitter hBox;
	private Umpire ump;
	
	/**
	 *  default 생성자를 통해 모든 게임의 참여자(사용자,컴퓨터)가 같은 크기의 Array 갖도록 한다
	 */
	public BaseBallGame() {
		this(3);
	}

	/**
	 * 생성자 오버로딩을 통한 필요 멤버필드의 객체 생성
	 * @param 생성 array의 크기 n
	 */
	public BaseBallGame(int n) {
		 pBox = new Pitcher(n);
		 hBox = new Hitter(n);
		 ump = new Umpire();
	}
	
	public void newGame() {
		String answer = "Y";
		do {
			// 게임진행
			play();
			
			System.out.println("게임을 다시 진행하시겠습니까? Y or N" );
			answer = UserDefineUtil.inputString();
			if(answer.toUpperCase().trim().compareTo("N")==0) {
				System.out.println("종료하겠습니다");
			}
		} while (answer.trim().equalsIgnoreCase("Y"));
	}
	
	
	
	
	/**
	 * 게임을 진행해주는 로직
	 */
	private void play() {
		int num = 0; // 게임의 횟수
		int strike =0;
		int ball=0;
		
		// 컴퓨터의 array 생성
		pBox.make();
		ump.setpBox(pBox.getBox());
		System.out.println("현재 컴퓨의 숫자 :" + pBox);
		
		while (num != BaseBallConst.ITERATOR) {
			num++;
			// 사용자 array 생성
			hBox.make();
			System.out.println("현재 남은 게임의 횟수 :" + (BaseBallConst.ITERATOR-num));
			
			ump.sethBox(hBox.getBox());
			
			strike = ump.getStrike();
			ball = ump.getBall();
			
			String msg= String.format("당신의 결과는? Strike : %d / Ball : %d \n",strike, ball);
			System.out.println((strike+ball == 0)?"당신의 결과는? 아웃":msg );
			
			if(strike == BaseBallConst.STIKE) {
				break;
			}//if end
			
		}//while end
		
		if(strike == BaseBallConst.STIKE) {
			System.out.println("당신의 승리입니다 q(≧▽≦q) ");
		}else {
			System.out.println("당신의 패배입니다 (┬┬﹏┬┬)");
			System.out.println("컴퓨터의 숫자? " + pBox.toString());
		}
		
	} //play end
	
	
}


