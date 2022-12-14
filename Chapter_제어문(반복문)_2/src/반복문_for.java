/*
 *   for (157 page)
 *   --- 반복문
 *   --- 반복횟수를 알고 있는 경우에 주로 사용 (Front-End)
 *   ---
 *   	1) 초기값 -> 처음 시작값 지정
 *   	2) 조건식 -> 범위 (몇번 수행)
 *   	3) 증감식 -> i++, i+=2, i+=3... (항상 한개씩 증가하는게 아님)
 *   					---------- 복합 대입 연산자
 *   
 *   	--> for(초기값; 조건식; 증감식) {
 *   			수행하는 문장
 *   			이미지를 출력
 *   			제목 출력
 *   			조회수 출력...
 *   		}
 *   	
 *   		실행순서      ↗ false면 종료
 *   			 1  →  2  ←  4 (증감된 값이 조건식에 맞는지 다시 확인)
 *   		for(초기값; 조건식; 증감식) {
 *   				 3 ↓  ↗ 
 *   			    실행문장
 *   		}
 *   		==========================
 *   while
 *   ----- 반복문
 *   ----- 반복횟수를 모르는 경우
 *   ----- 데이터베이스 프로그램, 네트워크 (서버/클라이언트) -> 무한루프 많이사용 = while문
 *   
 *   	--> 초기값 1-> 조건식에 대입 (true/false)
 *   		while(조건식) { 2-> 초기값이 true면 진행 / false면 종료
 *   			반복실행문장  3	
 *   			증감식	  4 -> 증감후 조건 다시 확인
 *   		}		
 */
// 1~10 -> 1씩 증가 -> 출력 -> for/while
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int i = 1;
		while(i<=10) {
			System.out.print(i + " ");
			i++;
		}
	}

}
