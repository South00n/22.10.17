// 10) B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
public class 문제10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=66; i<=78; i+=2) {
			System.out.print((char)i + "    ");
		}
		
		System.out.println();
		
		for(char c='B'; c<='N'; c+=2) {
			System.out.print(c + "    ");
		}
	}

}
