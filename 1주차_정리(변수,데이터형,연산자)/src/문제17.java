/*
 * 구현 내용 
 * 정수 변수 선언
 * 키보드로부터 정수 하나 입력 받음 
 * 양수가 아니면 "양수가 아니다." 출력
 */
import java.util.Scanner;

public class 문제17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		
		int num;
		num = sc.nextInt();
		
		System.out.println(num >= 0 ? "양수입니다" : "양수가아닙니다");
	}

}
