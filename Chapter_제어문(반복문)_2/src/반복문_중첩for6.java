/*
 *   aBCDE
 *   AbCDE
 *   ABcDE
 *   ABCdE
 *   ABCDe
 *   -----------
 *   
 *   주사위 두개를 던져서
 *   합 --> 5가 나오는 경우의 수 출력
 */
import java.util.Scanner;

public class 반복문_중첩for6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	for(int i = 1; i <= 5; i++) {
			char c = 'A';
			for(int j = 1; j <= 5; j++) {
				if (i == j) {
					System.out.print((char)(c + 32));
				} else {
					System.out.print(c);
				}
				c++;
			}
			System.out.println();
		} */
		Scanner sc = new Scanner(System.in);
		System.out.print("2~12사이의 정수를 입력:");
		int num = sc.nextInt();
		
		for (int i = 1; i <= 6; i++) { // 첫번째 주사위
			for (int j = 1; j <= 6; j++) { // 두번째 주사위
				if (i + j == num) {
					System.out.printf("[%d,%d]\n", i, j);
				}
			}
		}
		
	}

}
