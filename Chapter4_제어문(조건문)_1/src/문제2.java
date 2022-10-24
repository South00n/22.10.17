import java.util.Scanner;

public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요:");
		
		int num = sc.nextInt();
		int num2 = (int)(Math.random()* 100) + 1;
		
		if(num % 3 == 0) {
			System.out.println(num + "은(는) 3의 배수입니다.");
		} else {
			System.out.println(num + "은(는) 3의 배수가 아닙니다.");
		}
		
		if(num2 % 3 == 0) {
			System.out.println(num2 + "은(는) 3의 배수입니다.");
		} else {
			System.out.println(num2 + "은(는) 3의 배수가 아닙니다.");
		}
	}

}
