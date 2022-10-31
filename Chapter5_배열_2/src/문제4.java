/*
 4. 양의 정수 10개 입력받아 배열에 저장하고, 
 배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
 */
import java.util.Arrays;
import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 10개 저장하는 공간
		int[] arr = new int[10];
		Scanner sc = new Scanner(System.in);
		// 초기화
		for (int i = 0; i < arr.length; i++) {
			System.out.print("양의 정수를 입력해주세요:");
			arr[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		
		for (int i = 0; i < arr.length; i++) { // 인덱스를 이용해서 값을 얻어 온다
			if (arr[i] % 3 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		/*
		for (int i : arr) { --> 실제 저장된 값을 얻어 온다
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		*/
	}

}
