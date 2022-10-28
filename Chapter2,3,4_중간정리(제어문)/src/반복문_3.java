
public class 반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A ~ Z ==> for, while
		char c = 'A';
		
		System.out.println("==== for문 ====");
		for(c = 'A'; c <= 'Z'; c++) {
			System.out.print(c + " ");
		}
		System.out.println();
		
		c = 'A'; // 초기화필요
		while (c <= 'Z') {
			System.out.print(c + " ");
			c++;
		}
		
		System.out.println();
		System.out.println("==== do ~ while ====");
		
		do {
			c--;
			System.out.print(c + " ");
		} while (c > 'A');
	}

}
