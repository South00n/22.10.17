/*
 * 	비트이동 연산자 (왼쪽, 오른쪽)
 * 				 << , >>
 * 
 * 	10<<3 --> 1010(000)추가 --> 1010000 --> 80
 *  ----- 10*2^3
 *  
 *  10>>3 --> 1(010)삭제 --> 1
 *  
 *  39<<2 --> 100111(00)추가 --> 156
 *  39>>2 --> 1001(11)삭제 --> 9
 */
public class 비트이동연산자 {

	public static void main(String[] args) {
		
		System.out.println(10<<3);
		System.out.println(10>>3);
		System.out.println(39<<2);
		System.out.println(39>>2);
	}

}
