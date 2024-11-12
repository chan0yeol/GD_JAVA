package com.min.edu;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IO_06 {
	// 입력정보를 파일로 저장하기
	public static void main(String[] args) throws IOException {
		System.out.println("입력정보를 파일로 저장하기");
		
		InputStreamReader in = new InputStreamReader(System.in);
		// 파일에 문자를 쓰는 객체
		// 절대 경로
		FileWriter fileOut = new FileWriter("inputValue.txt");
		
		/*
		 *  키보드로 입력받은 InputStreamReader 객체를 byte 단위로 읽어서 
		 *  FileWriter로 써줌
		 */
		int c = 0;
		while((c=in.read())!=-1) {
			fileOut.write(c);
		}
		
		fileOut.flush();
		fileOut.close();
		in.close();
	
	}
}
