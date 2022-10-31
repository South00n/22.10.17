/*
 *   난수를 6개 추출해서 합을 구하시오
 *   --- 1~100;
 */
public class 반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		
		/*
		 * int a = (int)(Math.random() * 100) + 1; sum += a; a = (int)(Math.random() *
		 * 100) + 1; sum += a; a = (int)(Math.random() * 100) + 1; sum += a; a =
		 * (int)(Math.random() * 100) + 1; sum += a; a = (int)(Math.random() * 100) + 1;
		 * sum += a; a = (int)(Math.random() * 100) + 1; sum += a;
		 */ //하드코딩
		//System.out.println("sum=" + sum);
		
		int i=1;
		while(i<=6) {
			int a = (int)(Math.random() * 100) + 1;
			// a변수는 while 한번 수행시마다 -> 새로운 변수다
			System.out.println(i + ". " + a);
			sum += a;
			i++;
		} // a는 메모리에 의해서 자동 삭제 (지역변수)
		// a는 출력불가 System.out.println(a);
		System.out.println("sum=" + sum);
		
		/*
		 *  for(int i=1; i<=100; i++{
		 *  }
		 * 	System.out.println("i=" + i) --> 오류나는 코드
		 *  ==========================================
		 *  int i=1;
		 *  for(i=1; i<=100; i++{
		 *  }
		 * 	System.out.println("i=" + i) --> 사용가능
		 */
	}

}
