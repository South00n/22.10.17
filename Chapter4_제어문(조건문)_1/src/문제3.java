import java.util.Scanner;

public class 문제3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("학년을 입력해주세요:");
		int grade = sc.nextInt();
		
		System.out.print("점수를 입력해주세요(0~100):");
		int score = sc.nextInt();
		
		if(score < 0 || score >100) { // 이거보단 if(0<=score && score <=100)으로 조건
			System.out.println(score + "은(는) 0미만 or 100초과입니다");
		} else {
			if(grade == 4) { 
				if(score >= 70) {
					System.out.println("합격입니다. " + grade +"학년");
				} else {
					System.out.println("불합격입니다" + grade +"학년");
				}
			} else {
				if(score >= 60) {
					System.out.println("합격입니다." + grade +"학년");
				} else {
					System.out.println("불합격입니다" + grade +"학년");
				}
			}	
		}
		
		
	}
}
