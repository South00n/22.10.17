package com.sist.main;
/*
 *    자바 1차
 *    자바 2차 ==> java.sql.* ==> 핵심 : 오라클 연동
 *    -----------------------------
 *    자바 3차 ==> 웹 (javax.servlet.http.*) : JSP
 *    -----------------------------------
 *    자바 4차 ==> 스프링, 마이바티스
 *    ----------------------------------- 자바 1차가 베이스
 *    
 *    자바 <===> 오라클
 *    JSP (**MVC)
 *    **스프링 프레임워크
 *    **VueJS, ReactJS
 *    **마이바티스
 *    -----------------
 *    
 *    자바 => base
 *    -----------
 *    1) 데이터 저장
 *    	 --------
 *    	 = 변수 : 데이터 읽기/쓰기를 위한 데이터 저장공간
 *    	   기본형 - 자바에서 지원
 *    			  1byte, 2byte, 4byte, 8byte
 *    			  -----  -----	-----  -----
 *    			  byte	  char	int	   long
 *    			  boolean short	float  double
 *    			=> 정수 : byte, int, long(파일 크기, 데이터 갯수)
 *    			=> 실수 : double
 *    			=> 문자 : char
 *    			=> 논리 : boolean
 *    			=======================> 데이터를 한개씩 저장 (제어 불편)
 *    						
 *    	   참조형 - 사용자 정의
 *    			  배열 => 1차원 [] => 고정적이라는 단점, 연속적인 메모리
 *    			  클래스 => 가장 많이 사용 (프로그램에 필요한 데이터를 모아서 관리)
 *    			  ==> 데이터가 커지거나, 작아질 경우에 처리 => **형변환
 *    				  형변환 : 자동 형변환, 강제 형변환 (큰 데이터 -> 작은데이터)
 *    						 --------
 *    						 작은데이터 -> 큰 데이터
 *    						 예) int i = 'A'
 *    							-----	 --
 *    							4byte >	2byte -> 'A'(int변환) => 65
 *    						   double d = 10;
 *    						   ------	  ---
 *    							 8    >    4  ==> int(double)
 *    							*** 항상 왼쪽에 있는 변수가 대입값보다 크거나 같다
 *    	 ------------------------------------------------------------			
 *    	 클래스의 형변환 : ClassCastException (is-a(상속), has-a(포함))
 *    	 ---------- 단점 : 상위 클래스로 받는 경우 (하위 클래스에 있는 변수에 접근이 불가능)
 *    					  메소드는 하위 클래스가 가지고 있는 메소드를 호출한다
 *    					  *** 자바에서 지원하는 모든 메소드는 Object를 리턴한다
 *    					  *** 제네릭스 
 *    	 => 상속내리는 클래스 > 상속 받는 클래스보다 크다 (extends, implements)
 *     		*** 인터페이스도 포함된다
 *     		*** 구분 (클래스 : 단일, 인터페이스 : 다중)
 *     
 *     	 데이터 처리
 *     	 --------
 *        연산자
 *        	단항연산자
 *        	  증감연산자 : ++, -- (한개증가, 한개감소)
 *        			   전치연산자(++a), 후치연산자(a++) -> 웹에서는 구분하지 않는다
 *        			   ==> 반복문, ==> 화면 UI
 *        	  부정연산자 : !
 *        	  형변환연산자 : (type)
 *        				 ------ 참조형, 기본형
 *        						----
 *        						Object obj = new A();
 *        						A a = (A)obj;
 *        	이항연산자
 *        	  산술연산자 : +, -, *, /, %
 *        	  논리연산자 : &&, ||
 *        	  비교연산자 : ==, !=, <, >, <=, >=
 *        	  대입연산자 : =, +=, -=
 *        	  --------------------------------
 *        		WHERE age>10
 *        				오라클	 	 자바			자바스크립트
 *        			  age<>10      age!=10 		age!==10
 *        			  age=10       age==10		age===10
 *        	삼항연산자 : (조건)? 값:값 => if ~ else
 *       데이터 제어
 *       --------
 *        제어문
 *        = 조건문
 *        	단일 조건문 : if(조건문) ==> 비교연산자, 논리연산자, 부정연산자 (true / false)
 *        			   형식) if(조건문) {
 *        						조건문이 true일떄만 수행하는 문장
 *        					}
 *        					=> 오라클에서는 : WHERE 조건 (if문)
 *        					=> JSP
 *        					   <c:if test="조건문">
 *        							처리문장
 *        					   </c:if>
 *        	선택 조건문 : if(조건문) ~ else
 *        			   형식)
 *        					if(조건문) {
 *        						조건이 true
 *        					} else {
 *        						조건 false
 *        					}
 *        
 *        					WHERE <> OR =
 *        					<c:choose>
 *        						<c:when test=""> ==> if
 *        						</c:when>
 *        						<c:otherwise> ==> else
 *        						</c:otherwise>
 *        					</c:choose> ==> 화면 출력 (브라우저)
 *        	
 *        	다중 조건문 : if(조건문) ~ else if(조건문) ~ else
 *        			   if(조건문) {
 *        					조건이 true => 문장 수행 후 종료
 *        					조건이 false => 계속해서 진행
 *        			   } else if (조건문) {
 *        			
 *        			   } else if (조건문) {
 *        		
 *        			   } else {
 *        				
 *        			   }
 *        			   ----------------------------------- 해당 조건에 맞는 if만 수행하고 종료
 *        	
 *        = 반복문
 *        	 - for
 *        		=> 이차 for문 (코테)
 *        		=> 형식
 *        		   일반 for
 *        			 for(초기값; 조건식; 증감식;) {
 *        				반복 처리 문장
 *        			 }
 *        		   for-each
 *        		   for(데이이터형 변수 : 배열, 컬렉션) {
 *        				변수 ==> 실제 저장된 데이터 ==> 출력용으로 사용 (화면 UI)
 *        		   }
 *        	 - while
 *        		=> 데이터베이스 프로그램에서 많이 사용
 *        		=> 무한루프
 *       		   while(true) {
 *       			   처리문장
 *       			   종료조건
 *       		   }
 *        = 반복제어문 : break(반복문 중단)
 *        
 *       ----------------------- 처리 + 제어 = 메소드
 *       
 *       ==> 문법 익히기
 *       	 --------- 묶는 연습
 *       	 1) 변수
 *       		=> 배열(같은 데이터형), 클래스(다른 데이터형) ==> 캡슐화
 *       	 2) 명령문
 *       		=> 메소드
 *       		   1. 처리요청 => 요청 데이터 => 처리후 => 결과값을 받는다
 *      					   --------			   ----
 *      						매개변수				리턴형
 *      		   2. 리턴형 매개변수
 *      			  ----------
 *      			   O	 O
 *      			   O	 X()
 *      			   X 	 O
 *      			   X	 X
 *      			   -void 
 *      		   ==> 데이터베이스
 *      			   SELECT	==> 데이터 찾기 => 찾은 데이터를 보내준다 (리턴형 존재)
 *      			   ------------
 *      			   UPDATE
 *      			   INSERT
 *      			   DELETE
 *      			   --------- 오라클 자체 처리 ==> void
 *      
 *      			   검색, 상세보기, 목록 ==> 리턴형
 *      			   -------------------------
 *      			   목록 : ArraysList
 *      			   상세 : 클래스
 *      			   검색 : ArrayList
 *      			   비번,로그인 : boolean
 *      			
 *      		   => 메소드 형식
 *      		   public [] 리턴형 메소드명(매개변수...) => 선언부 {
 *      				 ---
 *      				static, final, abstract
 *							구현부
 *      		   }
 *      		   => 일반 메소드가 가장 많이 싸용
 *      		   => 구조프로그램 (오류처리, 재사용, 추가)
 *      		   => 반복제거
 *      		   => 중심 : 재사용
 *      	---------------------------------------------------------------
 *      	class 구성요소
 *      	- 변수
 *      		인스턴스 : new사용만큼 메모리가 생성 (따로 생성)
 *      		정적변수 : 메모리 공간 1개 (공유)
 *      		private 접근지정어로 데이터 보호
 *      	- 생성자 : 초기화용
 *      		public 
 *      	- 메소드 : 다른 클래스와 통신
 *      		public
 *      	
 *      	1. 변수 => 초기화 방법
 *      		- 명시적 초기화 (O) ==> ArrayList, 배열
 *      		- 초기화 블록
 *      		  static 변수 => 초기화 블록으로 초기화 하는것이 편함
 *      		- 생성자
 *      		  인스턴스 변수 => 생성자로 초기화 하는것이 편함
 *      		  => 연결 (서버, 쓰레드 동작, 데이터베이스 연결, 쿠키)
 *      	2. 생성자
 *      		- 메모리에 클래스를 저장시 처음 호출
 *      		- 리턴형이 없다, 클래스명과 동일
 *      		- 오버로딩이 가능하다 (여러개 만들수 있음)
 *      		  ----- 같은 메소드명으로 새로운 기능 추가
 *      			조건) 메소드명이 동일
 *      				 매개변수의 갯수나 데이터형이 달라야한다
 *      				 리턴형은 관계없다
 *      		- 생성자가 없는 경우는 자동으로 매개변수 없는 생성자가 추가
 *      	3. 메소드
 *      	   인스턴스변수나 static변수를 이용해서 처리 (인스턴스 메소드)
 *      	   변수와 관련 없이 처리 --> static메소드로 만든다
 *      -----------------------------------------------------
 *		객체지향의 3대 요소
 *		
 *		캡슐화 : 데이터 보호 -> 변수는 private, 읽기/쓰기 -> getter/setter
 *		상속/포함 : 재사용
 *				   상속 : 변경이 가능
 *				   포함 : 있는 그대로 사용
 *		다형성 : 수정, 추가
 *			   ---	---
 *			오버라이딩	오버로딩
 *	
 *		접근지정어
 *		*** private < default < protected < public
 *
 *		상속 : 기존의 클래스가 가지고 있는 모든 내용을 받아서 사용
 *			=> 확장 (기존의 클래스를 확장해서 사용) => extends => 단일 상속
 *			=> 예외 조건 : static, 생성자, 초기화블록, private
 *    	-------------------------------------------------------
 *    	클래스의 종류
 *    	---------
 *    	 1. 추상 클래스 : 미완성된 클래스 (메소드 구현여부) => 메모리 할당을 할 수 없다
 *    				   => 사용시에는 반드시 사용자가 상속을 받아서 구현후에 사용
 *    				   형식)
 *    					public abstract class ClassName {
 *    						------------------------
 *							 인스턴스 변수 설정이 가능    
 *    						------------------------
 *    						 생성자
 *    						------------------------
 *    						 구현된 메소드
 *    						------------------------
 *    						 구현이 안된 메소드
 *    						 public abstract 리턴형 메소드명();
 *    						------------------------
 *    					}
 *    				==> 주로 사용하는 목적
 *    					관련된 클래스를 묶어서 제어할때 주로 사용
 *    				==> 단일 상속만 가능
 *    	 2. 인터페이스 : 추상 클래스의 일종
 *    				  다중상속이 가능
 *    				  메모리 할당이 불가능
 *    				  인스턴스가 존재하지 않는다
 *    				  생성자가 없다
 *    				  => 표준화 -> List, Set, Map
 *    				  => 독립적으로 사용이 가능
 *    				  => 서로 다른 클래스 연결해서 사용이 가능
 *    				  => 결합성이 낮은 프로그램 (수정이 다른 클래스에 영향이 없게 만든다)
 *    				  => 요구사항 분석시에 제작
 *    	 ---------------------------------------------------------------
 * 							추상클래스					인터페이스   
 *    	 ---------------------------------------------------------------
 *    		상속				단일상속					다중상속			
 *    	 ---------------------------------------------------------------
 *    		상속방법			extends					implements
 *    	 ---------------------------------------------------------------
 *    		변수				인스턴스변수				상수형 변수
 *    	 ---------------------------------------------------------------
 *    		생성자			존재						존재하지않음
 *    	 ---------------------------------------------------------------
 *			메소드			구현된 메소드				구현이 안된 메소드
 *							구현이 안된 메소드	    	구현된 메소드
 *													default
 *													static
 *    	 ---------------------------------------------------------------
 *    		상속
 *    		 interface A 
 *    		 interface B extends A
 *    		 interface C extends B
 *    
 *    		 interface A 
 *    		 interface B 
 *    		 interface C extends A, B
 *    
 *    		 interface A 
 *    		 interface B
 *    		 class C implements A, B 
 *    
 *    		 interface A 
 *    		 interface B
 *    		 class C
 *    		 class D extends C implements A, B
 *    
 *       3. 내부클래스 : 쓰레드, 네트워크, 빅데이터 분석 (MapReduce, Spark)
 *       	 => 멤버클래스
 *       		class A {
 *       			데이터
 *       			class B {
 *       				A가 가지고있는 데이터를 공유할 떄 사용
 *       			}
 *       		}
 *       	=> 익명의 클래스 (스프링)
 *       	   class A { ==============> 윈도우에서 많이 나옴
 *       			B b = new B() {
 *       				public void display() {
 *       				}
 *       			}
 *       			// 상속없이 오버라이딩이 가능한 클래스
 *       	   }
 *       	   class B {
 *       			public void display() {
 *       			}
 *       	   }
 *       	=> 지역 클래스
 *       		class A {
 *       			public void display() {
 *       				class B {
 *       				
 *       				}
 *       			}
 *       		}
 *       4. 종단클래스 : 확장이 불가능한 클래스
 *       	final className ==> String, Math, System,
 *
 *		--------------------------------------------------- 7장
 *
 *		예외처리 => 사전에 에러방지 프로그램, 비정상 종료를 방지하고 정상 수행 가능하게 만든다
 *			  => 수정이 가능한 에러시에 사용
 *			  => 반드시 예외처리 : 컴파일시 에러 = CheckedException
 *				 java.io, java.sql, java.net, Thread => 예외처리를 필요로 한다
 *			  => 필요시 예외처리 : 실행시(런타임) 에러 예상 = UnCheckedException
 *
 * 									Object
 * 									  |
 * 								  Throwable
 * 									  |
 * 							-----------------------------------------
 * 							|										|
 * 						  Error									 Exception
 * 																	|
 * 														------------------------------
 * 												  CheckedException			UnCheckedException
 * 														|								|
 * 												    IOException						RuntimeException
 * 													SQLExcption							|
 * 													MalFormedURLException			NullPointerException
 * 													ClassNotFoundException			NumberFormatException
 * 													InterruptedException (Thread)	ArrayIndexOutOfBoundsException
 *		-----																		ClassCastException
 *			=> 예외 복구
 *				try {
 *					정상수행이 가능한 문장
 *				} catch (예외처리 종류) {
 *					예외 발생시 복구하는 문장, 에러 확인
 *										getMessage(), ** printStackTrace()				
 *				} finally {
 *					try, catch 상관없이 무조건 수행하는 문장 (닫기 => 데이터베이스, 파일 닫기) => 생략이 가능
 *				}
 *				==> 중요
 *					전체 문장에서만 사용하는 것이 아니다
 *					예외가 발생할 소스위치에서도 사용이 가능 ==> 크롤링
 *	
 *			=> 예외 회피 => 간접처리 => 시스템에 알려만 준다 => 예외선언
 *			method() throws 예외처리 ....
 *
 * 			=> 처리방법
 * 			   method() thorws 예외처리 ...
 * 
 * 			   method() {
 * 			   		try {

 * 					} catch(Exception)
 * 			   }
 *			=> 사용자 정의 (프로그래머) => throws문장으로사용하지 않고 보통 try ~ catch
 *				=> 라이브러리에서 주로 처리후 사용이 가능
 *		----------------------------------------------- 8장
 *
 */
// 멤버 클래스 => 두개의 클래스가 공유해야되는 데이터, 메소드 존재할 떄 주로 사용
class A { // 윈도우, Server (접속담당)
	class B { // 쓰레드, 통신 담당
		public void display() {
			System.out.println("B:display() Call...");
		}
	}
	public void aaa() {
		B b = new B();
		b.display();
	}
}
//익명의 클래스 => 상속을 받으면 속도가 늦기때문에 상속없이 메소드를 변경해서 사용할 떄 => 빅데이터
// 마이바티스, 스프링 => 가끔 사용
// 윈도우 => 포함 클래스 
class D {
	E e = new E() {
		public void display() {
			System.out.println("D.E:display() Call...");
		}
	};
}

class E {
	public void display() {
		System.out.println("E:display() Call...");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		A.B ab = a.new B();
		ab.display();
		a.aaa();
		
		E e = new E();
		e.display();
		
		D d = new D();
		d.e.display();
	}

}






