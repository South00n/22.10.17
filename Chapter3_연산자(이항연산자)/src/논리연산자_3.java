/*
 *   알파벳을 입력 받아서 대소문자 판별
 *   Math, System --> java.lang (생략이 가능)
 */

import java.util.Scanner;

public class 논리연산자_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력해주세요:");
		char c = sc.next().charAt(0); // 입력된 알파벳 1개 가지고 온다 (Scanner의 단점 : 문자 1개를 못 받는다)
		boolean b1 = 'A' <= c && c <= 'Z'; //대문자 조건
		boolean b2 = 'a' <= c && c <= 'z'; // 소문자 조건
		
		System.out.println("b1 = " + b1 + "-> true일 경우 입력하신 알파벳은 대문자입니다.");
		System.out.println("b2 = " + b2 + "-> true일 경우 입력하신 알파벳은 소문자입니다.");
		
		// (대문자 조건) || (소문자 조건) --> (알파벳 조건)
	}

}
