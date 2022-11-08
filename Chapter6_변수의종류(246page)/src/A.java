
public class A {
	int a = 10;				// 인스턴스변수
	static int b = 20;		// 공유변수 / 클래스변수
	// => static = 시작과 동시에 메모리에 저장
	// static 변수는 한개만 생성이 가능 (공유변수)
	void display (int c) { // 지역변수
		int d = 10;	// 지역변수
	}
}
