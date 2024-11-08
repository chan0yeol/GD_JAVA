package com.min.edu;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IO_04 {
	/*
	 * 데이터의 읽기/쓰기는 컴퓨터의 binary code이기 때문에
	 * 사용자는 무조건 txt(char빼고 다 -> 문자표시..)
	 * -- char로 읽고/쓰고 해야하기 때문에 유니코드로 되어 있는 스트림을 사용해야 한다.(Reader/Writer)
	 * 
	 * Reader : 바이트로 문자열(char 유니코드)로 읽음
	 * Writer : 문자를 바이트로 읽어서 "인코딩" 하여 출력
	 * 파일에서 문자로 되어있는 파일을 읽는다. FileReader / 쓴다 FileWriter  
	 */
	public static void main(String[] args) {
		try {
			// FileInputStream과 StreamReader를 같이 가지고 있다.
			// 문자로 되어 있는 파일을 읽을 때 사용한다.(txt, ini, inf 등 text로 되어있는 파일들) 
			FileReader in = new FileReader("C:\\Windows\\system.ini");
			File file = new File("dataType.txt");
			Date lastModified = new Date(file.lastModified()); // 파일의 최종 수정일을 Date 객체로 가져옵니다.
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // 날짜 형식을 설정합니다.
			String formattedDate = sdf.format(lastModified); // Date 객체를 문자열로 변환합니다.
			System.out.println(formattedDate); // 결과를 출력합니다.
			int n;
			while((n=in.read()) != -1) {
				System.out.print((char)n);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
