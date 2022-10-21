/*
 *   문자 한개를 설정하고 알파벳 -> 대문자, 소문자, 알파벳이 아닌지 확인
 */
import java.util.Scanner;
public class 조건문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char c = '홍';
		Scanner sc = new Scanner(System.in);
		System.out.print("문자 하나를 입력해주세요 :");
		
		char c = sc.next().charAt(0);
		
		//단일 if문 else는 나중에
		if('A' <= c && c <= 'Z') {
			System.out.println(c + "는(은) 대문자입니다");
		}
		
		if('a' <= c && c <= 'z') {
			System.out.println(c + "는(은) 소문자입니다");
		}
		
		if(!('A' <= c && c<= 'Z' || 'a' <= c && c<= 'z')) {
			System.out.println(c + "는(은) 알파벳이 아닙니다");			
		}
		
	
	}

}
