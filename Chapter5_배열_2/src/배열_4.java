/*
 *    배열, 클래스 --> 참조변수 (메모리 주소)
 *    	배열		 실제값
 *    (Stack)	(Heap)
 *    
 *    기본형 --> (메모리 자체)
 *    배열안에 저장된 것은 주소가 저장돼있다
 */
import java.util.Arrays;

public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50};
		//    --- 데이터가 저장된 주소 (주소를 참조한다 -> 참조변수)
		int[] copy = new int[arr.length];
		//    --- 데이터가 저장된 주소 (주소를 참조한다 -> 참조변수)
		System.out.println("arr = " + arr);
		System.out.println("copy = " + copy);
		
		for (int i = 0; i < arr.length; i++) {
			copy[i] = arr[i];
		}
		
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("copy = " + Arrays.toString(copy));
		
		copy[0] = 100;
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("copy = " + Arrays.toString(copy));
		
	}

}
