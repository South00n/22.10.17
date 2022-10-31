/*
 * 16. 다음 결과를 출력하는 프로그램
 출력예) 		i	j(공백) k(별표)
       *  	1	3		1      i+j=4 --> j=4-i
      **	2	2		2 
     ***	3	1		3
    ****	4	0		4
    
    ****	1	0		4	   j+1=i --/ j=i-1 k=5-i
     ***	2	1		3
      **	3	2		2
       *	4	3		1
       
       *	1	3		1
      ***	2	2		3
     *****	3	1		5
    *******	4	0		7
 */
public class 문제16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4-i; j++) {
				System.out.print(" ");				
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();

		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i-1; j++) {
				System.out.print(" ");				
			}
			for (int k = 1; k <= 5-i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 4-i; j++) {
				System.out.print(" ");				
			}
			for (int k = 1; k <= i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
}