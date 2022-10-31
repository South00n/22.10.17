import java.util.Scanner;

//11. 10개의 정수를 입력받아
//그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성
public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.print(i + "번째 정수를 입력해주세요:");
			int num = sc.nextInt();
			if(num%2 == 0) {
				count++;
			}
		}
		System.out.println("짝수의 개수는 총 " + count + "개 입니다");
		
		//while문
		count = 0;
		int i = 1;
		while(i<=10) {
			System.out.print(i + "번째 정수를 입력해주세요:");
			int num = sc.nextInt();
			if(num%2 == 0) {
				count++;
			}
			i++;
		}
		System.out.println("짝수의 개수는 총 " + count + "개 입니다");
		
	}

}
