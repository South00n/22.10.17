/*
2. 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다. 
(실적 0~100)
1) 사번별 실적을 출력하시오.
사원(1) 50..
2) 1월 실적의 총점과 평균을 출력하시오.
3) 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.

 */
public class 문제2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] result = {50, 45, 35, 12, 70};
		// 실적 출력
		for (int i = 0; i < result.length; i++) {
			System.out.printf("사원(%d) %d\n", i+1, result[i]);
		}
		
		// 총점/평균
		int total = 0;
		for (int i : result) {
			total += i;
		}
		System.out.printf("1월 실적의 총점 : %d\n", total);
		System.out.printf("1월 실적의 평균 : %.2f\n", total / (double)result.length);
		
		int max = result[0];
		int min = result[0];
		
		for (int i = 1; i < result.length; i++) {
			if (max < result[i]) {
				max = result[i];
			} else if (min > result[i]) {
				min = result[i];	
			}
		}
		
		
		for (int i = 1; i < result.length; i++) {
			if (max == result[i]) {
				System.out.println("실적이 제일 큰 사원의 사번은 " + (i+1) + "번 입니다.");
				System.out.println("실적이 제일 큰 사원의 실적은 " + max + "입니다.");
			}
			
			if (min == result[i]) {
				System.out.println("실적이 제일 작은 사원의 사번은 " + (i+1) + "번 입니다.");
				System.out.println("실적이 제일 작은 사원의 실적은 " + min + "입니다.");
			}
		}
		
		
		
		
	}

}
