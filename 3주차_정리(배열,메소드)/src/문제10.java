// 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.

public class 문제10 {

	static void max(int a, int b) {
		
		if (a > b) {
			System.out.println(a);
		} else {
			System.out.println(b);
		} 
		System.out.println(Math.max(a, b));
		System.out.println(a > b ? a : b);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		max(5, 5);
	}

}
