/*
 *   배열 : 같은 데이터형을 묶어서 관리
 *   -------------------------
 *   String : 일반 데이터형식
 *   	int a = 10;
 *   	String s = "10";
 *   	// 모든 클래스형
 *   	   A a = new A();
 *   	   | |    |  |
 *   	1.클래스명(데이터형)
 *   	  2.변수(객체)
 *   		 3.동적메모리 할당
 *   			  4.생성자
 *   ==> Call By Value : 기본형 (실제 값 저장) --> String
 *   	 Call By Reference : 배열, 클래스 (주소)
 *   
 *   String --> 문자 여러개를 묶어서 저장
 *   			"문자저장"
 *   			-> char[]을 조작해서 만든 클래스
 *   String을 여러개 묶어서 관리 --> String 배열
 *   
 *   1) 배열
 *   	선언
 *   	 String[] 배열명; (권장)
 *   	 String 배열명[];
 *   
 *   	초기화
 *   	 String[] 배열명 = {"", "", "" ..}
 *   	 String[] 배열명 = new String[10];
 *   	 -------------------------------
 *   	  자동 초기화
 *   		int     -> 0
 *   		double  -> 0.0
 *   		float   -> 0.0f
 *   		boolean -> false
 *   		long    -> 10L
 *   		String  -> null (주소값이 없는 상황) ---> 206 page
 *   
 *   	출력 방법
 *   	 for (int i = 0; i < 배열명.length; i++) {
 *   		System.out.println(배열명[i]); --> 인덱스번호 이용해서 출력
 *   	 }
 *   
 *   	 for (String s : 배열명) {
 *   		System.out.println(s); --> 실제 데이터를 읽어서 출력하는 방법
 *   	 }
 *   
 *   	값 변경
 *   	 배열명[인덱스] = 값;
 *   
 *   	 String[] f = {"강아지", "고양이", "두더지"};
 *   	 강아지 -> 병아리
 *   	 f[0] = "병아리";
 *   	 --------------------> 모든 데이터형의 배열은 동일
 *   
 */
public class 문자열배열정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
