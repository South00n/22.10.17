/*
 * 	  int[] arr = new int[10];
 * 
 * 	  for (int i = 0; i < 10; i++) {
 * 
 * 	  }
 * 	  (X) ---> 수정하기 어렵다
 * 
 * 	  --> 배열의 갯수를 읽어 온다 : length
 * 	  --> arr.length
 */
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		System.out.println("배열의 갯수 : " + arr.length);
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
