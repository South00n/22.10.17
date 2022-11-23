package com.sist.movie;

import java.util.*;
import java.io.*;

public class MovieSystem {
	private static ArrayList movieList = new ArrayList(); // => 오라클에 저장돼서 전체가 공유할 수 있게만들거야
	static {
		try {
			FileReader fr = new FileReader("c:\\javaDev\\movie.txt");
			int i = 0;
			StringBuffer sb = new StringBuffer();
			// 파일 끝까지 읽기
			while ((i = fr.read()) != -1) {
				sb.append(String.valueOf((char)i));
			}
			// 파일 닫기
			fr.close();
			String movie = sb.toString();
			String[] temp = movie.split("\n");
			for(String m : temp) { // m => 영화 한개의 정보
				String[] mm = m.split("\\|");
				Movie mov = new Movie();
				mov.setMno(Integer.parseInt(mm[0]));
				mov.setTitle(mm[1]);
				mov.setGenre(mm[2]);
				mov.setPoster(mm[3]);
				mov.setActor(mm[4]);
				mov.setRegdate(mm[5]);
				mov.setGrade(mm[6]);
				mov.setDirector(mm[7]);
				
				movieList.add(mov);
			}
		} catch (Exception ex) {}
	}
	
		public ArrayList movieAllData(int page) {
			ArrayList list = new ArrayList();
			int j = 0;
			int pagecnt = (page * 20) - 20;
			/*
			 * 	 for => start ~ end
			 * 	 1page =>  0 ~ 19
			 * 	 2page => 20 ~ 39
			 *   3page => 40 ~ 59
			 */
			for(int i = 0; i < movieList.size(); i++) {
				if(j < 20 && i >= pagecnt) {
					Movie m = (Movie)movieList.get(i);
					list.add(m);
					j++;
				}
			}
			return list;
		}
		public int movieTotalPage() {
			return (int)(Math.ceil(movieList.size() / 20.0));
		}
		public Movie movieDetailDate(int mno) {
			return (Movie)movieList.get(mno - 1);
		}
		public ArrayList movieFind(int type, String fd) {
			ArrayList list = new ArrayList(); // 찾은 데이터를 묶어서 전송
			for(int i = 0; i < movieList.size(); i++) {
				Movie m = (Movie)movieList.get(i);
				if(type == 1) {
					if(m.getTitle().contains(fd)) {
						list.add(m);
					}
				} else if (type == 2) {
					if(m.getActor().contains(fd)) {
						list.add(m);
					}
				} else if (type == 3) {
					if(m.getGenre().contains(fd)) {
						list.add(m);
					}
				}
			}
			return list;
		}
	}







