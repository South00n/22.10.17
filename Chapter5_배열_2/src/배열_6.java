import java.util.Arrays;
/*
 * 	  System.arraycopy() : 배열의 크기가 다른 경우 (원하는 위치에 데이터 배치)
 * 	  arr.clone() : 있는 그대로
 * 
 */
public class 배열_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = {'A', 'B', 'C', 'D', 'E'};
		char[] copy = new char[arr.length];
		char[] copy2 = new char[arr.length];
		// 값을 복사 ==> 출력 arr / copy가 같은지
		copy2 = arr.clone();
		System.arraycopy(arr, 0, copy, 0, arr.length);
				
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("copy = " + Arrays.toString(copy));		
		System.out.println("copy = " + Arrays.toString(copy2));
		
		copy[0] = 'K';
		System.out.println("arr = " + Arrays.toString(arr));
		System.out.println("copy = " + Arrays.toString(copy));		
		System.out.println("copy = " + Arrays.toString(copy2));
		
	}

}
