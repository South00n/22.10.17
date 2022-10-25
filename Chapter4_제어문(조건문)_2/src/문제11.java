import java.util.Scanner;

public class 문제11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력:");
		int num = sc.nextInt();
		int sum = 0;
		for(int i=1; i<=num; i++) {
			sum += i;
		}
		System.out.printf("1~%d까지의 합:%d\n", num, sum);
	}

}
