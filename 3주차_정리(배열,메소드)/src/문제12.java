// 3의 배수를 판별하는 메소드를 구현하시오
public class 문제12 {
	
	static boolean check(int a) {
		if (a % 3 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	static void method(int a) {
		if (a % 3 == 0) {
			System.out.println("3의 배수입니다");
		} else {
			System.out.println("3의 배수가 아닙니다");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (check(7)) {
			System.out.println("3의 배수입니다");
		} else {
			System.out.println("3의 배수가 아닙니다");
		}
		
		method(6);
	}

}
