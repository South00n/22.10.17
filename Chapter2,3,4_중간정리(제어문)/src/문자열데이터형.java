/*
 *    문자열 --> String (클래스)
 *    		   데이터형, 클래스형(문자열 관련 기능)
 *    사용법)
 *    		String 변수명 = "값";
 *    기능)
 *    		비교 : equals(), equalsIgnoreCase()
 *    			 --------- -------------------
 *    			 대소문자 구분   대소문자 구분없이 구분
 *    			   로그인			   검색
 *    		문자열길이 : length()
 *    		문자 1개 : charAt()
 *    		---------------------
 */
public class 문자열데이터형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello Java";
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		
		for(int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

}
