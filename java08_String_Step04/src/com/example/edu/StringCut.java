package com.example.edu;

import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 문자열자르기의 결과는 반드시 문자열로 반환.
 * java.lang.*
 * java.util.StringTokenize
 */
public class StringCut {
	
	public static String deleteChar(String original, String deleteChars) {
      
        StringBuilder result = new StringBuilder();

    
        for (char c : original.toCharArray()) {
            if (deleteChars.indexOf(c) == -1) {
                result.append(c);
            }
        }

        return result.toString(); // 결과 문자열 반환
    }
	// 문자열 자르기 index의 시작 범위, 끝 범위"-1"의 문자열을 새로운(new)를 통한 문자열로 반환한다.
	// substring(int index) index의 위치부터 뒤에 모든 문자를 대상으로 자른다.
	// substring(int startIndex, int endIndex); => index의 시작위치(startIndex)의 값은 포함,
	public void substr() {
//		new Date();
//		new java.sql.Date(1L);
		
		String str = "Happy New Year";
		String email="asdasd@asd.asd.asd.com";
		String strTmp = str.substring(6);
		String strTmp2 = str.substring(str.lastIndexOf("Y"));
		String strTmp3 = str.substring(str.lastIndexOf("N"), str.lastIndexOf("Y"));
//		System.out.println(strTmp);
		System.out.println(strTmp2);
		System.out.println(strTmp3);
//		System.out.println(email.substring(email.indexOf("@")+1));
//		System.out.println(email.substring(0,email.indexOf("@")));
 		//System.out.println(email.substring(email.indexOf("@")+1, email.lastIndexOf(".")));
	} // substr end
	public void split() {
		String str = "oop.and.foo";
		String[] strArr = str.split("[.]");
		System.out.println(strArr);
		// Class가 존재하지 않거나 혹은 클래스에 기능이 부족한 경우 도움을 util클래스를 생성
		// java.util.Arrays;
		// .을 기준으로 
//		String reg = 
		System.out.println(Arrays.toString(strArr));
		
		// 영문자 o를 기준으로 자른다.
		// 5개 예상
		String[] strArr3 = str.split("o");
		//System.out.println(Arrays.toString(strArr3));
		System.out.println("strArr3.length : "+strArr3.length);
		for (int i = 0; i < strArr3.length; i++) {
			System.out.printf("%d : %s\n",i, strArr3[i]);
		} // split end
		
	}
	
	// java.lang.String이 아니고  StringTokenizer 객체이기 때문에 new를 통해서 생성하고 하위 멤버를 사용
	// 출력이 어렵다.
	//(iterator pattern)
	public void stringToken() {
		String str = "abc/test/think";
		StringTokenizer st = new StringTokenizer(str);
		System.out.println(st);
		// 객체를 확인하고 (hasMoreElements) 확인된 객체를 출력(nextElement)
		while (st.hasMoreElements()) {
			System.out.println("1: " + st.nextElement()); 
		}
		while (st.hasMoreElements()) {
			System.out.println("2: " + st.nextElement()); 
		}
		
		String str1 ="oop.and.foo";
		StringTokenizer st2 = new StringTokenizer(str1, "o");
		while (st2.hasMoreElements()) {
			System.out.println("2: " + st2.nextElement()); 
		}
		
		System.out.println("==============================================");
		
		String str2 = "\u3000 \u3000. and.f  ";
		StringTokenizer st3 = new StringTokenizer(str2, "\u3000");
		while (st3.hasMoreElements()) {
			System.out.println("3:" + st3.nextElement()); 
		}
	} // stringToken end
 }
