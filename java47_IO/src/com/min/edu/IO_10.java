package com.min.edu;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IO_10 {
	/*
	 * 파일(File) 클래스의 활용
	 */
	public static void main(String[] args) {
		/*
		 * File은 파일 객체를 물리적으로 읽어서 파일로 선언한다.
		 * File을 만들어 낼 때 사용한다.
		 * File로 선언된 데이터는 File 클래스에 의해서 분석이 가능(크기, 생성날짜, 수정날짜)하다.
		 */
		File file = new File("C:\\Windows\\system.ini"); //파일 확장자 ini
		File file2 = new File("C:\\Eclipse_IDE\\eclipse\\tmp"); // 폴더 없는 폴더
		File file3 = new File("C:\\Eclipse_IDE\\eclipse"); //만들어져 있는 폴더
		File file4 = new File("owasp.txt"); // 폴더 없는 폴더
		
		
		//파일 여부 판단
		String resp = "";
		if(file.isFile()) {
			resp = "파일";
		} else {
			resp = "파일 아님";
		}
		System.out.println(resp);
		System.out.println(file4.getAbsolutePath());
		
		// 파일업로드 할 경우 폴더의 여부를 판단(exists)해서 생성(mkdir, mkdirs)하거나 혹은 사용
		if(!file2.exists()) { // 폴더가 있냐 없냐?
			if(!file2.mkdirs()) { 
				// mkdirs => c:\a\b -> a와b가 모두 없다면 a/b를 모두 생성하겠다.
				// mkdir => c:\a\b -> 모두 생성할 수 없기 때문에 오류가 발생					
				System.out.println("디렉터리 생성 실패");
			} else {
				System.out.println("디렉터리 생성 성공");
			}
		} else {
			System.out.println("디렉터리가 존재함");
		}
		
		// 폴더의 이름 변경
		// 반드시 renameTo의 arguments는 File 객체이어야 함.
		
		file2.renameTo(new File("C:\\Eclipse_IDE\\eclipse\\tp"));
		
		// 정보확인
		String[] fileNames = file3.list();
		for (String s : fileNames) {
			File f = new File(file3,s);
			if(f.isFile()) {
				System.out.println(s);
				long t = f.lastModified(); // 마지막 수정 날짜
				long fileSize = f.length();
				String fileName = f.getName();
				
				System.out.println("마지막 수정일" + t);
				System.out.println("파일 크기 "+ fileSize);
				System.out.println("파일 이름 "+ fileName);
//				System.out.printf("수정 시간: %tb %td %ts %tT \n",t,t,t,t);
				
				Date date = new Date(t);
//				System.out.println(date.toString());
				
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				String formatDate = sdf.format(date);
				System.out.println(formatDate);
				
			}
			
		}
		
		File files = new File("https://gdu.co.kr/images/main/logo.png");
		System.out.println(files.length());
		
	}
}
