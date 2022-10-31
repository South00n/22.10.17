// 7. 5~16까지의 합을 구하시오
public class 문제7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=5; i<=16; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//while문
		sum = 0;
		int i = 5;
		while(i<=16) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
