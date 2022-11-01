import java.util.Arrays;

// 1 ~ 100 사이의 정수를 10개 저장 --> 최대값, 최소값을 구하고 차를 출력
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100) + 1;
		}
		// 출력
		System.out.println(Arrays.toString(arr));
		// 최대값, 최소값
		// 최대값 -> 가장 낮은 값
		int max = 1; // arr[0]이 기본
		// 최소값 -> 가장 큰값
		int min = 100; // arr[0]
		/*
		 *   a = 1, b = 2, c = 3, d = 4, e = 5
		 *   max = 1;
		 *   if (max < a)
		 *   	max = a;
		 *   if (max < b)
		 *   	max = b;
		 *       ...
		 */
		for (int i : arr) {
			if (max < i) {
				max = i;
			} else if (min > i) {
				min = i;
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("최대값과 최소값의 차 : " + (max - min));
		
		// 최대값 최소값의 인덱스번호
		int index1 = 0;
		int index2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max) {
				index1 = i;
				break;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == min) {				
				index2 = i;
				break;
			}
		}
		System.out.println("최대값의 인덱스번호는 " + index1 + "입니다");
		System.out.println("최소값의 인덱스번호는 " + index2 + "입니다");
	}

}
