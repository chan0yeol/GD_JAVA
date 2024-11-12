package com.min.edu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/*
 * 기존 문자파일에 글추가 하기
 */
public class IO_09 {

	/*
	 *  문자를 입력할 때 PrintWriter를 해주면 자동으로 인코딩해서 쓰여짐
	 	효과적으로 입력을 하기 위해서 BufferWriter 객체를 사용하고
	 	기존의 작성파일을 문자로 읽어오기 위해서 FileWriter
	 */
	
	public static void main(String[] args) throws Exception {
		// 작성할 파일을 읽어옴 -> PrintWriter
		PrintWriter out = new PrintWriter(
				new BufferedWriter(
				new FileWriter(
						"word.txt",Charset.forName("UTF-8"), true
						)
					)
				);
		// 입력 인터페이스인 키보드로 받음
		System.out.println("글을 작성해 보세요");
		int c;
		InputStreamReader in = new InputStreamReader(System.in);
		while((c=in.read()) != -1) {
			out.write(c);
		}
		out.flush();
		in.close();
		out.close();
	}
	
}
