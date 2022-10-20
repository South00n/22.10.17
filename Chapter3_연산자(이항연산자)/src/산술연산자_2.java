/*
 *  산술연산자 -> 산술변환
 *  		   연산은 무조건 같은 데이터형이여야 연산처리가 된다
 *  		   다른 데이터형이 연산되면 -> 큰데이터형으로 변경후 연산처리를 한다 (자동 형변환)
 *  								작은 데이터형으로 변경후 연산처리 (강제 형변환)
 */
public class 산술연산자_2 {

	public static void main(String[] args) {
		int c = 'A' + 'B';
		System.out.println(c);
		
		byte b1 = 10;
		byte b2 = 20;
		byte b3 = (byte) (b1 + b2); //오버플로우 발생 가능성
		int b4 = (b1 + b2);
		
		char c1 = 'A';
		int d = 100;
		int k = c1 + d;
		System.out.println(k);
		
	}

}
