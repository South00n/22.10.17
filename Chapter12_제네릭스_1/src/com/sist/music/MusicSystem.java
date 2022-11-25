package com.sist.music;
// 지니, 멜론 ==> 데이터를 저장 -> 요청에 대한 처리
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class MusicSystem {
	private static ArrayList<Music> list = new ArrayList<Music>(); //200개 저장
	/*
	 *     초기화
	 *     ----
	 *     	 1. 명시적 초기화 (x) ==> 기본형 데이터형일 경우
	 *       2. 생성자
	 *       	=> 인스턴스 변수에 초기화 -> 저장 (생성자를 호출해야하기 때문)
	 *       3. 초기화 블럭
	 *       	=> static -> 자동 저장 (생성자호출 없어도 되기 때문)
	 *       
	 *       => 명시적 초기화 ==> 초기화 블럭 ==> 생성자
	 *       	------------------------------- 1) 명시적 초기화 고려
	 *       									   --------- 초기화를 할 수 없는 경우
	 *       									   --------- 구현(크롤링)
	 */
	// 데이터 수집
	// 클래스영역에서는 구현할 수 없다 => 선언만 가능 => 연산처리, 제어문, 예외처리 불가능
	static {
		int mno = 1;
		try {
			// 지니뮤직
			for(int i = 1; i <= 2; i++) {
				Document doc = Jsoup.connect("https://www.genie.co.kr/chart/top200?ditc=D&ymd=20221125&hh=14&rtm=Y&pg=" + i).get();
				Elements title = doc.select("table.list-wrap td.info a.title");
				Elements singer = doc.select("table.list-wrap td.info a.artist");
				Elements album = doc.select("table.list-wrap td.info a.albumtitle");
				Elements etc = doc.select("span.rank span.rank");
				
				for(int j = 0; j < title.size(); j++) {
					/*System.out.println(title.get(j).text()+ " "
							+singer.get(j).text() + " "
							+album.get(j).text() + " "
							+etc.get(j).text());*/
					Music m = new Music(); // m => 100개 공간필요
					m.setMno(mno);
					m.setCno(1);
					m.setTitle(title.get(j).text());
					m.setSinger(singer.get(j).text());
					m.setAlbum(album.get(j).text());
					String temp = etc.get(j).text();
					int in = 0;
					String state = temp.replaceAll("[^가-힣]", "");
					if(state.equals("유지")) {
						in = 0;
					} else {
						in = Integer.parseInt(temp.replaceAll("[^0-9]", "").trim());							
					}
					m.setState(state);
					m.setCrement(in);
					list.add(m); // 이 ArrayList에는 Music 객체만 저장이 가능
					mno++;
				}
			}
			mno = 101;
			Document doc = Jsoup.connect("https://www.melon.com/chart/index.htm").get();
			Elements title = doc.select("tr.lst50 div.rank01");
			Elements singer = doc.select("tr.lst50 div.rank02");
			Elements album = doc.select("tr.lst50 div.rank03");
			Elements etc = doc.select("tr.lst50 div.wrap span.rank_wrap");
			for(int i = 0; i < title.size(); i++) {
				/*System.out.println(title.get(i).text()+ " "
						+singer.get(i).text() + " "
						+album.get(i).text() + " "
						+etc.get(i).text());*/
				Music m = new Music(); // m => 100개 공간필요
				m.setMno(mno);
				m.setCno(2);
				m.setTitle(title.get(i).text());
				m.setSinger(singer.get(i).text());
				m.setAlbum(album.get(i).text());
				String temp = etc.get(i).text();
				int in = 0;
				String state = temp.replaceAll("[^가-힣]", "");
				if(state.contains("유지")) {
					in = 0;
				} else {
					in = Integer.parseInt(temp.replaceAll("[^0-9]", "").trim());							
				}
				m.setState(state);
				m.setCrement(in);
				list.add(m); // 이 ArrayList에는 Music 객체만 저장이 가능
				mno++;
				
			}
		} catch (Exception ex) {}
	}
	// 요청에 대한 처리
	// 목록 => 지니 / 멜론 => 나눠서 처리 ==> cno
	public ArrayList<Music> musicCategoryData(int cno) {
		ArrayList<Music> mList = new ArrayList<Music>(); // 음악정보만 모아서 전송
		for(Music m : list) {
			if(m.getCno() == cno) {
				mList.add(m);
			}
		}
		return mList;
	}
	// 노래 검색 (노래 / 가수명)
	// 상세보기 ==> mno
	// 댓글 / 추천 ... 음반 구매, 포인트 충전 ...
	/*public static void main(String[] args) {
		MusicSystem m = new MusicSystem();
		System.out.println(m.list.size());
	}*/
}
