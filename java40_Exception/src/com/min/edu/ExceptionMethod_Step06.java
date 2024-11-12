package com.min.edu;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionMethod_Step06 {
	/*
	 * java 1.7 이후에는 try ~ with ~ resouce 문법이 추가 기존의 방식 1) try에 처링 연산을 작성한다. 2)
	 * catch에서 판단 3) finally에서 null을 판단 후 객체를 닫음
	 */

	public int calculation() throws IOException {
		int n = 0;
		FileReader file = null;
		try {
			file = new FileReader("msg.txt");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (file != null) {
				file.close();
			}
		}
		
		
		/* 
		 * 사용되는 객체를 닫을때, 상황에 따라서 if문을 통해 객체의 생성여부를 통해서 close 해줬던 반면
		 * try-with-resource 문법은
		 * 자동으로 try() 에서 사용된 객체를 자동으로 닫아준다.
		 */
		FileReader file1 = new FileReader("msg.txt");
		FileReader file2 = new FileReader("msg.txt");
		try (file1; file2){
			
		} catch (Exception e) {
			
		}
		return n;
	}
}
