import java.util.Scanner;

/*
 * 6. 사용자로부터 두개의 정수(시작,끝)를 입력받아 시작(포함)해서 
   끝(포함)까지의 곱을 출력하는 프로그램을 작성하시오.
 */
public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두개의 정수를 입력해주세요(시작 끝):");
		long gop = 1;

		int start = sc.nextInt();
		int end = sc.nextInt();
		
		for(int i=start; i<=end; i++) {
			gop *= i;
		}
		System.out.println(gop);
		
		//while문
		gop = 1;
		int i = start;
		while(i<=end) {
			gop *= i;
			i++;
		}
		System.out.println(gop);
		
		
	}

}
