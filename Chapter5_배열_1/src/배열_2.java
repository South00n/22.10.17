/*
 *    1. 배열(변수의 일종) --> []
 *    	 1) 선언 / 초기화
 *    		데이터형[] 배열명; // 권장 사항
 *    		------- 데이터형 (참조변수 --> 메모리 주소를 이용해서 접근하는 방식) + 배열 / 클래스 / 인터페이스
 *    		  stack / heap
 *    		  -----	  ----- 실제 데이터가 저장되는 공간 (메모리 --> 주소값)
 *    		 메모리 주소
 *    		데이터형 배열명[]; // C언어 호환
 *    
 *    		예) 정수형 배열
 *    			int[] arr;
 *    			int arr[];
 *    
 *    		   문자형 배열
 *    			char[] arr;
 *    			char arr[];
 *    
 *    		   실수형 배열
 *    			double[] arr;
 *    			double arr[];
 *    
 *    		   논리형 배열
 *    			boolean[] arr;
 *    			boolean arr[];
 *    			---------------------------- 183 page
 *    
 *    	 2) 초기화
 *    		데이터형[] 배열명 = {값, 값, 값....}
 *    		데이터형[] 배열명 = new 데이터형[배열갯수]
 *    
 *    		데이터형[] 배열명 = new 데이터형[배열갯수]
 *    		배열명[인덱스] = 값;
 *    		배열명[인덱스] = 값;
 *    		...
 *    		
 *    		int a;
 *    		배열명[0] --> 일반 한개의 변수와 동일하게 취급 -> 필요시마다 값을 변경해서 사용이 가능
 *    
 *    	 3) 배열이 메모리에 배치되는 과정 ==> 인덱스번호를 이용해서 관리
 *  								 ------- 배열에 저장된 갯수보다 1개 작다 (0번부터 시작을 한다)  
 *  
 */		
public class 배열_2 {
	/*
	 * 	  변수
	 * 		= 변수
	 * 		= 배열
	 *  	= 클래스
	 *  	------------------- 선언, 초기화, 값 변경, 값 읽기
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 초기화 => 명시적으로, 난수, 사용자 입력을 받아서 저장
		// 명시적 초기화
		int[] arr = {10, 20, 30, 40, 50};
		// 뒤에 있는 갯수만큼 지정 -> int를 연속해서 5개를 저장하는 메모리 공간을 만든다
		// 변수, 배열(변수의 일종) ==> 읽기(메모리에 저장된 데이터 가지고 오기)/쓰기(저장, 수정해서 저장이 가능)
		// 값을 읽어오는 방법
		// 1. 네번째에 있는 데이터를 읽어 온다 => 출력
		System.out.println("arr => 4번째 데이터 : " + arr[3]);
		System.out.println("arr => 5번째 데이터 : " + arr[4]);
		// 갑을 변경하는 방법
		// 1. 2번째에 있는 데이터를 200으로 변경
		arr[1] = 200;
		arr[2] = 300;
		
		// 배열에 저장된 데이터 전체를 출력
		for (int i = 0; i < 5; i++) {
			System.out.printf("arr[%d] = %d\n", i, arr[i]);
		}
	}

}













