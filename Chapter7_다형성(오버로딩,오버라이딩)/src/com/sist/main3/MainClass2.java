package com.sist.main3;
/*
 * 	  super : 상위 클래스의 객체, this : 자신의 객체
 * 		=> 생성자, 인스턴스 메소드에서 사용이 가능 (static 메소드에서는 사용할 수 없다) 
 * 	  super() : 상위 클래스의 생성자, this() : 자신의 생성자를 호출시에 사용
 * 	  --------------------------------
 * 	  생성자에서만 사용이 가능
 * 	  => 첫줄에 사용한다
 * 
 * 	  class A {
 * 		int a, b, c; ==> super
 * 	  	public A() {}
 * 	  	public A(int a, int b) {}
 * 	  	public A(int a, int b, int c) {}
 * 	  }
 * 	  class B {
 * 		int a, b, c; ==> this
 * 		public B() {
 * 			super(); ==> public A() {}
 * 			super(10, 20); ==> public A(int a, int b) {}
 * 			super(10, 20, 30); ==> public A(int a, int b, int c) {}
 * 			super를 사용하지 않는 경우에는 자동으로 super()
 * 		}
 * 		public B(int a) {
 * 			super(100, 200); => A => a = 100, b = 200, c = 0
 * 		}
 * 		자신외에 상위 클래스의 변수, 메소드 제어가 가능하다
 * 		-- 	  --------
 * 		this  super
 * 		=> super는 가끔
 * 		=> this는 자주 나온다
 * 	  }
 */
class A {
	int a, b, c;
	public A() {
		a = 10; // 지역변수 => 멤버변수
		// 충돌이 없는 상태면 this. 생략가능 ==> 지역변수나 매개변수가 우선 순위다
		b = 20;
		c = 30;
	}
	public A(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public A(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
}

class B extends A {
	int a, b, c;
	public B() {
		a = 100;
		b = 200;
		c = 300;
	}
	public B(int a, int b, int c) {
		super(a, b, c);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	public void print() {
		System.out.println("this.a = " + this.a ); // B class가 가지고 있는 a, b, c
		System.out.println("this.b = " + this.b );
		System.out.println("this.c = " + this.c );
		
		System.out.println("super.a = " + super.a ); // A class가 가지고 있는 a, b, c
		System.out.println("super.b = " + super.b );
		System.out.println("super.c = " + super.c );
	}
}
public class MainClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//B b = new B(1000, 2000, 3000); // A a = new A();
		//b.print();
		
		// true, false
		// A, B, Object
		Object obj = new Object();
		A a = new A(); // A, Object
		B b = new B(); // B, Object
		
		if (a instanceof Object) { // a라는 객체가 Object인가
			System.out.println(true);
		}
		
		if (a instanceof Object) { // b라는 객체가 Object인가
			System.out.println(true);
		}
		
		if (b instanceof A) { 
			System.out.println(true);
		}
		
		if (b instanceof B) { 
			System.out.println(true);
		}
		
		if (a instanceof B) { 
			System.out.println(true);
		} else { 
			System.out.println(false);
		}
		
		String s = "";
		//if (s instanceof StringBuffer) 관련없는 코드 -> 에러
		// A는 Object다
		// B는 Object다
		// B는 A다
		// A는 B다 => false
		/*
		 * 	  동물(Object)
		 * 		|
		 * 	  인간(A)
		 * 		|
		 * 	  남자(B)
		 */
	}

}
// 상속에서 제외가되는 조건
// private, static, 생성자, 초기화블록
/*
 * final 클래스는 확장이 불가능 (상속이 불가능)
 * String, Math, System, Scanner --> 확장 불가능
 * 
 * 오버라이딩 조건
 * 1) 상속이 있어야한다
 * 2) 리턴형, 메소드, 매개변수가 동일해야한다
 * 3) 접근지정어는 축소 불가능 / 확대 가능
 * private < default < protected < public
 * 					   ---------
 * 					   같은패키지에서 접근이 가능 + 다른패키지에서 상속받은 클래스까지 접근이 가능
 * => 상속은 기존에 만들어진 클래스를 재사용 (필요하면 언제든 메소드를 변경해서 사용이 가능 + 변수값 추가 / 수정)
 * => 있는 그대로 사용시에는 포함해서 사용
 * 
 * 자식 객체는 부모타입으로 자동 타입 변환된다
 * class B extends A
 * A a = new B()
 * 
 * 부모 객체는 항상 자식 타입으로 강제 타입 변환된다
 * B b = (B)new A()
 * ==> 항상X 필요시에만 사용
 * 
 */
