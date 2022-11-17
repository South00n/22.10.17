package com.sist.exception;
/*
 *	   throws
 *	   ------
 *		이미 만들어진 메소드에서 예외에 대한 예측이 어렵다
 *		==> 다른언어 (선언) ==> 코딩 에러처리를 할 수 없다
 *		==> 자바에는 어떤 에러가 발생할지를 선언을 하고 있다 (대비) => 견고해짐
 *		==> 가독성
 *		------------------------------------------------------
 *		aaa() : 기능 리턴형
 *
 *		throws ==> 생성자, 메소드에서만 사용이 가능
 *				   초기화블록에서는 throws를 사용할 수 없다
 */
public class MainClass_throws1 {
	public static void method1() throws Exception {
		method2();
	}
	public static void method2() throws Exception {
		throw new Exception();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메인에서 예외 떠넘기면서 처리할수도있고
		// 직접 try ~ catch로 처리가능
		try {
			method1();			
		} catch (Exception e) {
	
		}
	}

}
