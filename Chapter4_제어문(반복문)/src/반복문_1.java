// 1~100 까지의 합을 구해라
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== for문 ===");
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		System.out.println("=== while문 ===");
		sum = 0;
		int i = 1;
		while(i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		System.out.println("=== do~while문 ===");
		sum = 0;
		i = 1;
		do {
			sum += i;
			i++;
		} while(i<=100);
		System.out.println(sum);
	}

}
