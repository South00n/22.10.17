
public class 문제12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=2; i<=30; i+=2) {
			System.out.print(i + " ");
			if(i%6 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		
		for(int i=1; i<=30; i++) {
			if(i%2==0) {
				System.out.print(i + " ");
				if(i%3==0) {
					System.out.println();
				}
			}
		}
			
		
		
	}

}
