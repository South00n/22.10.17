/*
 *   AAAAA
 *   BBBBB
 *   CCCCC
 *   DDDDD
 *   EEEEE 를 출력
 *   ----------- 세로 1~5
 *   			 가로 5개
 *   @
 *   for (int i = 1; i <= 5; i++) {
 *   	@
 *   	for (int j = 1; j <= 5; j++ {
 *   		@	
 *   	}
 *   } 
 */
public class 반복문_중첩for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c = 'A';
		for (int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print(c);
			}
			c++;
			System.out.println();
		}
	}

}
