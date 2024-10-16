package com.util.edu;

/**
 * 
 * @author 오찬열
 * @since 2024.10.16
 * <p> 수입어 필요로 하는 사용자 유틸리티를 작성하는 클래스 </p>
 */
public class MakeUserCharacter {
	/** 
	 * 정수 숫자 (0~9)파라미터 전송시 - int 값으로 뱉어줌
	 * 나머지 범위에 대한 값은 999값 반환
	 * @param c
	 * @return '0' ~ '9' 정수값 0~9, 그 외 999 정수값 
	 */
	public static int getNemericValue(char c) {
		int result = 0;
		if(c >= 48 && c<=57) {
			return (c-48);
		} else {
			result = 999;
		}
		return result;
	} 
}
