package com.example.edu;

public class StringMethodes {
	// char charAt(int index) 선택한 index의 char를 반환한다.
	// 문자열은 문자형이 조합되어 있는 형태 이기 때문에 index번호로 가져올 수 있다
	// index는 0 부터 시작
	// 이슈사항 : index의 값이 문자열의 길이에 맞지 않는다면 ? IndexOutOfBoundsException
	public void fn_charAt() {
		String str = "Dream of Java";
		System.out.println("str의 길이 : " + str.length());

		// 누적변수 사용 for
		int i = 0;
		for (; i < str.length(); i++) {
			System.out.printf("%d : %c|", i, str.charAt(i));
		}
		System.out.println("최종길이 : " + i);
	} // fn_chatAt end

	// compareTo 각 두개의 문자열을 같은 위치에서 비교하여 차이크기를 출력하는 메소드
	// lexicographically
	// compareTo(String str), compareToIgnoreCase(String str)
	// IgnoreCase는 code point를 수정하여 같은 값이 아닌 쌍으로 되는 소문자 대문자를 같은 값으로 판단
	public void fn_compareTo() {
		String name1 = "2To2";
		String name2 = "2to2";

		// index 0부터 진행을 하며 비교하고 만약 다른 값이 있을경우 멈추고 해당 차이값을 반환.
		int df = name1.compareTo(name2);
		System.out.println(df);

		// IgnoreCase
		int chk = name1.compareToIgnoreCase(name2);
		System.out.println(chk);

	} // fn_compareTo end

	// concat
	// String 연산자를 메소드로 작성함
	// concat() 사용할때는 두개 씩만 합쳐진다.
	// 여러개를 하나의 문장으로 만들고 싶다면 "여러개를 반복해서 사용"
	public void fn_concat() {
		String j = "*";
		String con = j.concat("2").concat("J").concat("2");
		System.out.println(con);
		String tmp = "*2J2";
		System.out.println(con == tmp); // String 안에 들어있는 모든 메소드는 new로 생성되기 때문에 false
		System.out.println(con.equals(tmp)); // String 타입의 값 비교는 equlas를 사용 하거나 hashcode()로 해야한다.
	} // fn_concat end

	// contains 판단의 결과를 boolean contains()
	public void fn_contains() {
		String str = "j2j";
		boolean isc1 = str.contains("j");
		boolean isc2 = str.contains("j3");
		System.out.println(isc1);
		System.out.println(isc2);
	} // fn_contains()

	// equals(), equalsIgnoreCase()
	public void fn_equals() {
		String str1 = "snoopy";
		// 생성자 오버로딩, 값을 하나 입력받아 생성한다.
		String str2 = new String("snoopy");
		String str = new String(); // => String str = ""; 와 같다.
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str);
	}

	public void str_ex() {
		/*
		 * String str = ""; System.out.println(str); String str2 = new String();
		 * System.out.println(str2); str = null; System.out.println(str); new String();
		 */
		// String은 "" 빈문자열로 초기화 됬을 때 hashcode를 0으로 덮는다.
		String str = new String();
		System.out.println(str.hashCode());
		System.out.println(System.identityHashCode(str));
		String str2 = "";
		System.out.println(str2.hashCode());
		String str3 = new String("123");
		System.out.println(str3.hashCode());
		System.out.println();
	}

	// str.indexOf("12") => str에서 12가 포함된 index 번호를 반환
	public void fn_indexOf() {
		String str = "happy@gmail.com";

		int idx = str.indexOf("@");
//		System.out.println(str.charAt(idx));
		int hash = str.hashCode();
		System.out.println(str.hashCode());
		System.out.println();
		String str2 = "2j이 of 이j2";
//		System.out.println(str2.indexOf("이", 4));
//		System.out.println(str2.lastIndexOf("이"));
	}

	// 자바에서의 길이 확인
	// length(), length , size()
	public void fn_length() {
		String str = "kangwangjjang";
		
		//array는 같은 타입 혹은 여러개의 값을 하나의 변수에 담을 수 있다
		// 참조타입
		// 클래스를 통해서 생성하는 것이 아니다. (new 생성자())
		// 따라서 package와 Class는 toString 출력한 경우 [ 로 표기
		String[] args = { "super", "man", "jjang" };
		System.out.println(str);
		System.out.println(args[0]);
		
		int lenStr = str.length();
		System.out.println("str의 길이 : " + lenStr);
		
		int lenArr = args.length;
		System.out.println(lenArr);
		
		int[] n = {1,2,3};
		System.out.println(n);
	} // fn_length end 
	
	// replace 와 replaceAll 
	public void fn_replace() {
//		String str = "\"<침대는 과학>\"";
		String str = "<침대는 과학>";
		System.out.println(str);
		
		str = str.replace("<", "\"");
		str = str.replace(">", "\"");
		System.out.println(str);
	
	} // fn_replace end
	
	//isEmpty
	public void fn_isEmpty() {
		String str1 = new String();
		String str2 = " ";
		String str3 = null;
		boolean isc1 = str1.isEmpty();
		boolean isc2 = str2.isEmpty();
		try {
			boolean isc3 = str3.isEmpty(); // null은 기능을 호출하면 NullPointerException
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(isc1);
		System.out.println(isc2);
		
		System.out.println("처리 완료");
	} // isEmpty end
	
	// isBlank
	// whitespace를 찾아서 판단한다 
	//file:///C:/Users/GD/Downloads/api/java.base/java/lang/Character.html#isWhitespace(int)
	public void fn_isBlank() {
		String str1 = "\u3000";
		String strTmp = "　"; // ㄱ+한자 1
		System.out.println("값:"+str1); 
		System.out.println(str1.isEmpty());
		System.out.println(str1.isBlank());
		
		System.out.println(strTmp.isEmpty());
		System.out.println(strTmp.isBlank());
	}// fn_isBlank end
	
	// replaceAll()
	// 반복해서 특정 값을 정규화 표현식(regEx)를 통해서 변경할 수 있다.
	// 정규화표현식의 작성방법이 다름
	// java "표현식" , javascript /표현식/
	public void fn_replaceAll() {
		String str = "!T%a&5"; // 특수문자, 대문자, 소문자, 숫자가 조합된 String
		String regEx = "[^0-9a-zA-Z]";
		String result = str.replaceAll(regEx, " ");
		System.out.println(result);
	}
	
	// trim()
	// 앞뒤의 whitespace(32)를 제거한다.
	// 갚에 포함되어 있는 whitespace는 값으로 처리한다.
	public void fn_trim() {
		String str = "            날씨  더운데 ?          ";
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.trim());
	}
	
	// binding 문법을 사용하여
	// %s String , %d 정수, %b boolean, %f 실수 값을 순서대로 바인딩 (껴넣음) 새로운 String 반환
	// %n 개행
	public void fn_printf() {
		String strFm = String.format("%d년도 %d월 %d일", 2024, 10, 17);
		System.out.println(strFm);
	}
}
