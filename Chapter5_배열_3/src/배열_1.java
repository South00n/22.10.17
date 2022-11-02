/*
 *    배열 생성, 초기화, for문
 *    데이터값 제어 : 일반 for문
 *    			  -------- back
 *    데이터값 출력 : forEach (향상된 for문) - readonly *중요*
 *        		  -------- front
 *        
 *    1) 데이터 저장
 *    2) 연산자, 제어문
 *    3) 결과값 출력
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 알파벳을 저장 --> 출력 26개
		
		char[] alpha = new char[26]; // '\u0000'로 초기화
		/*
		 *   new --> 메모리 저장공간 확보
		 *   int --> 0
		 *   long --> 0L
		 *   float --> 0.0F
		 *   double --> 0.0
		 *   char --> '\u0000'
		 *   boolean --> false
		 */
		// 배열에 값을 대입
		// 배열 --> 인덱스를 이용한다 --> int 이용
		char c = 'A';
		// 배열 범위 초과시 에러발생 --> 에러 방지를 위해서 length이용
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = c++;
		}
		// 제어할 수 있다
		// 출력
		// 배열(고정), 컬렉션(가변)만 사용 가능
		for (char ch : alpha) {
			System.out.print(ch + " ");
		}
	}

}








