/*
7. 정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라.
그리고 배열에 든 숫자들과 평균을 출력하라.
예) 랜덤한 정수들 : 3 6 3 6 1 3 8 9 6 9 
평균은 5.4
[Hint] 1에서 10까지 범위의 정수를 랜덤하게 생성할 때는 다음 코드를 이용하라
int i  = (int)(Math.random()*10)+1;
 */
import java.util.Arrays;

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			sum += arr[i];
			//System.out.print(arr[i] + " ");
		}
		System.out.println("랜덤한 정수들 : " + Arrays.toString(arr));
		System.out.println("평균은 : " + sum / (double)arr.length);
		
	}

}
