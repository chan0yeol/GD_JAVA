package com.example.edu.ant;

import com.util.edu.EducationUtility;

public class AntMain {

	public static void main(String[] args) {
		AntSequence as = new AntSequence();
//		 argument와 return 타입을 선언한 메소드를 테소스트
//		System.out.println(as.ant_sequence("12"));
//		
//		최종 개미수열 실행
		System.out.println("출력하는 개미수열의 층수를 입력");
		int stage = EducationUtility.getNumericValue();
		as.ant_process(stage);

		
	}

}
