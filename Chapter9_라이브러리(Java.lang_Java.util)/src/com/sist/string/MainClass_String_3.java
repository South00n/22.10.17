package com.sist.string;
// format() => printf()랑 비슷
// join / format ==> byte[] => 보낼때 항상 인코딩으로 보냄
public class MainClass_String_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 시간 처리 => 원하는 형식으로 변경 (웹 => System.out.printf("") => 없음)
		int a = 10;
		int b = 20;
		String temp = String.format("%d + %d = %d", a, b, a+b);
		System.out.println(temp);
		
		// 12세 관람가 -> 출력 -> String.format("%d세 관람가", 12)
	}

}
