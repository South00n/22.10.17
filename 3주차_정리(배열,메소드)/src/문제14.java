// 메소드를 정의하여 입력받은 숫자를 거꾸로 뒤집은 수를 출력하는 프로그램을 작성하세요
/*
 *    메소드 : 매개변수, 리턴형 // 두개를 확실히 잡아보자
 *    		 ------	----- 처리 결과값 (출력 = void)
 *    		사용자로부터 받는값
 */
import java.util.Scanner;

public class 문제14 {
	
	// 숫자를 문자열로 바꿔서 처리
	static void reverse(int a) {
		String s = String.valueOf(a);
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		reverse(num);
	}

}
