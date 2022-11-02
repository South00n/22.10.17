import java.util.Arrays;

/*
7. 임의의 문자 5개를 저장하고 정렬해서 출력하시오 
    A C D H J
     A C D H J
     J H D C A
 */
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] alpha = new char[5];
		
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = (char)((Math.random() * 26) + 65);
		}
		System.out.println("========선택정렬=======");
		System.out.println("정렬 전 :");
		System.out.println(Arrays.toString(alpha));
		
		// 선택정렬
		
		for (int i = 0; i < alpha.length - 1; i++) {
			for (int j = i + 1; j < alpha.length; j++) {
				if (alpha[i] > alpha[j]) {
					char temp = alpha[i];
					alpha[i] = alpha[j];
					alpha[j] = temp;
				}
			}
		}
		System.out.println("정렬 후 :");
		System.out.println(Arrays.toString(alpha));
		
		
		for (int i = 0; i < alpha.length; i++) {
			alpha[i] = (char)((Math.random() * 26) + 65);
		}
		System.out.println("========버블정렬=======");
		System.out.println("정렬 전 :");
		System.out.println(Arrays.toString(alpha));
		
		// 버블정렬
		
		for (int i = 0; i < alpha.length - 1; i++) {
			for (int j = 0; j < alpha.length - 1 - i; j++) {
				if (alpha[j] > alpha[j+1]) {
					char temp = alpha[j];
					alpha[j] = alpha[j+1];
					alpha[j+1] = temp;
				}
			}
		}
		System.out.println("정렬 후 :");
		System.out.println(Arrays.toString(alpha));
		
	}

}
