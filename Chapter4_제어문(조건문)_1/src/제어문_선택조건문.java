/*
 *   true/false -> 나눠서 처리
 *   짝수/홀수, 대문자/소문자, 로그인여부, ID중복여부
 *   
 *   형식)
 *   	 if(조건){
 *   		조건이 true일때 처리
 *   	 } else {
 *   		조건이 false일때 처리
 *   	 }
 *   	 
 *   	 --------------------
 *   	 단일 조건문
 *   	 
 *   	 if(조건){
 *   		조건이 true일때
 *   	 }
 *   	 if(!조건){
 *   		조건이 false일때
 *   	 }
 */
//
import java.util.Scanner;
// Scanner의 단점 --> 문자입력이 없다 --> 문자열 (가장 앞 한글자만 잘라오는것 charAt(0)
public class 제어문_선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 문자 입력: ");
		char alpha = sc.next().charAt(0);
		//           --------- 문자열
		if('A' <= alpha && alpha <= 'Z') {
			System.out.println(alpha + "는(은) 대문자입니다!");
		//if('a' <= alpha && alpha <= 'z')
		} else {
			System.out.println(alpha + "는(은) 소문자입니다!");
		}
	}

}
