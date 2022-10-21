/*
 * 두 개의 정수를 입력 받아서 
 * 첫째 수를 둘째 수로 나눈 나머지를 출력하는 프로그램을 작성해 보자.
 */
import java.util.Scanner;

public class 문제14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("두 개의 정수를 입력 해주세요 ex)8 6 : ");
		
		int num1, num2;
		
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		int result = num1 % num2;
		
		System.out.printf("%d %% %d = %d 입니다", num1, num2, result);
	}

}
