import java.util.Scanner;

// 년도를 입력을 받아서 윤년 여부 확인
/*
 *   윤년의 조건 (로마시대)
 *     1) 4년마다 (year % 4 == 0)
 *     2) 100년마다 제외 (year % 100 != 0)
 *     3) 400년마다 (year % 400 == 0)
 */
public class 삼항연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도를 입력해주세요:");
		int year = sc.nextInt();
		
		// 결과값 출력
		System.out.println((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? year + "년도는 윤년입니다" : year + "년도는 윤년이 아닙니다");
		
		
	}

}
