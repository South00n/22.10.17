/*
 *    java.lang
 *    	= Object : 최상위 클래스 (모든 클래스에 상속을 내리는 클래스) => 최상위 데이터형
 *    	  => Object[] obj = {"홍길동", 30, 187.5, 'A', new Saram()...};
 *    	  => 1) 소멸자 (메모리 해제) => finalize() => GC가 호출
 *    			 원형) protected void finalize() 
 *    		 2) 복제 => 있는 값 그대로 새로운 메모리를 생성 => clone() => prototype
 *    			 원형) protected Object clone()
 *    				  메소드명, 기능, 리턴형, 매개변수
 *    				  -----------------------
 *    		 3) 객체 비교 => equals() => 주소값으로 비교 (기본형 ==, 참조형 equals())
 *    			 원형) public boolean equals(Object obj)
 *    			      실제로 => 오버라이딩 (변경) ==> String에서 실제 저장된 문자열
 *    		 4) 문자열 변환 => toString() ==> 생략할 수 있다 (객체명만 출력)
 *    			A a = new A(); ==> System.out.println(a) => a.toString() 
 *    			 원형) public String toString() : 객체의 주소값 출력, 객체의 멤버변수의 값 출력 (오버라이딩)
 *    		 5) 모든 클래스에는 extends Object가 생략
 *    		 6) java.lang은 import 생략이 가능하다
 *    	= String : 문자열 저장
 *    	  1) 문자열 저장 방식
 *    		 String s = ""; => 문자열의 주소를 얻는 방식
 *    		 String s = new String(""); => 새로운 메모리에 문자열을 저장
 *    		 => 참조변수이지만 => 기본형취급을 한다
 *    			주소를 참조  	 실제 데이터
 *    		   => Call By Reference, Call By Value
 *    	  2) equals : 문자열 비교 => 로그인 (id, pwd), 아이디 중복, 아이디 찾기, 비밀번호
 *    		  원형) public boolean equals(String s) => 대소문자 구분
 *    	  3) contains : 문자가 포함됐는지 => 검색기
 *    		  원형) public boolean contains(String s)
 *    	  4) startsWith : 시작문자열이 같은지 여부 : 쿠키, 서제스트(자동 완성기)
 *    		  원형) public boolean startsWith(String prefix)
 *    	  5) endsWith : 끝 문자열이 같은지 여부 : 사용빈도 거의없다
 *    		  원형) public boolean endsWith(String suffix)
 *    	  6) replace() : 문자열, 문자변경 => 크롤링(이미지 주소 => & => 다른 특수문자로 변경)
 *    		  원형) public String replace(char c1, char c2)
 *    			  public String replace(String s1, String s2)
 *    	  7) replaceAll : 정규식을 이용해서 변경
 *    		  원형) public String replaceAll(String regex, String s)
 *    									   -------------
 *    	  8) split : 구분자를 통해서 문자열을 구분해서 배열에 저장 (StringTokenizer)
 *    		  원형) public String[] split(String regex) => 구분자는 정규식으로 사용
 *    	  9) length : 문자 갯수
 *    		  원형) public int length()
 *    	  10) indexOf : 원하는 위치의 문자나 문자열을 찾기 (앞에서부터 찾기)
 *    		  원형) public int indexOf(char c)
 *    		      public int indexOf(String s)
 *    			  => 자바 문자열은 시작번호가 0부터 시작한다
 *    	  11) lastIndexOf : 원하는 위치의 문자나 문자열을 찾기 (뒤에서부터 찾기)
 *    		  원형) public int lastIndexOf(char c)
 *    		      public int lastIndexOf(String s)
 *    	  12) substring : 문자열을 자를경우에 사용
 *    		  원형) public String substring(int s)
 *    		  	  public String substring(int s, int e) => e는 제외된다
 *    	  13) valueOf : 모든 데이터형을 문자열로 변환
 *    		  원형) public static String valueOf(int a) => double, float, boolean ...
 *    			  String 클래스에 유일하게 static이다
 *    			  String.valueOf()
 *    	= StringBuffer : 문자열 결합시 많이 사용되는 클래스
 *    		문자열 결합 : append()
 *    		  원형) public StringBuffer append(String s) => double, int ...
 *    		문자열 변환 : toString()
 *    		  원형) public String toString()
 *    	= Wrapper
 *    		기본형 데이터형을 쉽게 사용할 수 있게 클래스형으로 제작 (모든 데이터형이 클래스화) \
 *    		= 제네릭스 사용, Object로 변환
 *    		= Interger(int) => parseInt()
 *    		= Double(double) => parseDouble()
 *    		= Boolean(boolean) => parseBoolean()
 *    		= Long(long) => parseLong()
 *    		Boxing / UnBoxing
 *    		------	 -------- 기본형에 클래스형을 대입 int ii = i;
 *    		클래스에 일반 데이터값을 대입
 *    		Integer i = 10;	
 *    	= System : gc()
 *    	= Math : random(), ceil(), round()
 *    java.util
 *    	= StringTokenizer
 *    	= Scanner
 *    java.util.regex
 *    	= Pattern
 *    	= Matcher
 */
public class 정리_1권_라이브러리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
