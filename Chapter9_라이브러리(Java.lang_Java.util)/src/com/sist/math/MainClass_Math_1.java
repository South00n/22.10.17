package com.sist.math;
/*
 *   Math : 기본적인 수학 계산에 필요한 라이브러리
 *   		---------------------------> 게임에서 많이씀
 *   		웹 : 수학계산이 거의 없다 (오라클)
 *   		random() : 난수 ==> Random => nextInt(100) => 0 ~ 99 편하다
 *   		-------- 임의의 수를 추출
 *   		 public static double random()
 *   		 *** Math클래스는 static 메소드다 (메모리할당이 없이 사용이 가능)
 *   		 *** import java.lang.Math => 생략이 가능
 *   			 => Math.random()
 *   		 *** import static java.lang.Math.random
 *   			 => random()만 따로 사용가능
 *   				------- 0.0 ~ 0.99 사이의 임의의 수 추출 
 *   		ceil() : 올림 => 페이지 나누기
 *   		round() : 반올림 => 평균 (소수점) ==> 자동 반올림 (printf("%.2f"))
 */
import static java.lang.Math.round;
import static java.lang.Math.ceil;
import static java.lang.Math.random;
public class MainClass_Math_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("%.2f\n", 87.555);
		/*
		 * System.out.println(Math.round(87.555));
		 * System.out.println(Math.ceil(87.111)); System.out.println(Math.random() *
		 * 100);
		 */
		System.out.println(round(87.555));
		System.out.println(ceil(87.111));
		System.out.println((int)(random() * 100));
	}

}
