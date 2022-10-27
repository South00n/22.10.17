/*
 *   2*1=2 ---- 9*1=9
 *   -
 *   -
 *   -
 *   -
 *	 -
 *	 2*9=18     9*9=81
 *
 *	 줄수 (i) --> 9줄
 *	 한줄에 출력한 갯수 --> 8개
 *	
 */
public class 반복문_중첩for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("구구단 출력");
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.printf("%d*%d=%d\t", j, i, j*i );
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d*%d=%d\n", i, j, i*j );
			}
			System.out.println();
		}
	}

}
