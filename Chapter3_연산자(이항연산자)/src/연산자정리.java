/*
 *  1. 단항연산자
 *     - 증감연산자 (++,--) : 반복문, 데이터베이스 값을 읽는 경우, 파일 읽기
 *       -> 1 증가, 1 감소 (정수형, 문자형)
 *       * 전치 연산자 ++a -> 먼저 증가후에 대입
 *       * 후치 연산자 a++ -> 대입을 먼저하고 나중에 증가
 *       
 *     - 부정연산자 (!) : 조건문, 예약일이 아닌 경우
 *       -> boolean에서만 사용이 가능 (true/false)
 *       -> 좌석 예매 - 맛집, 도서관 (빈자리 찾을때)
 *       
 *     - 형변환연산자 : 자동 형변환, 필요시 강제 형변환
 *       -> 클래스 형변환 (******)
 *       -> (데이터형)값 - 값을(데이터형)으로 바꿔라 -> 큰데이터형, 작은 데이터형(강제 / 오버플로우 발생가능)
 *     
 *     - 음수/양수 ( - , + )
 *     
 *  2. 이항연산자 : 연산자는 항상 같은 데이터형이 있어야 연산처리 (다른 데이터형이 있는 경우에 변경 처리)
 *     - 산술연산자 ( + , - , * , / , % ) -> 웹에서 가장 많이 사용되는 연산자
 *       -> 다른 데이터형을 묶어서 연산 - 자동 형변환이 된다
 *       	(가장 큰 데이터형으로 변환)
 *          int + int = int , long + long = long , double + double = double
 *          int + long = long , int + double = double
 *       -> / --> 0으로 나눌 수 없다
 *       -> % --> 결과값이 왼쪽 부호가 나온다
 *       
 *     - 비교연산자 : 조건문, 반복문 -> 응용(제어문), 삼항연산자
 *       -------> (결과값이 boolean)
 *       -> == 같다 (정수, 실수, 문자, 논리) --> 문자열은 비교 불가능 (equals), 객체비교 (instanceof)
 *       	!= 같지않다 (정수, 실수, 문자, 논리)
 *       	<  작다 (정수, 실수, 문자, 논리)
 *      	>  크다 (정수, 실수, 문자, 논리)
 *      	<= 작거나 같다 (정수, 실수, 문자, 논리) --> < || =
 *      	>= 크거나 같다 (정수, 실수, 문자, 논리) --> > || =
 *       
 *     - 논리연산자 : 조건문, 반복문 (제어문에서 주로 사용한다) --> 결과값은 무조건 boolean
 *       ------> && >> || (연산 우선 순위 &&)
 *       -> && (범위포함) 
 *       	|| (범위미포함)
 *       
 *       -> 효율적인 연산
 *        (조건) && (조건) : 조건이 false일 확률이 높은 것을 앞에 배치
 *        (조건) || (조건) : 조건이 true일 확률이 높은 것을 앞에 배치
 *        
 *     - 대입연산자
 *       -> =
 *       복합대입연산자
 *       -> +=
 *          -=
 *       	
 */
// 국어, 영어, 수학 점수를 받아서 총점, 평균을 구한 다음 60이상 Pass, 60이하 Fail 산술연산자만 사용
import java.util.Scanner;

public class 연산자정리 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 영어, 수학 점수를 입력해주세요 ex)80 70 60 : ");
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		int total = kor + eng + math;
		double avg = total / 3.0;
		
		int tmp = (int)avg;
		
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.2f\n", avg);
		System.out.println(tmp >= 60 ? "Pass" : "Fail");
	}

}








