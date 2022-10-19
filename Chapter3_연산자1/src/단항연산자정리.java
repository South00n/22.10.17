/*
 *  단항연산자
 *    = 증감연산자 (++,--)
 *    	 ++ : 값을 1증가
 *    	 -- : 값을 1감소
 *    	 1) 전치 연산자
 *    		++a ---> 다른 변수에 대입시 먼저 증가후에 대입
 *    	 2) 후치 연산자
 *    		a++ ---> 다른 변수에 대입시 대입 후 증가시킨다
 *    
 *    = 부정연산자 (!) -> boolean만 사용이 가능 (true -> false, false -> true)
 *    
 *    = 형변환 연산자 (type)
 *    	  자동 형변환
 *    	  1) 변수에 값을 대입하는 경우 double d = 10;
 *    	  2) 연산처리시				int + double = double
 *    
 *    	  강제 형변환
 *    	  1) 라이브러리에서 데이터 추출 -> 강제로 변경
 *    	  (double)10 --> 10.0
 *    	  (int)'A' --> 65
 *    	  (char)65 --> 'A'
 */
public class 단항연산자정리 {
	public static void main(String[] args) {
		char c = ' ';
		System.out.println(c);
	}
}
