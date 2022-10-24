import java.util.Scanner;

public class 문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요:");
		int num = sc.nextInt();
		
		if(num >= 50) {
			System.out.println(num + "은(는) 50이상입니다.");
		} else {
			System.out.println(num + "은(는) 50미만입니다.");
		}
	}

}
