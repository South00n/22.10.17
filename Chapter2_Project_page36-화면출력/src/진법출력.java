// 42page ~ *74page(형변환)*
/*
 *  진법, 지수보다 (임베디드에선 진법,지수 중요) -> 웹 - SQL이 더 중요
 *  
 *  Back-end, Front-end (Javascript[Ajax,VueJS,ReactJS,NodeJS])
 *  --------
 *  자바,JSP,Oracle,Spring
 *  
 *  자바핵심
 *  1.변수 설정
 *  2.연산자 --> 3장
 *  3.제어문 --> 4장
 *  4.메소드 
 *  5.클래스 (객체지향) --> 6,7장
 *  6.예외처리 --> 8장
 *  7.라이브러리 (컬렉션,제네릭스) --> 11,12장
 *  8.IO --> 15장
 *  
 *  ----------------------------------
 *  자바에서 정수 표현
 *  1) 10진법 : 10,20,30...
 *  2) 2진법 : 0,1
 *  3) 8진법 : 0 ~ 7 ---> 0~~
 *  4) 16진법 : 0 ~ 9 + 10(A),11(B),12(C),13(D),14(E),15(F) ---> 0x~~
 *  
 *  27 --> 2진법
 *  32	16	8	4	2	1(0)
 *  	 1	1		1	1 --> 11011
 *  
 *  2진수를 뒤부터
 *  3개씩 자르면 8진법
 *  4개씩 자르면 16진법
 */
public class 진법출력 {

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(27));
		System.out.println("0" + Integer.toOctalString(27));
		System.out.println("0x" + Integer.toHexString(27));
		
	}

}
