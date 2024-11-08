package com.min.edu;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.net.MulticastSocket;

public class IO_03 {
	/*
	 * input / output
	 */
	public static void main(String[] args) {
		int[] num = {1,44,-1,55,99};
		byte[] b = {53,54,55,56,57};
		// 결과물 출력 -> 파일로 저장하겠다. FileOutputStream
		// 읽는건 read(), 쓰는건 write()
		try {
			FileOutputStream file = new FileOutputStream("out.txt");
			
			for(int i = 0; i < num.length; i++) {
				file.write(num[i]);
				
			}
			for(int i = 0; i < b.length; i++) {
				file.write(b[i]);
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}  // FileOutputStream end --- 
		System.err.println("o(*￣▽￣*)ブo(*￣▽￣*)ブo(*￣▽￣*)ブo(*￣▽￣*)ブo(*￣▽￣*)ブo(*￣▽￣*)ブ");
		
		//위에서 FileOutputStream을 통해 생성한 파일을 int값과 byte값을 읽어보자
		try {
			FileInputStream fileRead = new FileInputStream("out.txt");
			int n;
			while((n=fileRead.read() )!= -1) {
				System.out.print((char)n + " ");
			}
			fileRead.close();
		} catch (Exception e) {
			e.printStackTrace();
		} // InputStream end --- 
		
		System.err.println("\n\n╰(*°▽°*)╯╰(*°▽°*)╯╰(*°▽°*)╯╰(*°▽°*)╯");
		//data의 타입에 맞춰 표현해보자
		try {
			DataOutputStream out = new DataOutputStream(new FileOutputStream("dataType.txt"));
			out.writeInt(128);
			out.writeInt(-1);
			out.writeBoolean(false);
			out.writeDouble(3.14);
			out.writeChar('V');
			out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.err.println("\n\n╰(*°▽°*)╯╰(*°▽°*)╯╰(*°▽°*)╯╰(*°▽°*)╯");
		// 데이터 타입에 맞춰서 저장되어 있는 binary data를 읽어서 형태를 변환하여 문자열로 출력
		try {
			DataInputStream in = new DataInputStream(new FileInputStream("dataType.txt"));
			
			System.out.println(in.readInt());
			System.out.println(in.readInt());
			System.out.println(in.readBoolean());
			System.out.println(in.readDouble());
			System.out.println(in.readChar());
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

