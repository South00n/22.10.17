import java.util.Scanner;

public class 문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요:");
		
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println(num + "는(은) 양수입니다.");
		} else if (num == 0) {
			System.out.println(num + "는(은) 0입니다.");
		} else {
			System.out.println(num + "는(은) 음수입니다.");
		}
		// 한줄 표현 if ~ else = 삼항연산자
		System.out.println(num > 0 ? num + "는(은) 양수입니다" : num + "는(은) 음수입니다");
		// JSP를 사용할때 편함
	}

}
