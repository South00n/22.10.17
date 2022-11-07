import java.util.Arrays;

/*
3. 임의의 정수를 배열로 생성해서 입력하고 정렬하는 프로그램 작성 
- 임의의 정수 입력 (배열 생성후)
- 정렬 처리
- 출력 
 */

public class 문제3 {
	// ASC (올림차순)
	static int[] asc_sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	// DESC(내림차순)
	static int[] desc_sort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	// 혼합
	static int[] sort(int[] arr, String type) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (type.equals("ASC")) {
					if (arr[i] > arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				} else {
					if (arr[i] < arr[j]) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;					
				}
			}
		}
		
	}
		return arr;
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[5];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random() * 100) + 1;
		}
		System.out.println("정렬 전:");
		System.out.println(Arrays.toString(num));
		
		System.out.println("올림 차순:");
		//int[] num1 = asc_sort(num);
		int[] num1 = sort(num, "ASC");
		System.out.println(Arrays.toString(num1));

		System.out.println("내림 차순:");
		//int[] num2 = desc_sort(num);
		int[] num2 = sort(num, "DESC");
		System.out.println(Arrays.toString(num2));
	}

}
