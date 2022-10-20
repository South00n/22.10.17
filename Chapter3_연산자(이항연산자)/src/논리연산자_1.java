/*
 *  논리연산자 : && , || --> 결과값 boolean
 *  		  (조건) && (조건)
 *  		  (조건) || (조건)
 *  	
 *  	&& : 범위나 기간이 포함하면 90~100 A
 *  	|| : 범위나 기간이 미포함
 *  	효율적인 연산 처리
 *  
 *  실행 결과
 *  
 *  -----------------------------------------------
 *							&&			||  
 *  -----------------------------------------------
 *   true true			   ture		   true
 *  -----------------------------------------------
 *   true false			   false	   true
 *  -----------------------------------------------
 *   false true			   false	   true
 *  -----------------------------------------------
 *   false false		   false	   false
 *  -----------------------------------------------
 *  
 *   &&연산자 두개의 조건이 true일 경우에만 true
 *   (조건) && (조건) 
 *   -----
 *   false --> 다음조건 보지않고 false (효율적인 계산)
 *   
 *   ||연산자 두개의 조건중에 1개 이상이 true일때 true
 *   (조건) || (조건)
 *   -----
 *   true --> 다음조건 보지않고 true (효율적인 계산)
 *  
 */
public class 논리연산자_1 {

	public static void main(String[] args) {
		
		//효율적인 연산
		int a = 10;
		int b = 9;
		
		//boolean 
		boolean result = (a<b) && ++b==a; //false
		System.out.println(result);
		System.out.println("a=:" + a);
		System.out.println("b=:" + b);
		
		boolean result2 = (a>b) && ++b==a; //true
		System.out.println(result2);
		System.out.println("a=:" + a);
		System.out.println("b=:" + b);
		
		boolean result3 = (a==b) || ++b==a; //true
		System.out.println(result3);
		System.out.println("a=:" + a);
		System.out.println("b=:" + b);
		
		
		
	}

}











