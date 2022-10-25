/*
 *   90 ~ 100 A
 *   80 ~ 89 B
 *   70 ~ 79 C
 *   60 ~ 69 D
 *      ~ 59 F
 *      
 *   함수/메소드 차이점
 *   라이브러리 / 프레임워크 (open source)
 *    완제품 		레고(내 마음대로 고쳐쓸수있음)
 */
import java.util.Scanner;
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 세개의 정수를 입력 (국어, 영어, 수학)
		Scanner sc = new Scanner(System.in);
		System.out.print("국어, 영어, 수학 점수 입력(80 90 90): ");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		//총점
		int total = kor + eng + math;
		//평균
		double avg = total / 3.0;
		
		//학점
		char score = ' ';
		switch((int)(avg/10)) { //switch(문자, 문자열 정수)
			//if(avg == 10 || avg == 9)
			case 10:
			case 9:
				score = 'A';
				break;
			case 8:
				score = 'B';
				break;
			case 7:
				score = 'C';
				break;
			case 6:
				score = 'D';
				break;
			default :
				score = 'F';
				break;
		}
		
		System.out.println("국어 점수 :" + kor);
		System.out.println("영어 점수 :" + eng);
		System.out.println("수학 점수 :" + math);
		System.out.println("총점 :" + total);
		System.out.printf("평균 :%.2f\n" , avg);
		System.out.println("학점 :" + score);
		
	}

}
