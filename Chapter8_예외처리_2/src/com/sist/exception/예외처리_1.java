package com.sist.exception;
/*
 *     컴파일(이진파일변경), 인터프리터(한줄씩 읽어서 출력)
 *     --------------  ----------------------
 *     		javac				java
 *     		  |					  |
 *     	프로그래머의 실수			  사용자의 오류
 *     	------------		  ---------
 *     CheckException	   UnCheckException
 * 컴파일러가 예외처리 됐는지 확인    (확인하지 않는다) => 예외처리 생략가능
 * 
 * 	   CheckException
 * 		- IOException : 파일명, 경로명
 * 		- ClassNotFoundException : 클래스가 없는 경우 (리플렉션 -> new 없이 메모리 할당)
 * 		- SQLException : 데이터베이스 연결 (오라클, MySQL)
 * 		- InterruptException : 쓰레드 충돌
 * 		- MalformedURLException : IP, URL주소가 틀린경우 --> 크롤링
 * 	   UnCheckException
 * 		- ArrayIndexOutOfBoundsException : 배열범위가 초과시에 (인덱스번호 오류)
 * 									=> 12장 (컬렉션)
 * 		- NumberFormatException : 정수변환에 문제있을경우 (많이발생) -> 웹/윈도우는 정수를 전송할 수 없다 (문자열로)
 * 		- NullPointerException : 객체 생성없이 선언후 사용
 * 				모든 클래스는 기본값 null -> 메소드나 변수 사용이 안됨
 * 		- ClassCastException : 클래스 형변환 ==> 제네릭스 (자동 형변환)
 * 		class A<T> { // T > 임시클래스 ==> 12장 (데이터베이스 - 기본)
 * 			T t;
 * 			public void setT(T t) {
 * 			}
 * 			public T getT() {
 * 			}
 * 		} 		
 * 		A<String> --> T부분이 String으로 변경
 * 		-------------------------------------------
 * 
 * 		1) 처리 방법
 * 		  ***1. 예외복구 (직적처리) try ~ catch ~ finally => 프로그래머가 처리
 * 		  ***2. 예외회피 (간접처리) throws ==> 시스템에 알려준다 (이런 에러가 발생할 수 있으니까 발생하면 통과시켜라), 예외 떠넘기기
 * 				라이브러리에 많이 존재
 * 				sleep() -> Unhandled exception type InterruptedException
 * 						   throws InterruptedException
 * 		  3. 예외던지기 (임의로 발생) throw ==> 사용빈도는 거의 없다 (continue)
 * 			 ------------------ 사용자 정의 예외처리
 * 		2) 사용법
 * 			try : 정상 수행이 가능한 코딩 (예외의 발생 가능성) ==> 에러에 대비한 코딩
 * 				=> 프로그래머의 실수
 * 				=> 사용자 입력 오류
 * 			catch : 오류 발생시에 어떻게 처리할지 코딩 (복구보다는 에러확인용도)
 * 					=> 프로그래머 실수 = 소스 수정
 * 					=> 사용자 실수 = 다시 입력을 요청
 * 					=> 예상되는 에러만큼 catch를 사용할 수 있다
 * 					=> 전체예외처리가 가능한 클래스 : Exception / Throwable 
 * 			finally : 무조건 수행되는 문장
 * 					  try에서만 수행 --> 정상수행
 * 					  catch절을 수행 --> 오류가 발생
 * 					  try/catch 수행 상관없이 무조건 수행 (ex-닫기기능 : 파일, 서버연결해제, 데이터베이스 ...)
 * 			-------> 생략이 가능 (필요시에만 사용)
 * 
 * 			예)
 * 				
 * 				String num = "10";
 * 				=> 정수 변환
 * 				int i = Integer.parseInt(num); ==> num값에 공백이있으면 오류발생 (오류에 대한 대비가 없는 경우 -> 프로그램 종료)
 * 				화면 출력
 * 				1---
 * 				2---
 *				3---
 *				4---
 *				5---
 *				------------------ 정상수행했다면 5번까지 수행
 * 
 * 				에러발생에 대한 대비
 * 				--------------
 * 				try {
 * 					문장 1 --> 정상수행
 * 					문장 2 --> 정상수행
 * 					문장 3 --> 정상수행 --> try가 종료한 다음에 catch는 수행하지 않고 다음문장으로 넘어간다
 * 				} catch (A) {
 * 					처리문장 4 
 * 				} catch (B) {
 * 					처리문장 5
 * 				} catch (C) {
 * 					처리문장 6 
 * 				}
 * 				문장 7
 * 				--------------
 * 				try {
 * 					문장 1 --> 정상수행
 * 					문장 2 --> 오류발생 --> B라는 오류를 찾는다
 * 					문장 3 --> 정상수행
 * 				} catch (A) {
 * 					처리문장 4 
 * 				} catch (B) {
 * 					처리문장 5 --> 수행
 * 				} catch (C) {
 * 					처리문장 6 
 * 				}
 * 				문장 7
 * 				--------------
 * 				try {
 * 					문장 1 --> 정상수행
 * 					문장 2 --> 오류발생 --> B라는 오류를 찾는다
 * 					문장 3 --> 정상수행
 * 				} catch (A | B | C) { --> 다중조건문 (선택문)
 * 					처리문장 4 
 * 				} 
 * 				문장 7
 * 				--------------
 * 				try {
 * 					문장 1 --> 정상수행
 * 					문장 2 --> 오류발생 --> B라는 오류를 찾는다
 * 					문장 3 --> 정상수행
 * 				} catch (Exception) { Exception : 모든 예외처리가 가능 
 * 					처리문장 4 
 * 				} 
 * 				문장 7
 */
import java.util.Scanner;
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UnCheckException => 예외처리 생략이 가능 => 정수변환, 배열, 나누기, Null
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("정수 두개입력(10 10) : ");
			int[] arr = new int[2];
			arr[0] = sc.nextInt();
			arr[2] = sc.nextInt(); // 오류발생 --> 프로그램 비정상 종료
			
			int res = arr[0] / arr[1];
			System.out.println("res = " + res);
		} catch(ArrayIndexOutOfBoundsException ex) {
			// 에러를 확인
			// System.out.println(ex.getMessage());
			ex.printStackTrace(); // 실행과정을 출력 --> 422page
		}
		System.out.println("프로그램 종료");
		
	}

}
