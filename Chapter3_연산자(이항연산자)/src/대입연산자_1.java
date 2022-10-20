/*
 *   대입연산자 : =
 *   		  --- 필수 (변수의 초기값, 변수값 변경, 연산 결과값 받기 ..)
 *   			  int a = 10;
 *   			  a = 20;
 *   			  int a = 10 + 20;
 *   
 *   복합대입연산자 : += , -= , *= , /= , <<= , >>= , &= , |= , ^=
 *   			 ---  ---
 *    += (누적), 문자열을 모아서 관리할때 많이 쓰임
 *    int a = 10;
 *    a += 20; ---> a = a + 20;
 *    a --> 30
 *    
 *    -=
 */
public class 대입연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		// 프로그램 -> 프로그래머가 컴퓨터에 명령을 내려서 수행이 가능하게 만든다
		// 명령에도 순서가 존재 한다 -> 명령순서 - 처리가 원활하게 만든다 (알고리즘) -- 프로그래머마다 코딩 순서가 달라짐 (로직)
		a = 20;
		System.out.println(a);
		a += 10;
		System.out.println(a);
		a -= 10;
		System.out.println(a);
		
	}

}


















