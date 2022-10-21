/*
 * 	 = 평문 -> 순차적으로 처리가 되게 만든다
 * 	 = 조건따라서 건너뛸 수 있게, 반복적으로 수행 --> 프로그램 흐름을 변경 - 제어문
 * 		-------------> 제어문 : 연산자응용
 * 					   ------------- 한개의 기능 (메소드)
 *	 = 웹, Application, Mobile --> 변수, 연산자, 제어문
 *	 = 객체 지향 프로그램 (어렵게 만들었다)
 *
 *   형식) 조건의 결과값 (boolean) - 부정연산자, 비교연산자, 논리연산자
 *   	 if(조건) {
 *   	 	조건이 true일때 수행문장
 *   	 }
 */

// 1. 정수를 입력을 받아서 짝수, 홀수 
import java.util.Scanner;

public class 조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 :");
		
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			System.out.println(num + "는(은) 짝수입니다");
		} else {
			System.out.println(num + "는(은) 홀수입니다");
		}
		
		// 프로그램에 필요한 내용만 출력이 가능하게 만든다
		/*
		 * if(num % 2 != 0) { System.out.println("홀수입니다"); }
		 */
	}

}
