// 입력 받은 값이 짝수인지 홀수인지 판별하는 메소드를 구현하시오

public class 문제11 {

	static boolean check(int a) {
		if (a % 2 == 0 ) {
			return true;
		} else {
			return false;
		}
	}
	
	static String method(int a) {
		if (a % 2 == 0) {
			return "짝수입니다";
		} else {
			return "홀수입니다";
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (check(10)) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다");
		}
		
		System.out.println(method(11));
	}

}
