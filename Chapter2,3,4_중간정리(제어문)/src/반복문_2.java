
public class 반복문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = (int)(Math.random() * 101); // 0 ~ 100
		int num2 = num; // 0 ~ 100
		System.out.println("num = " + num);
		System.out.println(Integer.toBinaryString(num));
		
		String result = "";
		System.out.println("===== for이용한 2진법 출력 =====");
		for (;;) { // 횟수를 모른다
			
			// 2로 나누고 나머지 저장
			int a = num % 2;
			result += a;
			// 2로 나눈다
			num = num / 2;
			// 0인지 여부 확인 ==> break;
			if (num == 0) {
				break;
			}
		}
		
		for (int i = result.length() - 1; i >= 0; i--) {
			System.out.print(result.charAt(i));
		}
		System.out.println();
		System.out.println("====== while문을 이용한 2진법 출력 ======");
		result = "";
		while (true) {
			int a = num2 % 2;
			result += a;
			num2 = num2 / 2;
			if (num2 == 0) {
				break;
			}
		}
		for (int i = result.length() - 1; i >= 0; i--) {
			System.out.print(result.charAt(i));
		}
		
		
	}

}
