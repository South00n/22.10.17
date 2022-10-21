/*
 * 구현 내용
 * 국어(정수), 영어(정수), 수학(정수), 총점(정수), 평균(실수) 변수 선언하고,
 * 각 점수를 키보드로 입력받고, 합계(국어+영어+수학)와 평균(합계/3.0)을 계산하고,
 * 세 과목의 점수와 평균을 가지고 합격 여부 처리함 
 * <합격의 조건 > 
 * 세 과목의 점수가 각각 40점이상이면서,평균이 60점 이상이면 합격, 아니면 불합격 처리함
 */
import java.util.Scanner;

public class 문제16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 영어, 수학점수를 입력하세요 ex)70 60 50 : ");
		
		int kor, eng, math, total;
		double avg;
		
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		total = kor + eng + math;
		avg = total / 3.0;
		
		System.out.printf("국어 = %d점 영어 = %d점, 수학 = %d점, 합 = %d점 평균 = %.2f점 \n", kor, eng, math, total, avg);
		System.out.println((kor >= 40 && eng >= 40 && math >= 40) && (avg >= 60)? "합격" : "불합격");
	}

}
