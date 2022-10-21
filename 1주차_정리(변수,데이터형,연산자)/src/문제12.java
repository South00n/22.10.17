//사용자로부터 두 개의 정수를 입력 받아서 뺄셈과 곱셈 연산의 결과를 출력하는 프로그램을 작성

import java.util.Scanner;

public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	    System.out.print("두 개의 정수를 입력하세요 ex(12 3)：");
	    int num1, num2;
	    num1 = sc.nextInt();
	    num2 = sc.nextInt();

	    System.out.println("입력한 두 수의 차는 " + (num1 - num2) + "입니다");
	    System.out.println("입력한 두 수의 곱은 " + (num1 * num2) + "입니다");
	}

}
