import java.lang.reflect.InvocationTargetException;


/*
 * 	   날짜 / 시간 (10장)
 * 
 * 	   **Date ==> 저장용 (현재 시스템의 날짜 시간을 읽어 온다) => 오라클 => 기능이 거의없다
 * 	   **Calendar ==> Date클래스 확장 => 제어가 쉽게 만들어 준 클래스 (추상 클래스)
 *  	 --------
 *  	 생성 : Calendar cal = Calendar.getInstance() - 528page
 *  	 읽기 : cal.get(Calendar.YEAR)
 *  	      cal.get(Calendar.MONTH)
 *  	      cal.get(Calendar.DATE)
 *  	 	  cal.get(Calendar.DAY_OF_WEEK)
 *  	 쓰기 :
 *  	      cal.set(Calendar.YEAR, 2022)
 *  	      cal.get(Calendar.MONTH, 11-1)
 *  	 	  cal.get(Calendar.DATE, 22)
 *  		  ** cal.getActualMaximum(Calendar.DATE) ==> 설정된 달의 마지막 날짜
 *  	 
 *     **SimpleDateFormat (많이 나옴) => (Date를 변환해서 출력)
 *     	 년도 : yyyy
 *     	  월 : MM, M
 *        일 : dd, d
 *       시간 : hh
 *        분 : mm, m
 *        초 : ss, s
 *     **DecimalFormat : 541page ==> 1,000 ==> ###,###
 *     	 DecimalFormat df = new DecimalFormat("#,###,###,###")
 *     	 System.out.println(df.format(12345678)) ==> 12,345,678 => 쇼핑몰 상품
 *     MessageFormat : 데이터베이스 - 출력 형식을 만든다
 *     	String pattern = "{0}, {1}, {2} ...";
 *      Object[] obj = {};
 *      MessageFormat.format(pattern, obj)
 *     LocalDate : 날짜
 *     	 LocalDate.now() : 현재 날짜
 *     	 LocalDate.of(년, 월, 일) : 날짜 설정
 *     LocalTime : 시간
 *     	 LocalTime.now()
 *     	 LocalTime.of(시간, 분, 초) ==> 시간 24시간
 *     ** LocalDateTime : 날짜
 *     	 LocalDate + LocalTime
 *     
 *     ============> isAfter(), isBefore(), isEqual()
 *     ============> between
 * 		
 * 
 * 	   ----------------------------------------------------------------------------
 * 	   = 가독성 : 분리 (기능별) => 구조화된 프로그램 (단락을 나눠서 처리) => 메소드가 중심
 * 				유지보수 (수정, 추가)
 * 				========> 리팩토링
 *     = 최적화 : 속도(실행)
 *     		    브라우저 => 쓰레드 2개 (이미지, 텍스트) => + , StringBuffer => 오라클 (index)
 *     = 결합성(의존성) : 클래스 수정시 => 다른 클래스에 영향
 *     				 ----------    ------------- 결합성이 낮은 프로그램이 좋다
 *     											 new보단 리플렉션
 *     = 응집성 : 메소드는 한개의 기능만 수행하게 만든다 (재사용성, 오류처리에 좋다)
 *     = 재사용성 : 상속, 포함
 * 
 * 	   객체얻기
 * 	   1) getClass()
 * 	   2) class
 *     3) Class.forName()
 *     4) new
 * 
 */
class A {
	int i = 10;
	
	public void display() {
		System.out.println("아아아");
	}
}

public class Chapter10_정리 {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException {
		// TODO Auto-generated method stub
		A a1 = new A();
		System.out.println(a1.i);
		A a2 = new A().getClass().getDeclaredConstructor().newInstance();
		System.out.println(a2.i);
		A a3 = A.class.getDeclaredConstructor().newInstance();
		System.out.println(a3.i);
		A a4 = (A) Class.forName("A").getDeclaredConstructor().newInstance();
		a4.display();
	}

}
