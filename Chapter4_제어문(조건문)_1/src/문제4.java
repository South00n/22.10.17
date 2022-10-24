import java.util.Scanner;

public class 문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("세 개의 정수를 입력해주세요 (ex 50 70 90):");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		int max = num1;
		int min = num1;
		
		if(max < num2) {
			max = num2;
		}
		if(max < num3) {
			max = num3;
		}
		
		if(min > num2) {
			min = num2;
		}
		if(min > num3) {
			min = num3;
		}
		int total = num1 + num2 + num3;
		double avg = total / 3.0;
		
		System.out.println("최대값:" + max);
		System.out.println("최소값:" + min);
		System.out.println("합은 " + total +"입니다");
		System.out.printf("평균은 %.2f입니다\n", avg);
		
	}

}
