package com.min.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IO_08 {
	/*
	 * 버퍼를 이용한 파일 복사.
	 */
	public static void main(String[] args) {
		// 1. 파일을 읽음
		FileInputStream fis = null; // 파일을 읽는 Stream
		
		BufferedInputStream bis = null; // 읽은 Stream 을 Buffer처리 하는 Stream
		
		// 2. 파일을 작성
		FileOutputStream fos = null; // 파일 쓰는 Stream
		BufferedOutputStream bos = null; // 쓰는 Strea을 Buffer처리 하는 Stream
		
		try {
			// 1. 기존 파일 읽는다
			fis = new FileInputStream("owasp.txt");
			// 2. 버퍼 객체로 감싼다.
			bis = new BufferedInputStream(fis);
			// 3. 복사할 파일을 생성한다.
			fos = new FileOutputStream("owasp_copy.txt");
			// 4. 버퍼 객체로 감싼다.
			bos = new BufferedOutputStream(fos);
			
			int n;
			while((n=bis.read()) != -1) {
				bos.write(n);
			}
			bos.flush();
			bos.close();
			fos.close();
			bis.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
