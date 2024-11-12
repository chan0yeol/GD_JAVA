package com.min.edu;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 *  java.io.* 패키지의 기능을 사용하여 파일을 읽고,출력,저장
 *  1) java에서 데이터를 읽고/쓰고 하는 기능을 가진 패키지
 *  2) java.io.*는 Checked Exception이다. IOException을 예외처리 해줘야함.
 *  	=> 읽고자 하는 파일 위치 혹은 파일이 없으면 확인하고 진행해라 의 의미로
 *  		Checked Exception으로 되어 있다.
 *  3) java stream 객체이다. 반드시 닫아줘야 한다.
 *  
 *  java의 스트림이란?
 *  	- java의 스트림은 입출력장치와 프로그램을 연결하여 이들 사이의 데이터를 처리하는 것
 *  	- 입력스트림(InputStream) / 출력스트림(OutputStream) 
 *  		-> Binary로 되어 있는 데이터를 전송 / 출력
 *  	- 기본 크기는 1byte(8bit)
 *  	- 연속적으로 전송하는 데이터의 크기를 보완하기 위해서 Buffer와 Filter 
 *  	  => 스트림을 도와주는 객체
 *  	- 출력스트림은 FIFO 
 */
public class IO_01 {
	public static void main(String[] args) {
		System.out.println("InputStreamReader "); // Reader(문자)
		/*---Scanner 클래스를 사용하여 문자를 받음 ---*/
//		Scanner scan = new Scanner(System.in);
//		String str = scan.nextLine();
//		System.out.println(str);
		/*--- InputStreamReader 사용 ---*/
		InputStreamReader reader = new InputStreamReader(System.in);
		// java.io.* 를 사용하려면 반드시 예외처리를 해줘야함
		try {

			/*
			 * int n = reader.read(); // 입력받은 문자열이 바이트로 나누어져 처리되어 있는 값 
			 * read()가 한번 실행될 때 한단어씩 가져옴 
			 * api문서에 보면 입력한 문자열을 한단어씩 읽어서 byte로 변환하고 마지막인 경우는 -1
			 */
			int n; 
			while ((n=reader.read()) !=  -1) {
				System.out.print(n +"/"+(char)n);
			}

//			System.out.println(n);
//			System.out.println((char) n);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
