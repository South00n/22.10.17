/*
 *    메소드 : 특정 작업을 하기 위한 명령문의 집합
 *    		 ** 메소드와 함수의 차이점
 *    			----  --- (독립적으로 생성) -> 자바스크립트, C언어 - 기능은 동일
 *    		 클래스 종속(클래스 안에서 생성)
 *    		 특정 작업 (한가지 기능을 수행)
 *    				 -------------- 재사용성은 높일 수 있다
 *    		 ** 형상관리 : GIT (협업)
 *    1) 메소드를 사용하는 목적
 *    	= 반복되는 기능을 제거
 *    	= 코드관리가 쉽다 (기능별로 나눠서 처리) --> 문장 단락을 나눠서 처리 (유지보수)
 *    	= 소스가 간결해 진다 (중복코드를 제거)
 *    	= 다른 클래스와 연결
 *    	= 재사용률 높인다 (출력 : System.out.println(), Math.random()...)
 *    2) 메소드의 정류
 *    	= 공통 메소드 : 자동으로 메모리에 저장 = static (***)
 *    	= 인스턴스 메소드 : 메모리마다 따로 저장 메소드
 *    	= 추상 메소드
 *    3) 메소드를 만드는 형식
 *    	 1.리턴형 2.메소드명 (3.매개변수) {
 *    		처리 문장 -> 지역변수, 연산처리, 제어문처 처리 
 *    		return 값
 *    	 }
 *    4) 메소드의 구성요소
 *    	 1. 리턴형 : 사용자 요청 --> 처리 --> 결과값을 사용자에게 전송 
 *    			   --------------------------------------
 *    			   웹) 로그인, 회원가입, 게시판 글쓰기, 게시판, 영화 목록 ... : 결과값이 있어야 화면을 변경
 *    				  메뉴(메소드), 버튼
 *    				  --> 기능 설계 (벤치마킹 --> 요구사항 분석)
 *    			   --> 한개만 사용이 가능
 *    				   기본형(int, double, String, 클래스, 배열)
 *    				   형식)
 *    					 	int 메소드명()
 *    						double 메소드명()
 *    						String 메소드명()
 *    						-------------------- Call By Value
 *    						Movie 메소드명()
 *    						int[] 메소드명()
 *    						-------------------- Call By Reference 사용하지 않을 수 있다 (리턴형 -> 매개변수)
 *    				*** 결과값이 없는 경우 --> void(메소드 자체에서 처리)
 *    	 2. 메소드명 : 식별자(변수)
 *    				알파벳, 한글(대소문자 구분)
 *    				숫자를 사용할 수 있다 (앞에 사용금지)
 *    				키워드는 사용할 수 없다
 *    				특수문자 (_ , $)
 *   				메소드명의 길이는 제한이 없다 (5 ~ 12)
 *   				** 소문자로 시작한다
 *   				** 단어가 두개이상이면 첫자는 대문자 or _
 *   				ex) getFileName(), get_file_name()
 *   				** 변수명, 메소드명 ... : 리팩토링
 *    	 3. 매개변수 : 사용자가 요청한값
 *    				 웹) 입력, 클릭 (<a>, <button>) --> URL주소를 이용해서 데이터 전송
 *    				 매개변수는 갯수 제한이 없다
 *    				 매개변수가 3개 이상 --> 배열, 클래스 이용한다
 *    				 구분은 ,로 한다
 *    				 *** 사용자로부터 어떤 값을 받을지, 어떤 결과값을 보내줄지 핵심 (매개변수, 리턴값)
 *    				 없는 경우도 있다
 *    	 4. 처리문장 : 연산처리 (연산자), 제어문
 *    				--------------------
 *    				오라클, 파일 찾기
 *    	 5. 결과값 : 메소드안에 "return 값"
 *    			   결과값이 없는 경우 : void --> return 생략 가능 (컴파일러가 자동 첨부)
 *    			   return의 위치는 메소드안에만 존재하면 된다
 *    			   return은 메소드 종료시에 사용 (for -> break)
 *    5) 메소드 -> 생각
 *    		1. 동작 과정(행위) // 어떤걸 클릭했을때 무슨 화면이 나오는지
 *    		2. 화면에 출력된 내용 : 리턴형
 *    		3. 사용자에게 유도 : 매개변수
 *    		
 */
public class 메소드정리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
