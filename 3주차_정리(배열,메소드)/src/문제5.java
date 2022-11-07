import java.util.Scanner;

//문자열의 소문자를 대문자로 바꾸는 메소드를 구현하시오

public class 문제5 {
	
	static String change(String alpha) {
		/*
		 *   Stirng s = "";
		 *   for (int i = 0; i < alpha.length(); i++) {
		 *   	char a = alpha.charAt(i);
		 *   	a = (char)(a-32);
		 *   	s += a;
		 *   }
		 *   return s;
		 */
		return alpha.toUpperCase();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳 입력:");
		String alpha = sc.next();
		String s = change(alpha);
		System.out.println(s);
	}

}
