// 1~10까지 짝수 출력
public class 제어문_반복문2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		//시작점, 끝나는지점 잘 정해라
		for(int i = 2; i <= 10; i += 2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i = 5; i <= 100; i += 5) {
			System.out.print(i + " ");
		}
	}

}
