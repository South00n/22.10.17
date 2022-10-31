//9. 0~12까지 2의 배수, 3의 배수의 합을 구하여라.
public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		for(int i=0; i<=12; i++) {
			if(i%2 == 0) {
				sum += i;
			}
			if(i%3 == 0) {
				sum+= i;
			}
		}
		System.out.println("0~12까지 2의 배수, 3의 배수의 합:" + sum);
		//공배수는 고려하지않았음
		sum = 0;
		
		for(int i=0; i<=12; i++) {
			if(i%2 == 0) {
				sum += i;
			} else if(i%3 == 0) {
				sum+= i;
			}
		}
		System.out.println("0~12까지 2의 배수, 3의 배수의 합:" + sum);
		//공배수 중첩 제외한거
		
		
		sum = 0;
		int i = 0;
		while(i<=12) {
			if(i%2 == 0) {
				sum += i;
			}
			if(i%3 == 0) {
				sum += i;
			}
			i++;
		}
		System.out.println("0~12까지 2의 배수, 3의 배수의 합:" + sum);
	}

}
