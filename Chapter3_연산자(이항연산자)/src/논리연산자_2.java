/*
 *   if / for
 *   -- (조건 잘 잡는게 중요)
 *   
 *   1) 구구단 --> 2차 for문
 *   2) 페이지 나누기 --> 1차 for문 + 조건문 &&
 *   
 *   난수 발생 --> 1 ~ 100 (50이상)
 *   알파벳   --> (K보다 작은지)
 *    
 */
public class 논리연산자_2 {

	public static void main(String[] args) {
		
		int a = (int)(Math.random()*100) + 1;
		char b = (char)((Math.random()*26) + 65);
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		boolean result = a>50 && b<'K';
		System.out.println(result);
		
		boolean result2 = a>50 || b<'K';
		System.out.println(result2);
		
	}

}
