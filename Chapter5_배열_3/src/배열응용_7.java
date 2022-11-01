/*
 * 		K  F  I  Z  O
 * 		-  -
 * 		F  K
 * 		-  	  -
 * 		F	  I
 * 		- 		 -	
 * 		F		 Z
 * 		- 			-
 *		F			O
 *		----------------
 *		F  K  I  Z  O
 *		   -  -
 *		   I  K
 *		   -	 -
 *		   I	 Z
 *		   -	  	-
 * 		   I		O
 * 		----------------
 * 		F  I  K  Z  O
 * 			  -	 -
 * 			  K  Z
 * 			  -  	-
 * 			  K     O
 * 		----------------
 * 		F  I  K  Z  O
 * 				 -	-
 * 				 O  Z
 * 		----------------
 * 		F  I  K  O  Z
 */

import java.util.Arrays;

public class 배열응용_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr = new char[10];
		// 초기화
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (char)((Math.random() * 26) + 65);
		}
		System.out.println("정렬 전");
		System.out.println(Arrays.toString(arr));
		
		//정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("정렬 후");
		System.out.println(Arrays.toString(arr));
		
	}

}
