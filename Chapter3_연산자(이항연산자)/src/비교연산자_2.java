import java.util.Scanner;

/*
 *  char 비교 : char는 정수형으로 변경후 비교
 *  ---------------------------------
 *    'A'<'B' true ('A'=65 'B'=66)
 *     1 >'0' false ('0'=48)
 *     모든 문자마다 번호를 가지고있음 (아스키 코드)
 *     
 *     아스키코드 | 스캔코드 (키보드 번호)
 *       8bit     8bit  
 */
public class 비교연산자_2 {

	public static void main(String[] args) {

		char a = 'A'; //65
		char b = 'a'; //97
		
		System.out.printf("%c == %c : %b\n", a, b, a==b);
		System.out.printf("%c == %c : %b\n", a, b, a+32==b);
		// 대소문자의 차이 --> 32
		System.out.printf("%c != %c : %b\n", a, b, a!=b);
		
		int c = 98;
		System.out.printf("%d == %c : %b\n", c, b, c==b); //char는 모든 연산이 있는 경우 정수로 변경이 된다
		// == , != , < , > , <= , >= 비교가능
		// == , != (boolean인 경우 두개만 사용가능)
		
		boolean b1 = true;
		boolean b2 = false;
		
		System.out.printf("%b == %b : %b\n", b1, b2, b1==b2);
		System.out.printf("%b != %b : %b\n", b1, b2, b1!=b2);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요:");
		int k = sc.nextInt();
		System.out.println((k%2 == 0)? "짝수" : "홀수");
	}

}
