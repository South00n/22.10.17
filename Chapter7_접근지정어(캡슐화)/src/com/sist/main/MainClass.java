package com.sist.main;

import com.sist_manager.*;
import com.sist.vo.*;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		MusicManager m = new MusicManager();
		MusicVO[] music = m.musicListData();
		for (MusicVO vo : music) {
			System.out.println(vo.getTitle());
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("뮤직 선택 (0~99) : "); // 클릭
		int index = sc.nextInt();
		String key = m.musicDetailData(index);
		
		try {
			Runtime.getRuntime().exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe "
					+ "http://youtube.com/embed/" + key);
		} catch(Exception ex) {}
	}

}
