package com.min.edu;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Date;

public class IO_07 {

	public static void main(String[] args) throws IOException {
		/* System.out는 메모리에 할당되어 있는 stack값을 출력해 준다. */
		OutputStream o = System.out;
		for(int i =48; i< 58; i++) {
			o.write(i);
		}
		for(int i =0; i< 15; i++) {
			o.write(i);
		}
		System.out.println();
		
		//문자열 -> byte로 변경 -> 출력
		String str = "겨울은 눈";
		byte[] b = str.getBytes();
		System.out.println(Arrays.toString(b)); // str이 byte로 변경된 값 array
		
		o.write(b);
		o.flush();
		System.out.println("------=----------");
		
		// 2는 2byte를 지정, 출력할 때 2바이트 씩 버퍼에 담아서 출력을 진행하겠다.
		// 2는 매우 작기 때문에 성능이 크게 저하된다.
		// 결론 : 큰 버퍼를 사용하는 것이 효율 적이다. 네트워크 속도에 문제가 없다면.
		BufferedOutputStream bOut = new BufferedOutputStream(System.out,80000);
		Date d = new Date();
		long start = d.getTime(); // long으로 변환된 현재 날짜 표현
		System.out.println("start : "+start);
		
		FileReader file = new FileReader("word.txt");
		int c;
		while((c=file.read())!=-1) {
			bOut.write((char)c);
		}
		d = new Date();
		long end = d.getTime();
		System.out.println("걸린시간 : " + (end-start));
		
		bOut.flush();
		file.close();
		bOut.close();
	}
}
