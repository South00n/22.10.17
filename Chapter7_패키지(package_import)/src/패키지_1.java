/*
 *    관련된 클래스를 묶어서 한개 폴더에 저장 관리
 *    자바에서 지원하는 패키지
 *    -----------------
 *    	java.util ===> jdk1.0
 *    	java.io
 *    	java.net
 *    	java.sql
 *    	javax     ===> jdk1.2
 *    	javax.xml
 *    	javax.servlet ===> 웹
 *    	-------------
 *    
 *    	예)
 *    		웹
 *    		게시판
 *    		예매
 *    		추천
 *    		회원
 *    		어드민
 *    		데이터형 -------------> import를 사용
 *    	 -------------------------------------
 *    	 폴더명 (패키지) com/org -> 회사명 -> 기능명
 *    	 예) 게시판 - com.sist.board
 *    						------
 *    		예매 - com.sist.reserve
 *    			  com.sist.recommand
 *    			  com.sist.member ...
 *    
 *    			  com.sist.board
 *    				=> Board 클래스
 *    			  public class Board {
 *    				int bno;
 *    				String name;
 *    				String content;
 *    			  }
 *    			  
 *    			  com.sist.member
 *    				=> Member
 *    				=> 사용이 불가능
 *    			  public class Member {
 *    				int mno;
 *    				String name;
 *    			  }
 *    
 *    1) 패키지란?
 *    	   클래스의 묶음 (관련된 클래스를 그룹단위로 묶어서 관리)
 *    	   .을 활용해서 저장 -> 폴더.폴더...
 *    2) 패키지를 사용하는 목적 : 찾기, 다른 클래스에서 불러서 사용하기 편하게 작업
 *    3) 패키지단위로 라이브러리 제작이 가능 --> .jar (재사용)
 *    	 기본 : 데이터형 클래스 -> ~VO --> ex) MovieVO (Value Object)
 *    		   ----------, 활용하는 메소드 MoiveManager
 *    4) 패키지 선언
 *    	 자바 소스 구조
 *    	 1) package 선언
 *    		=> 한번만 사용이 가능하다
 *    	 2) import 설정 --> 없는 경우도 있음
 *    		=> 여러개 사용이 가능하다
 *    	 3) public class ClassName {
 *    		----------------------
 *    		멤버변수 설정
 *    		 - 인스턴스 변수
 *    		 - 공유 변수 (static 변수)
 *    		----------------------
 *    		생성자
 *    		----------------------
 *    		메소드
 *    		----------------------
 *    		==> 클래스를 따로 제작
 *    		}
 *    		A, B, C ==> 기능 - Component
 *    		-------- Main(연결) - Container(조립)
 */
public class 패키지_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
