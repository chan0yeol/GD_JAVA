package com.example.edu.getByte;

import java.io.UnsupportedEncodingException;

public class StringByteMain {

	public static void main(String[] args) {
		String str = "안녕하세요";

		// 문자열을 기본 인코딩으로 바이트 배열로 변환
		byte[] byteArr = str.getBytes();

		for (byte b : byteArr) {
			System.out.print(b + "\t");
		}
		System.out.println();

		try {
			// 문자열을 명시적으로 UTF-8로 인코딩
			byte[] utf8Bytes = str.getBytes("UTF-8");
			// 문자열을 명시적으로 EUC-KR로 인코딩
			byte[] euckrBytes = str.getBytes("EUC-KR");
			System.out.println("getBytes(UTF-8)");
			for (byte b : utf8Bytes) {
				System.out.print(b + "\t");
			}
			System.out.println();
			System.out.println("getBytes(Euc-Kr)");
			for (byte b : euckrBytes) {
				System.out.print(b + "\t");
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		// exception end
		// -------------------------------------------------------------------------

		System.out.println();
		String originStr = "해장국";

		try { // getByte(UTF-8) try-catch
			byte[] utf8Byte = originStr.getBytes("UTF-8");
			String decodeString = new String(utf8Byte,"EUC-KR");
			
			System.out.println("originStr : " +  originStr);
			System.out.println("decodeString : " +  decodeString);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}// getByte(UTF-8) try-catch end
		
//		======================================================================================================================================================

	} // main end

}
