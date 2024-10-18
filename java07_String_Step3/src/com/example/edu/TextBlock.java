package com.example.edu;

/*
 * 
 *  Text Block은 java 13에서 미리보기 기능으로 도입됨. 15버전 이후에 표준이 되었다.
 *  javascript의 그레이브표현식을 따라함
 *  
 *   Text Block은 세개의 큰따옴표(two Quote) """여기""" 로 구분된 여러 줄 문자열 만들 수 있다.
 *   줄바꿈 또는 따옴표 같은 이스케이프 문자(Escape \)를 지정하지 않고도 
 *   두 줄 이상에 걸쳥 있는 문자열의 작성을 간소화 방법을 제공
 */
 

public class TextBlock {
	public void text() {
		//  기존의 escape를 통한 문자열 줄바꿈 처리 \
		String str1 = "안녕하세요 \n 여러분";
		System.out.println(str1);
		int a = 12;
		String str2 = """
						안녕하세요
						``````
						여러분
				""";
		System.out.println(str2);
	}
 	
}
