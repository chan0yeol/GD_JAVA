package com.example.edu.ant;

import java.util.Scanner;

public class AntSequence {
	/**
	 * 외부에서 층수를 입력받아 층수 만큼 개미수열을 만들어 출력해주는 메소드
	 * @param 생성 층수
	 */
	public void ant_process(int stage) { // 4
		// 개미수열을 "11" 부터 입력을 하겠다.
		String init = "11";
		System.out.println(init);
		for(int i=0;i<stage;i++) { // i < 4
			init = ant_sequence(init); // "11"입력 -> ant_sequence -> return "12" -> init 변수에 "12" 대입
			System.out.println(init);
		}
		
	}
	/**
	 * ant_process에서 츠수에 해당하는 문자열숫자를 입력받아<br>
	 * 다음 층수를 생성하는 메소드
	 * @param 다음 생성을 위한 문자열 ex) 11 -&gt; 12
	 * @return 다음 층수의 개미수열 값 String
	 */
	public String ant_sequence(String str) {
//		System.out.println("을 입력");
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
		char initValue = str.charAt(0);
		String result = "";
		int cnt = 1;
		for(int i=1; i<str.length();i++) {
			if(initValue == str.charAt(i)) {
				cnt++;
			} else {
				result = result + initValue+cnt; // 더 이상 뒤에 같은 값이 없음,  앞에 까지의 연산을 누적
				initValue = str.charAt(i); // 다른 값이 기준이 되어 다음 index의 비교 대상이 된다.
				cnt = 1; // 앞에 연산에 의해서 cnt가 상위 변수이기 때문에 처음 값인 자신은 무조건 1개 이상 존재한다 라는 의미로 1로 초기화.
			}
		}
		result = result+initValue+cnt;
//		result += initValue+cnt;
//		System.out.println(result); // initValue의 값 '1' char 타입은 연산이 됐을 경우 
//												리터럴 값의 int 값으로 변경이 되어 int 연산이 발생되어 '1'이 49가 되어 연산이 발생한다
//												따라서 결과는 49 + 2가 되어야 int의 51이 결과를 출력했다.
//												해결방안
//												=> 보여지는 그대로 타입에 관계 없이 문자열로 변경할 수 있는 String의 특징인 Concatenation을 사용하여 문자열 연산을 한다
//												=> 초기값의 비어있는("") 문자열을 선언하여 비어있는 문자열을 기준으로 Concatenation을 발생시키자.
//												=> String result = ""; => result = result + '1' + 2; => result는 "12"가 된다.
		return result;
	}
}

