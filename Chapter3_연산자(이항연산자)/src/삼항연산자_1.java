/*
 *   삼항연산자 : 피연산자가 3개인 경우
 *   형식)
 *   	(조건) ? 값1 : 값2
 *   	조건 true  --> 값1
 *   	조건 false --> 값2
 *   	소스코딩을 줄이기 위해 사용
 *   	페이지 (이전/다음)
 *   
 */
public class 삼항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'a';
		System.out.println(('A' <= c && c <= 'Z') || ('a' <= c && c <='z' )? "알파벳" : "알파벳이 아니다");
	}

}
