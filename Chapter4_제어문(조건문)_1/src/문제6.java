import java.util.Scanner;

public class 문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int i = (int)(Math.random() * 2);
		int no = (int)(Math.random() * 26) + 65;
		char c2 = ' ';
		
		if(i == 0) {
			c2 = (char)no; //대문자
		} else {
			c2 = (char)(no + 32); //소문자
		}
		
		System.out.println("c2=" +c2);
		
		if('a' <= c2 && c2 <= 'z') {
			System.out.println(c2 + "는(은) 소문자입니다.");
		} else {
			System.out.println(c2 + "는(은) 대문자입니다.");
		}
		
		System.out.print("문자를 입력해주세요:");
		char c = sc.next().charAt(0);
		
		if('a' <= c && c <= 'z') {
			System.out.println(c + "는(은) 소문자입니다.");
		} else if ('A' <= c && c <= 'Z') {
			System.out.println(c + "는(은) 대문자입니다.");
		}
	}

}
