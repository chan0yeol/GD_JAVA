package com.min.edu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class IO_05 {

	/*
	 * 문서의 Encoding 설정을 통한 파일 읽기 Exception을 처리 하지 않고 다음에 해당 메소드를 실행하는 곳으로 위임 하는것 =>
	 * thorws
	 */

	public static void main(String[] args) throws IOException {
		/* 아래 19,21 라인과 같다. */
//		FileReader in = new FileReader("word.txt");
		/* FileReader 구성되는 요소들 */
		FileInputStream fileInput = new FileInputStream("Crescent.txt"); // 파일 읽어옴
		// 문자로 읽어낸다. Encoding은 기본 시스템의 설정을 따라간다.
		InputStreamReader in = new InputStreamReader(fileInput);
//		InputStreamReader in = new InputStreamReader(fileInput,/*"Encoding-Type"*/);
		
		int n;
		while((n=in.read())!=-1) {
			System.out.print((char)n);
		}
		in.close();
		fileInput.close();
		
		FileOutputStream fileOutput = new FileOutputStream("test.txt");
		OutputStreamWriter out = new OutputStreamWriter(fileOutput);
		out.write(123);
		
	}
}
