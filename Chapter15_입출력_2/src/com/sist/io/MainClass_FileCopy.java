package com.sist.io;

import java.util.*;
import java.io.*;
// 업로드

public class MainClass_FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("c:\\javaDev\\movie.txt");
			FileOutputStream fos = new FileOutputStream("c:\\download\\movie.txt");
			/*int i = 0;
			while ((i = fis.read()) != -1) {
				fos.write(i);
			}
			fis.close();
			fos.close();*/
			byte[] buffer = new byte[1024]; // 클라이언트에서 서버로 파일을 전송하는 방법
			// TCP(1024) / UDP(512)
			int i = 0; // 글자번호가 아니다 (읽은 byte수)
			while((i = fis.read(buffer, 0, 1024)) != -1) {
				fos.write(buffer, 0, i); // 서버로 전송 ==> 파일 업로드 방식
			}
			fis.close();
			fos.close();
			System.out.println("파일 복사 완료!!");
		} catch (Exception ex) {}
	}

}
/*
 * 		공부할것
 *		1. Stream (Input / Output) 868page
 *		2. **File에 대한 정보 915page
 *		3. **FileInputStream / FileOutputStream 879page
 *		4. **BufferedInputStream / BufferedOutputStream 882-3page
 *		---------------------------------------------- Byte 스트림 (파일 전송, 다운로드에서 주로 사용)
 *		5. **FileReader / FileWriter 898-9page
 *		6. **BufferedReader / BufferedWriter 904-5page
 *		   ------------------------------- 문자 스트림 (파일 제어 - 한글 저장, 한글 읽기)
 *		7. 직렬화 / 역직렬화 934page
 *		   ObjectInputStream / ObjectOutputStream
 * 
 */

