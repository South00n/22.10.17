/*
 *	2진법 : 0,1
 *	8진법 : 011, 012 (앞에 0)
 *	16진법 : 0x~~ (앞에 0x)
 *	--- 프로그램 (10진법)
 *
 * 	165
 * 	---
 * 	128	64	32	16	8	4	2	0(1)
 *	 1		 1			1		  1	
 *	--------------------------------
 *	 1	0	 1	0	0	1	0	1
 *	
 *	8진법
 *	 1 0 1 0 0 1 0 1
 *			   -----
 *		 -----	 5
 *	 ---   4
 *	  2
 *		-> 0245
 *	16진법
 *	 1 0 1 0 0 1 0 1
 *			 -------
 *	 -------	5	
 *		a
 *		-> 0xa5
 *
 *	음수 표현 -> 1~
 *	10
 *	-> 2진법 : 	 00001010
 *		1의 보수 : 11110101
 *		2의 보수 : +      1
 *				 --------
 *				 11110110
 *		------------------ 정보처리, 코테에서 가끔 나옴 2의 보수
 *		Application / 임베디드 (모바일) / WEB
 *									 ---- web에 필요한 자바
 *		2장 -> 41page
 *			  42 ~ 71page = 스킵
 *			  72page : 형변환*
 *		형변환 : int -> double
 *			   double -> int
 *			   char -> int, double 내가 원하는 형태의 데이터로 변경
 *			   -> 자동 형변환, 강제 형변환 (데이터형, 클래스)
 *				----------------------------------
 *				int + double
 *				---
 *				double
 *				------------
 *				double + double = double (연산시에는 항상 큰데이터형으로 변경 후 연산 - 자동형변환)
 *
 *				char + int
 *				----
 *				int  + int = int
 *
 *				================
 *				 변수에 값을 입력할때 (자동형변환)
 *				 int a = 'A'
 *						 --- int로 변환 (65) --> a = 65
 *				 변수 = 값
 *				 --- 값의 데이터 크기보다 크거나 같아야 한다
 *					 ex) int a = 10.5 -> 오류
 *								 ---- double타입
 *						 int a = (int)10.5 -> 강제형변환
 *						 double d = 10 -> d = 10.0
 *						 double d = 'A' -> d = 65.0 --> 자동형변환
 *						 --------------------------------------
 *
 *						 byte + char = int
 *						 byte + byte = int
 *						 int이하 데이터형이 연산이 되면 int형으로 변환
 *						 -----byte, short, char
 *						
 *						 'A' + 'B'
 *						 ---   ---
 *						 65  +  66  = 131
 */
public class 진법출력2 {

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(165));
		System.out.println("0" + Integer.toOctalString(165));
		System.out.println("0x" + Integer.toHexString(165));
		
		System.out.println(~165);
		
		byte b1 = 10;
		byte b2 = 20;
		//byte b3 = b1 + b2; //오류 int로 받아야함
		int b3 = b1 + b2;
	}

}

