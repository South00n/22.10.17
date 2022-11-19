package com.sist.string;

public class 라이브러리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// equals : 같은 경우에 true / 다른 경우에 false
		// 원형 : public boolean equals(String s)
		// ==> 일반 문자열은 같은 문자면 주소가 동일하다
		String s1 = "Hello";
		String s2 = "Hello";
		// new를 이용시에는 다른 메모리에 저장이 된다
		if(s1 == s2) { // 메모리 주소값이 동일하냐?
			System.out.println("s1 == s2");
		} else {
			System.out.println("s1 != s2");
		}
		String s3 = new String("hello"); // 새로운 메모리에 저장
		if(s1 == s3) {
		 	System.out.println("s1 == s3");
		} else {
			System.out.println("s1 != s3");
		}
		////////////////////////////////// 주소값비교
		////////////////////////////////// 실제값을 비교
		if(s1.equals(s3)) { // equals --> 실제 저장되어 있는 값을 비교 (대소문자 구분)
			System.out.println("equals : 같은 문자열을 가지고 있다");
		} else {
			System.out.println("equals : 다른 문자열을 가지고 있다");
		}
		
		if(s1.equalsIgnoreCase(s3)) { // equalsIgnoreCase --> 실제 저장되어 있는 값을 비교 (대소문자 구분x)
			System.out.println("equalsIgnoreCase : 같은 문자열을 가지고 있다");
		} else {
			System.out.println("equalsIgnoreCase : 다른 문자열을 가지고 있다");
		}
	}

}
