package com.sist.string;

import java.util.StringJoiner;

/*
 *     471page
 *     -------- 11장, 12장, 15장 ==> 2장 ~ 8장 (기본), 9장(String, Object) ==> Web관련
 *     String
 *     ------
 *     StringBuffer : append() : 문자열 결합
 *     				  toString()
 *     Math : random() / ceil() / round()
 *     // Wrapper - 데이터형을 클래스형으로 바꿔서 사용하기 편하게 만드는것
 *     ** Wrapper : Integer, Double, Boolean => 문자열을 해당 데이터형 변경
 *     			 parseInt(), parseDobule(), parseBoolean()
 *     			 => 박싱 / 언박싱
 *     			 => List<int> (X) ==> List<Integer> 
 *     StringTokenizer : nextToken(), counterToken(), hasMoreTokens
 *     Pattern / Matcher
 *     -------	 ------- find(), group(), compile()
 *     -------------------------------------------------------- 1권
 */
public class MainClass_String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = "red,green,blue,black,white,yellow,magenta";
		// 컬러별 분리
		String[] colors = color.split(",");
		for(String c : colors) {
			System.out.println(c);
		}
		System.out.println("=== 출력형식 (join)===");
		String ss = String.join("-", colors);
		// 앞의 매개변수는 구분자형태
		System.out.println(ss);
		System.out.println("=== 출력형식 ===");
		ss = color.replace(",", "-");
		System.out.println(ss);
		// 이미지 (여러개를 동시 묶어서 저장) -> 구분자를 사용해서 저장==> 데이터를 나눠서 출력
		// 오라클 => ^
		StringJoiner sj = new StringJoiner(",", "{", "}");
		// ,로 구분 {로시작 }로 끝
		for(String s:colors) {
			sj.add(s);
		}
		System.out.println(sj.toString());
	}

}
