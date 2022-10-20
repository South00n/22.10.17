/*
 *   정수 1개를 입력받아서 +5한 값을 저장후에 출력
 */

import java.util.Scanner;

public class 대입연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		//num = num + 5;
		num += 5;
		System.out.println("num : " + num);
		
		// num값을 -5한 값을 저장후에 출력
		// num = num - 5;
		num -= 5;
		System.out.println("num : " + num);
		
		// num값을 *5한 후에 저장후에 출력
		num *= 5;
		System.out.println("num : " + num);
		
		// num값을 /5한 후에 저장후에 출력
		num /= 5;
		System.out.println("num : " + num);
		
		num &= 5;
		System.out.println("num : " + num);		
		
	}

}
