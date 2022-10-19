/*
 *  형변환연산자 : (type)
 *  		   ------ 데이터형
 *  		   (int), (double), (char)...
 *  
 *  		   크기
 *  		   byte < char < int < long < double
 *  		   --------------------------------- boolean은 형변환 할 수 없다.
 *  		   1) 실수 --> 정수로 변환
 *  			  (int)10.5 --> 10
 *  		   2) 정수 --> 문자로 변환
 *  			  (char)65 --> 'A'
 *  		   3) 정수 --> 실수로 변환
 *  			  (double)10 --> 10.0
 *  		   4) 10.5 + 10.5 --> 21.0
 *  			  (int)10.5 + (int)10.5 --> 20
 *  			  (int)(10.5 + 10.5) --> 21
 */
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// 변수 선언
		int a;
	
		// 난수
		a = (int)(Math.random()*100) + 1;
		System.out.println(a);
		
		char c;
		c = (char)((Math.random() * 25) + 65);
		System.out.println(c);
		
		char d = 'A';
		char d1 = (char)(d+32);
		System.out.println(d1);
		
		//자동 형변환
		int i = 'A';
		System.out.println(i);
		long l = 100;
		System.out.println(l);
		
		int m = 10;
		int n = 3;
		System.out.printf("%.2f\n",(double)m/n);
		
		// 음수/양수
		int k = 10;
		System.out.println(-k);
		
	}

}
