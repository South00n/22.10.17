/*
 * -> 41page ~ 84page
 *	  ---------------
 *	  화면 출력 / 키보드 입력값 / 형변환
 *	  -------
 *		System.out.println() -> 가장 많이 사용되는 화면 출력 기능
 *		System.out.print() -> 줄바꿈x
 *		System.out.printf()	-> 출력 형식을 만들어서 출력 (서식이있는 출력)
 *			-> 데이터형 출력 종류 (%d 정수출력, %f 실수, %c 문자, %s 문자열)
 *			-> %5d = 출력할때 5칸 확보 오른쪽정렬
 *			   %-5d = 출력할때 5칸 확보 왼쪽정렬
 *	  화면 입력
 *		Scanner -> 사용방법 (40page) --> 도스에서만 사용 (문법)
 *		 1) 클래스 --> 메모리 저장
 *			Scanner sc = new Scanner(System.in); System.in = 키보드 입력값
 *						 --- 클래스를 메모리에 저장시에 반드시 사용 (동적메모리 할당)
 *							 malloc() --> new
 *							 free()   --> delete : GC
 *		 2) 클래스가 가지고 있는 기능을 활용
 *			Scanner가 가지고 있는 기능
 *			정수값 받을 경우 : nextInt() (메소드: 한 가지 기능을 가지고 있다)
 *			문자열 받는 경우 : next()
 *			논리형 받기 : nextBoolean()
 *			실수형 받기 : nextDouble()
 *			-------------------------------java.io (BufferedReader) --> 예외처리필요
 *	  진법
 *		표현법 : 8진법(0~), 16진법(0x~)
 *		-> 2진법 : 0,1
 *		   8진법 : 0~7
 *		   16진법 : 0~15 -> 10(A) ~ 15(F) --> color지정 0xFF --> 255
 *
 *		-> 음수 표현 (2의 보수) --> 양수보다는 1이 크다
 *								70 --> -71 (~ : 반전연산자)
 *	  형변환***** (UpCasting, DownCasting)
 *				 ---------  ----------- 데이터형을 작게 만든다 int --> char
 *				 데이터형을 크게 변환
 *				 --------------- int --> double
 *								 
 *				 1) UpCasting (자동 형변환)
 *					변수 초기값
 *					double d = 10; --> 10을 실수로 변경해서 저장
 *					int a = 'A' 
 *					------------> 변수의 데이터형 >= 값
 *					가급적이면 같은 데이터형으로 받는 것이 좋다
 *					예외적으로 char는 int값을 받을 수 있음
 *					연산자
 *		- 자동 형변환
 *		- 강제 형변환
 *			->오버플로우 발생가능
 *		--------------------------연산자에 등장
 */
public class 화면출력_진법_형변환정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
