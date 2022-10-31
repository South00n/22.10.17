import java.util.Scanner;

/*
 * 	12. 10개의 정수를 입력받아 
 *  3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램
 */
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count3 = 0;
		int count5 = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.print(i + "번째 정수를 입력해주세요:");
			int num = sc.nextInt();
			
			if(num%3 == 0) {
				count3++;
			}
			if(num%5 == 0) {
				count5++;
			}
		}
		System.out.println("3의 배수는 " + count3 + "개 입니다.");
		System.out.println("5의 배수는 " + count5 + "개 입니다.");
		
		//while문
		count3 = 0;
		count5 = 0;
		int i = 1;
		while(i<=10) {
			System.out.print(i + "번째 정수를 입력해주세요:");
			int num = sc.nextInt();
			
			if(num%3 == 0) {
				count3++;
			}
			if(num%5 == 0) {
				count5++;
			}
			i++;
		}
		System.out.println("3의 배수는 " + count3 + "개 입니다.");
		System.out.println("5의 배수는 " + count5 + "개 입니다.");		
	}
	
}
