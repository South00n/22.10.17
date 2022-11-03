/*
 *    메소드
 *    	구성 요소
 *    	처리 결과값(리턴값)		사용자 요청값(매개변수)
 *    	예) 정수 두개를 보내주고 --> 더한 값을 달라
 *    	   ------- 매개변수	   ----- 리턴값
 *    		id, pwd  ---> 로그인 여부 확인 요청 ---> boolean
 *    	
 *    	메소드 제작
 *    	--------
 *    	--------------------------------------------
 *    		결과값(리턴형)			매개변수
 *    	--------------------------------------------
 *    			O				  O		====> String substring(int s)
 *    	--------------------------------------------
 *    			O				  X		====> String trim()
 *    	--------------------------------------------
 *    			X				  O		====> System.out.println("A")
 *    										  void println(String a)
 *    	--------------------------------------------
 *    			X				  X		====> System.out.println();
 *    	--------------------------------------------
 *    	호출
 *    
 *    	기존에 있는 프로그램을 기능별로 나눠서 작업 (분업화)
 *    	** 메소드는 반드시 한개의 기능만 수행할 수 있게 만든다 (재사용이 편하다)
 *    	   입력 기능
 *    	   처리 기능 ==> 세분화
 *    	   출력 기능
 *    
 *    	메소드
 *    	 = 선언부 (원형)
 *    	   리턴형(결과값) 메소드명(매개변수)
 *    	 = 구현부
 *    	   리턴형(결과값) 메소드명(매개변수) {
 *    	   		구현
 *    	   }
 *    	= 더하기 기능
 *    	  int add (int a, int b) {
 *       	  맨 마지막줄에
 *            return a + b; --> 메소드 종료 시점
 *            데이터형이 리턴값과 일치해야함(권장) (데이터형 크기 >= 리턴값 크기)
 *        }
 *        
 *        void insert() {
 *        ---- 메소드 자체 처리 (데이터베이스 --> insert, update, delete)
 *    	  	  return; --> 생략이 가능 
 *    	  }
 *    
 *    	  1) 구성요소
 *    		1.매개변수 -> 사용자가 요청한 값
 *    					= 로그인요청 (id, pwd)
 *    					= 아이디 중복체크 (id)
 *    					*** 여러개 -> ,로 구분
 *    						---- 3개이상 (배열, 클래스를 이용해서 전송)
 *    						예) 정렬 -> 배열
 *    						   회원가입 -> 클래스 (다른데이터형) 
 *    		2.메소드명 -> 변수(식별자)
 *    				   	1) 알파벳, 한글 (알파벳 -> 대소문자 구분)
 *    					2) 숫자 (앞에 사용 금지)
 *    					3) 특수문자 (_, $)
 *    					4) 키워드는 사용 금지
 *    					약속 사항 ---> 소문자로 시작한다
 *    								단어가 2개이상인 경우 
 *    								getFileName, get_file_name으로 작성
 *    		3.리턴형(결과값) => 사용자 요청을 처리한 결과값
 *    						메소드
 *    						  -> 자체 처리 (구구단) --> void
 *    						  -> 결과값을 넘겨준다 (로그인 여부 확인) --> 리턴값 데이터형
 *    							 ---- 반드시 1개만 설정이 가능하다
 *    								  -------------------- 여러개나오면 (배열, 클래스)
 *    
 *    		4. 매개변수
 *    		   ------- 1) 사용자가 입력 (명시적인, 초기화, Scanner, random())
 *    		   ------- 2) 반복 제어 -> 틀린문장 
 *    				   3) 웹 -> 검색, 입력, 버튼 클릭, 메뉴 클릭, 페이지 요청, 상세보기
 *    				   ==> 반드시 자체 출력, 결과값을 넘겨준다
 */
//--> 년도, 월, 일을 입력
import java.util.Scanner;
public class 메소드_1 {
	/*
	 * 		int userInput() {
	 * 		
	 * 		} --> 메소드_1 a = new 메소드_1();
	 * 			  a.userInput(); // 객체 생성후 사용가능
	 * 
	 * 		static int userInput() {
	 * 		
	 * 		} --> 자동 메모리 할당 
	 */
	static int userInput(String msg) {
		Scanner sc = new Scanner(System.in);
		System.out.print(msg);
		int value = sc.nextInt();
		return value;
	}
	public static void main(String[] args) {
		
		int year = userInput("년도 입력:");
		int month = userInput("월 입력:");
		int day = userInput("년도 입력:");
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력:");
		int year = sc.nextInt();
		
		System.out.print("월 입력:");
		int month = sc.nextInt();
		
		System.out.print("일 입력:");
		int day = sc.nextInt();
		*/
		System.out.println(year + "년도 " + month + "월 " + day + "일");
	}
}






