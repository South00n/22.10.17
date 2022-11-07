// 학점을 구하는 메소드를 구현하시오
public class 문제8 {

	static double hakjum(int a, int b, int c) {
		return (a + b + c) / 3.0; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double grade = hakjum(50, 60, 70);
		System.out.println(grade);
	}

}
