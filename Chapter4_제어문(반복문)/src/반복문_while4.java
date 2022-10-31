import java.util.Scanner;

//사용자가 정수 10개 입력 -> 입력값을 누적해서 출력
public class 반복문_while4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		for(int i=1; i<=10; i++) {
			System.out.print(i+ "번째 정수 입력:");
			int num = sc.nextInt();
			sum += num;
		}
		System.out.println("sum=" + sum);
		
		int i=1;
		sum = 0;
		while(i<=10) {
			System.out.print(i+ "번째 정수 입력:");
			int num = sc.nextInt();
			sum += num;
			i++;
		}
		System.out.println("sum=" + sum);		
	}

}
