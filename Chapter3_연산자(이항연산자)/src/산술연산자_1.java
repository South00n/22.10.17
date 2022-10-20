import java.util.Scanner;

/*
 *  이항연산자 (피연산자 2개인 경우)
 *  ------------------------
 *    = 산술연산자 ( + , - , * , / , % ) 97page
 *      우선순위 : * , / , % --> +,-보다 우선순위 연산이 된다
 *      주의점 : 1) 형변환 (자동 형변환) -> 데이터형이 다른 경우 큰 데이터형으로 변경
 *      		  int + char = int (char가 int로 변경)
 *      		  ** 연산은 같은 데이터형만 가능하다
 *      		  ** int 이하 데이터형은 연산처리시 결과값이 int
 *      		  ex) byte + byte = int
 *      			  char + char = int
 *      
 *			   2) / 나누기 연산
 *				  1) 정수/정수 = 정수 -> 10/3 = 3
 *				  2) 0으로 나누면 오류가 발생한다 --> 오류체크 (예외처리)
 *
 *			   3) % 나누고 나머지 --> (화폐매수구하기, 배수, 달력(요일 구하기), 윤년체크)
 *				  10%3 = 1
 *				  부호 ( - , + ) --> 결과값은 항상 *왼쪽편부호가 남는다
 *				  10%3 = 1
 *				 -10%3 = -1
 *				  10%-3 = 1
 *				 -10%-3 = -1
 *
 *	  = 비트연산자 ( & , | , ^ )
 *
 *	  = 쉬프트 연산자 (비트 이동 연산자) --> <<[왼쪽이동] , >>[오른쪽이동]
 *		10<<3 --> 80 (이동후에 뒤에 3칸을 0으로 채운다)
 *		10*2^3(8) --> 80
 *		X<<Y --> X*2^Y
 *		-----------------------------
 *		1010 = 10
 *		1010000 (3칸이동) = 80
 *
 *		10>>3 --> 1 (뒤에 비트를 3개 제거한다)
 *		10/2^3(8) --> 1
 *				 
 */
import java.util.Scanner;
public class 산술연산자_1 {

	public static void main(String[] args) {
		int a, b;
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 정수를 입력(10 20):");
		a = sc.nextInt(); // 입력된 정수값을 가지고 a라는 메모리에 저장
		b = sc.nextInt();
		//출력
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		//연산처리
		System.out.printf("%d + %d = %d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %.2f\n", a, b, (double)a/b);
		try {
			System.out.printf("%d %% %d = %d\n", a, b, a%b);			
		} catch(Exception e) {
			System.out.println("0으로 나눌 수 없다");
		}
	
	}

}









