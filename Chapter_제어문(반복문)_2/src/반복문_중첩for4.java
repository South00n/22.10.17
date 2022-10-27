/*
 *   ★
 *   ★★
 *   ★★★
 *   ★★★★
 *   
 *   ★★★★  i = 1, j = 4
 *   ★★★	i = 2, j = 3
 *   ★★
 *   ★
 *   
 *   A
 *   BC
 *   DEF
 *   GHIJ
 *   
 *   A
 *   AB
 *   ABC
 *   ABCD
 *   
 */
import java.util.Scanner;
public class 반복문_중첩for4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.printf("★");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= (n+1) - i; j++) {
				System.out.printf("★");
			}
			System.out.println();
		}
		System.out.println();
		
		char c = 'A';
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 1; i <= 4; i++) {
			c = 'A';
			for(int j = 1; j <= i; j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
		System.out.println();
		// 1. 변수위치를 잘 잡아라
		// 정렬, 빈도 구하기, 통계, 순위 결정 -> 2중for문 나옴
		
	}

}
