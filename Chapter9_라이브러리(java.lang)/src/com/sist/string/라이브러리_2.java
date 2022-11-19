package com.sist.string;

import java.util.Scanner;
import java.io.*;

public class 라이브러리_2 {

	public static String[] musicAllData() {
		String[] music = new String[100];
		// IO ==> 모든 클래스가 컴파일예외 (CheckedException) => 반드시 예외처리를 하고 사용한다 (파일명, 경로명)
		// 직접 처리 ==> try ~ catch ~ finally
		FileReader fr = null;
		try { // 파일을 자동으로 닫는다
			fr = new FileReader("c:\\javaDev\\genie.txt");
			int i = 0;
			String data = "";
			while((i = fr.read()) != -1) { //파일이 끝날때까지 읽기
				data += String.valueOf((char)i);
			}
			// System.out.println(data);
			String[] musicDate = data.split("\n");
			// split ==> 구분자별로 단어를 배열에 저장
			//
			int k = 0;
			for(String m : musicDate) {
				String[] tmp = m.split("\\|");
				music[k] = tmp[1]; // 제목 저장
				k++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e) {}
		}
		return music;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] title = musicAllData();
		// startsWith ==> 접두어 (시작하는 문자열 확인)
		// 원형 : public boolean startsWith(String prefix) ==> LIKE => A% = A로시작하는 단어
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어 입력 : ");
		String fd = sc.next();
		
		/*for(String s : title) {
			if(s.startsWith(fd)) {
				System.out.println(s);
			}
		}*/
		/*for(String s : title) {
			if(s.endsWith(fd)) { //끝나는 문자열이 같은 경우에 출력
				System.out.println(s);
			}
		}*/
		// contains ==> 포함 => 원형 : public boolean contains(String s)
		for(String s : title) {
			if(s.contains(fd)) {
				System.out.println(s);
			}
		}
	}

}









