import java.util.Arrays;

// A ~ Z사이의 문자를 10개 저장 --> 가장 큰 값과, 가장 작은 값을 출력
public class 배열응용_2_문제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = new char[10];
		
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = (char)((Math.random() * 26) + 65);
		}
		System.out.println(Arrays.toString(alpha));
		// 초기화
		
		char max = alpha[0];
		char min = alpha[0];
		//for (int i = 0; i <alpha.length; i++) {
		for (char c : alpha) {
			if (c > max) {
				max = c;
			} else if (c < min) {
				min = c;
			}
		}
		// 필요한 데이터를 찾기 위한 제어
		System.out.println("가장 큰 문자 : " + max);
		System.out.println("가장 작은 문자 : " + min);
		// 찾은 내용을 출력
		/*
		 *   데이터를 여러개 저장
		 *   -------------- 값 (초기화)
		 *   1) 검색
		 *   2) 순서 변경(sort)
		 *   3) 출력
		 */
	}

}
