/*
 *   반복문 -> 반복적인 소스를 모아서 한번에 처리
 *   ---------------------------------
 *    for(시작값; 끝나는값; 증감식)
 *    
 *    1 ~ 100
 *    for(int i=1; i<=100; i++)
 *    15 ~ 250
 *    for(int i=15; i<=250; i++)
 *    10 ~ 100 10씩증가
 *    for(int i=10; i<=100; i+=10)
 *    
 *    -> 합, 곱, 갯수
 *    sum =0  gop=1   count=0  -->초기값
 *	  sum+=i, gop*=i, count++
 *	  ------          -------
 *	  총 구매액		   구매갯수 --> 브라우저로 전송 (받은 값을 출력), 모바일로 전송가능
 *	  request.setAttribute("total", 10000) / 				{"total":10000} -> JSON
 *
 *	  *** 변수잡기 --> 초기값 어떻게 줄것인지
 *	  *** 연산자
 *	  *** 제어문	
 *    ------------------------------ 메소드 (여러개 -> 클래스) [라이브러리 = 암기]
 *	  for : 반복횟수 알고있을때
 *	  while : 무한루프 (종료하지 않는 프로그램) -> while(true) : 종료하는 프로그램을 첨부
 *										   게임 : ESC => System.exit(0);
 *			 -> 데이터베이스 (웹 프로그램의 핵심) => 80%
 *	  -> Front(for) / Back(while)
 *
 *	  156page ~ 157page 이미지(순서 확인)
 *	  156page --> 형식
 *	  167page --> while 형식, 순서 
 */	   
public class 반복문정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
