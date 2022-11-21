package com.sist.string;

import java.io.*; // 파일 읽기
import java.util.*;

public class MainClass_StringBuffer_1 {

	public static void main(String[] args) {

		// IO => CheckedException => 반드시 예외처리한다
		FileReader fr = null;
		try {
			long start = System.currentTimeMillis();
			fr = new FileReader("c:\\javaDev\\movie.txt");
			int i = 0; // 한글자를 읽어 온다 (문자(X), 문자번호) 'A' = 65..
			String movie = "";
			while((i=fr.read()) != -1) { // 파일 끝날떄까지 읽어라
				movie += String.valueOf((char)i);
			}
			
			long end = System.currentTimeMillis();
			// 읽은 데이터 출력
			System.out.println(movie);
			System.out.println("읽은 시간 : " + (end-start)); // 로그파일 읽을때 많이 사용
		} catch (Exception ex) {}
		finally {
			try {
				fr.close(); // 파일 닫기, 서버 닫기, 오라클 닫기
			} catch (Exception ex) {}
		}
	}

}
