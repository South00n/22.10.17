import java.util.Arrays;
/*
 *    int[] arr = {};
 *    int[] copy = arr; --> 주소를 받아서 참조 // arr, copy 같은 주소를 제어
 *    
 *    int a = 10;
 *    int b = a; --> 값을 받아서 저장 // a, b는 다른 메모리
 */
public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		int[] copy = arr; // Call By Reference (주소에 의한 참조)
		// Call By Value ==> 기본형
		System.out.println("arr = " + arr);
		System.out.println("copy = " + copy);
		// 주소 ==> 주소 (같은 메모리를 제어)
		// 참조형 변수는 주소값을 저장
		/*
		 * 	 int a = 10;
		 * 	 int b = a;
		 */
		
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("copy = " + Arrays.toString(copy));
		
		copy[0] = 100;
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("copy = " + Arrays.toString(copy));
	}

}
