// 11) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
// for(int i=1; i<=n; i++) --> 누적

import java.util.Scanner;

public class 문제11 {
	
	//갈색 = 지역변수, 파랑색 == 멤버변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.printf("1~%d까지의 합:%d\n", num, sum);
		
		System.out.println("=======================");
		int n = (int)(Math.random() * 100) + 1;
		int sum2 = 0;
		System.out.println("범위:" + n);
	
		for(int i=1; i<=n; i++) {
			sum2 += i;
		}
		System.out.printf("1~%d까지의 합:%d\n", n, sum2);
		
		
		
	}

}
