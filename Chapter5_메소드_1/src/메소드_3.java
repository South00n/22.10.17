// 사칙연산
import java.util.Scanner;

public class 메소드_3 {
	// + --> 리턴형(int)  매개변수(정수 2개)
	static int add (int a, int b) {
		return a + b;
	}
	// -
	static int minus (int a, int b) {
		return a - b;
	}
	// *
	static int gop (int a, int b) {
		return a * b;
	}
	// /
	static int div (int a, int b) {
		return a / b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int a = sc.nextInt();
		System.out.print("두번째 정수 입력:");
		int b = sc.nextInt();
		
		// 연산자
		System.out.print("연산자 입력(+, -, *, /):");
		String op = sc.next();
		
		int result = 0;
		switch (op) {
		case "+":
			result = add(a,b);
			break;
		case "-":
			result = minus(a,b);
			break;
		case "*":
			result = gop(a,b);
			break;
		case "/":
			result = div(a,b);
			break;
		}
		System.out.println("result :" + result);
	}

}
