/*
 *    자바에서 지원하는 연산자
 *    -----------------
 *    종류 - 87page, 91page(우선순위)
 *    	단항연산자 (피연산자 1개)
 *    	  증감연산자 : ++, --
 *    		1) 전치연산자 = ++a, --a
 *    		2) 후치연산자 = a++, a--
 *    		---------------------- 공통점 a를 한개 증가, 감소
 *    		대입, 출력
 *    		=> 증가가 먼저냐 대입이 먼저냐
 *    		int a = 1;
 *    		int b = ++a; 
 *    				==> 증가 먼저, 증가값을 대입 b = 2, a = 2					
 *    
 *    		int a = 1;
 *    		int b = a++; b = 1
 *    				==> 대입 먼저, 증가를 나중에 b = 1, a = 2
 *    			
 *    	  부정연산자 : ! => boolean만 사용이 가능 -> true <-> false
 *    				if(!예약일)
 *    				=> 주로 제어문 (if, for, while -> 조건에서 많이 사용)
 *    				=> 게임 : 턴제
 *     
 *    	  형변환 연산자 : (데이터형)
 *    				=> 강제 형변환 (작게, 크게)
 *    							 --- 
 *    							 주로 (char)65, (int)10.6..
 *    	이항연산자 (피연산자 2개)
 *    	  산술연산자 : +, -, *, /, %
 *    		1) 형변환 (데이터형이 다를 경우) 10 + 10.5 = 20.5
 *    		2) +
 *    		   -> 산술연산
 *    		   -> 문자열 결합
 *    		3) / 
 *    		   -> 0으로 나눌 수 없다
 *    		   -> 정수/정수 = 정수
 *    		4) %
 *    		   -> 결과갑싱 항상 왼쪽부호와 동일	
 *    			  + % + = +
 *    		 	  - % + = -
 *    	  -------------------------------- 조건,범위 true/false
 *    	  비교연산자 : ==, !=, <, >, <=, >=
 *    				-------------------- 숫자관련, 문자 (문자열은 제외)
 *    				boolean 비교
 *    				1. 자바스크립트 : ===, !==
 *    				2. 오라클 : = , !=(<>,^=)
 *    	
 *    	  논리연산자 : &&, ||
 *    				&& : 범위, 기간 포함 (예약일, 체크인/체크아웃)
 *    				--	 직렬연산자, false일 확률이 높은 조건을 앞에 배치
 *    				
 *    				|| : 범위를 벗어나는 경우 (에러)
 *    				--   병렬연산자, true일 확률이 높은 조건을 앞에 배치
 *    	  -------------------------------- 제어문
 *    	  대입연산자 : =, +=, -=, *=
 *    			   기본 : 값을 대입, 연산 결과, 변수값을 변경 (=)
 *    				     +=, -=, *= (복합 대입 연산자) : 합, 차, 곱 (제어문 증감을 많이 설정, 누적할때 많이사용)
 *    					 int a = 10;
 *    					 a += 2; --> a = a + 2;
 *    	
 *    	삼항연산자 (피연산자 3개) ==> if ~ else - 소스를 줄일 경우 (웹) -> 가끔 등장
 *    	  (조건)? 값1 : 값2
 *    	  ----- true  => 값1
 *    			false => 값2
 *    	********************** 고정값 (부정, 비교, 논리 => boolean)
 *    						   변동값 (산술, 삼항)
 *    							 증감연산자 : 문자, 정수만 사용 (실수x)
 *    	
 *    	* 산술 변환
 *    	  ==> 연산자 처리
 *    		  1) char ==> int변경
 *    		  2) 데이터형이 다른 경우 => 큰 데이터형으로 변환
 *    			 예)
 *    				long  + int ==> long + long = long
 *    				double + long => double + dobule = double
 *    				-----------------------------------------
 *    		  3) 정수 / 정수 = 정수, 정수 / 실수 = 실수
 *    
 *    
 */
public class 연산자_86page {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
