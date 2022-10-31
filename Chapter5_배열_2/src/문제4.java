/*
 4. 양의 정수 10개 입력받아 배열에 저장하고, 
 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
 */
import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("양의 정수를 입력해주세요:");
			arr[i] = sc.nextInt();
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
	}

}
