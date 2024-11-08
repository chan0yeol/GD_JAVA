package com.min.edu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IO_02 {
	/*
	 * InputStream : 데이터를 읽어 오는 객체 
	 * 파일을 읽어 옴 --> ByteStream 바이트 단위로 바이너리 값을 읽는 스트림
	 *  
	 * InputStream
	 * 	- FileInputStream
	 *  - DataInputStream
	 *  
	 *  -- 실습 시나리오 -- 
	 *  절대경로(물리적인 주소) java에서 사용할 때는 (\)문법으로 읽기 때문에 escape 문자로 사용 해줘야함.
	 *  C:\\Eclipse_IDE\\eclipse\\eclipse.txt
	 *  
	 *  - 절대경로 
	 *  - 상대경로 
	 */
	public static void main(String[] args) {
		// txt라고 하는ㄴ 파일을 읽어서 출력 => FileInputStream
		try {
			FileInputStream file = new FileInputStream("dataType.txt");
			// InputStream이 읽어서 byte단위로 하나씩 읽어서 문자형으로 반환
			// byte로 읽는 메소드는 read()
			// 더이상 읽을 데이터가 없다면 read()는 -1을 반환
			int n;
			while ((n=file.read())!= -1) {
				System.out.print((char)n);
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
