/*
 *   while --> 167page
 *   ----------------- 무한루프 (데이터베이스에서 많이 등장)
 *   1) 순차적으로 실행
 *   	초기값
 *   	while(조건식) { true일때 반복 {}, false 종료
 *   		반복수행문장
 *   		증가식
 *   	}
 *   	---> for(초기값; 조건식; 증가식)
 *   			반복 수행문장
 *   	주의점)
 *   		  for(;;) --> while(true)
 *   		  while() --> 조건문을 제시
 *   			   --- 조건(비교, 논리, 부정), true/false
 */
public class 반복문_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A-Z, Z-A
		char c = 'A';
		while(c <= 'Z') {
			System.out.print((char)(c+32) + " ");
			c++;
		}
		System.out.println();
		
		// 이대로 진행하면 c는 Z+1 부터 시작
		// Z값으로 초기화하고 다시 시작
		
		c = 'Z';
		while(c >= 'A') {
			System.out.print(c + " ");
			c--;
		}
		
		System.out.println();
		int i = 1;
		while(i<=100) {
			i++;
		}
		System.out.println(i); // 101출력
	}

}
