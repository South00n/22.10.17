// 문자열을 입력받아서 좌우 대칭인지 확인하는 메소드를 구현하시오
import java.util.Scanner;

public class 문제6 {
	static boolean method(String s) {
		String temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char c = s.charAt(i);
			temp += c;
		}
		if (temp.equals(s)) {
			return true;
		} else {
			return false;
		}
	} // 내가 짠거..
	
	static boolean method2(String s) {
		boolean bCheck = true;
		for (int i = 0; i < s.length() / 2; i++) {
			int last = s.length() - 1 - i;
			if (s.charAt(i) != s.charAt(last)) {
				bCheck = false;
				break;
			}
		} 
		return bCheck;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "";
		
		// 이 구간이 중요함 문자가 홀수면 오류처리
		while (true) {
			System.out.print("문자열 입력:");
			s = sc.next();
			if (s.length() % 2 != 0) {
				System.out.println("잘못된 입력입니다");
				continue;
			}
			break;
		}
		boolean bCheck = method2(s);
		if (bCheck == true) {
			System.out.println("좌우 대칭입니다");
		} else {
			System.out.println("좌우 대칭이 아닙니다");
		}
		
	}

}
