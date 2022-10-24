import java.util.Scanner;

public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어, 영어, 수학 입력 (ex 80 90 45):");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		int total = kor + eng + math;
		int avg = total / 3;
		char grade = ' ';
		char opt = ' ';
		
		if(avg >= 90 ) {
			grade = 'A';
			if(avg >= 97){
				opt = '+';
			} else if(avg >= 94) {
				opt = '0';
			} else {
				opt = '-';
			}
		} else if(avg >= 80 ) {
			grade = 'B';
			if(avg >= 87){
				opt = '+';
			} else if(avg >= 84) {
				opt = '0';
			} else {
				opt = '-';
			}  
		} else if(avg >= 70 ) {
			grade = 'C';
			if(avg >= 77){
				opt = '+';
			} else if(avg >= 74) {
				opt = '0';
			} else {
				opt = '-';
			}
	    } else if(avg >= 60 ) {
			grade = 'D';
			if(avg >= 67){
				opt = '+';
			} else if(avg >= 64) {
				opt = '0';
			} else {
				opt = '-';
			}
	    } else {
	    	grade = 'F';
	    }
		
		System.out.println("총점은 " + total + "입니다.");
		System.out.println("평균은 " + avg + "입니다.");
		System.out.println("학점은 " + grade + opt + "입니다.");
		
		
	}
}

