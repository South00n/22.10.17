package com.sist.exception2;
/*
 * 	   414 page
 * 	   --------
 * 	   1. 프로그래머 실수
 *     2. 사용자의 실수 (입력값) ==> 유효성 검사 (자바스크립트)
 *     -------------------------------------------
 *     3. 오작동  / 비정상 종료
 *     -------------------------에러 / 오류
 *     
 *     예외처리 : 소스상에 수정이 가능한 에러
 *     		   예) 파일명이 틀리다, IP가 틀리다, URL 주소가 틀리다, 0으로 입력, 배열 인덱스 초과 ...
 *     ==> 컴파일에러 / 실행시 에러 (UnCheckException) => 예외처리 필수가 아니다 (선택)
 *     	   -------	 --------
 *     	CheckedException => 컴파일러가 확인 (반드시 예외처리를 해야된다)
 *     ==> 1. 에러를 사전에 방지하는 프로그램, 2. 정상적으로 수행이 가능하게 만든다 (견고한 프로그램)
 *     ==> 프로그램
 *     	   1. 가독성 : 다른 개발자가 쉽게 알아볼 수 있게 만든다 (유지보수)
 *     				 1) 구조적인 프로그램 : 메소드 (기능별 분류)
 *     				 2) 재사용
 *     				 3) 수정, 추가
 *     				 ---------------------------------> 객체지향 프로그램
 *         2. 최적화 : 실행속도가 빠르게 만든다
 *         			 웹에서 최적화 (데이터전송속도와 화면 출력속도)
 *         									---------- React, Vue
 *         3. 견고성 : 에러에 대응할 수 있는 프로그램 => 예외처리
 *     ==> 예외처리 방법
 *     	   - 예외처리 => 소스가 변경되는 것은 아니다, 복구해서 실행해주는 것은 아니다, 에러부분을 잘라내기
 *     				  
 *     	   - 직접처리 (예외복구)
 *     			try{정상적으로 실행되는 문장(오류가 발생할 수도 있다, 실수}
 *     			catch{실수한 부분을 처리} ==> 여러개 사용이 가능 (순서가 존재 => 계층구조)
 *     				catch절을 한개만 사용한다면 (Exception, Throwable)
 *     			finallY{필수적으로 닫기(자원 반환)}
 *     	   - 간접처리 (예외회피)
 *     			throws => 예상되는 예외를 선언한다
 *     					  ----------------- 예측이 가능하기 때문에 나중에 사용시 대처하기 쉽다
 *     					  사용자 정의는 빈도수가 거의 없다, 라이브러리 메소드에서 예측
 *     			=> 선언하는 방법
 *     			=> try ~ catch
 *     
 *     			예) public void aaa() throws Exception
 *     			
 *     			   ==>
 *     			    public void bbb() throws Exception {
 *      				aaa()
 *      			}
 *      
 *      			public void bbb() {
 *      				try {
 *      					aaa();
 *      				} catch (Exception e) {}
 *      			}
 *      			기타
 *      			---
 *      			임의발생 : 고의로 발생 ==> 테스팅 ==> continue
 *      			 throw new 예외처리생성자();
 *      			사용자 정의
 *      				class My extendsException {
 *      			
 *      				}
 *        				사용자 정의 => 지원하지 않는 것을 만든다 (자바 예외처리는 대부분 있다)
 *        
 *        --------------------------------------------------------------------- 기본 코딩 (문법)
 *        				라이브러리
 *        				-------
 *        				  java.lang.* ==> 9장
 *        					Object, String, StringBuffer, Wrapper, Math, System, Scanner
 *        												  -------
 *        												  데이터형을 클래스화
 *        												  int ==> Integer
 *        												  double ==> Double
 *        												  boolean ==> Boolean
 *        												  byte ==> Byte
 *        				  java.util.* ==> 9장 일부 ==> 10, 11, 12
 *        					  ==> List / Map / Set ==> Collection
 *        				  java.io.*	  ==> 13장
 *        				  java.text.* ==> 10징
 *        				  java.net.*  ==> 마지막장
 *        				  ------------- javax.http.*
 *        								java.sql.*
 *     
 */
public class 예외처리정리 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1000);
	}

}
