package com.game.baseball.user;

import java.util.regex.Pattern;

import com.baseball.util.UserDefineUtil;

/**
 * 사용자가 멤버필드 Array의 공간만큼 값을 입력하는 클래스 
 * @author GDJ
 *
 */
public class Hitter extends GameImpl {

	/**
	 * 부모의 생성자를 호출하여 부모의 멤버필드를 초기화 하는 정수값을 입력
	 * @param 정수
	 */
	public Hitter(int n) {
		super(n);
	}

	/**
	 * 문자열 숫자 3자리를 입력받아 중복검수를 하여 Array를 만들어 냄
	 */
	@Override
	public void make() {
		int len = box.length;
		System.arraycopy(makeNum(), 0, box, 0, len);
		while (true) {
			if(isSame()) {
				System.out.println("중복된 숫자가 있습니다. 다시 입력해 주세요");
				System.arraycopy(makeNum(), 0, box, 0, len);
			}else {
				break;
			}
		}
	}
	
	/**
	 * 멤버필드의 Array에 값들 중에서 같은 값을 가진 값이 있는 확인 <br>
	 * 중복되는 값이 있다면 true
	 * @return 중복/true
	 */
	private boolean isSame() {
		boolean isc = false;
		int len = box.length;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if(i!=j && box[i] == box[j]) {
					isc =true;
				}
			}
		}
		return isc;
	}//isSame
	
	/**
	 * 문자열 3자리를 입력받음<br>
	 * 정규화를 통한 3자의 문자열이 숫자로만 이뤄져 있는지 판단<br>
	 * 길이를 판단 멤버필드의 length와 같은지 판단
	 * 빈값("")인지 판단
	 * @return 정규화+길이+값의 유효성 체크가 완료된 int[] 
	 */
	private int[] makeNum() {
		int[] tmp = new int[box.length];
		System.out.println("정수 3개를 붙여서 입력해 주세요");
		
		String str = UserDefineUtil.inputString();
		System.out.println("입력하신 숫자는 "+ str);
		
		//정규화 표현식 문자열 검증 java.util.regex.Pattern matches();
		//판단유효성(validate) - 숫자만 입력받는다
		String pattern = "^[1-9]*$";
		
		// 정확한 값이 입력이 된다면 true
//		boolean iscRegex = Pattern.matches(pattern, str); // false면 사용할 수 없다
//		System.out.println("입력받은 값이 1~9까지의 숫자입니까?"+iscRegex);
		
		
		while (str.trim().equals("")  // 값이 없을경우 "     " or ""
				|| str.trim().length() != box.length //값의 길이가 box길이랑 같은지 판단  
				|| !Pattern.matches(pattern, str)) { // regex를 숫자만 판단
				str = UserDefineUtil.inputString();
		}
		
		for (int i = 0; i < tmp.length; i++) {
//			tmp[i] = str.charAt(i)-48;
			tmp[i] = Character.getNumericValue(str.charAt(i));
		}
		
		return tmp;
	}
	

}




