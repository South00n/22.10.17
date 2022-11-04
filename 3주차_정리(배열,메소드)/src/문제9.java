//년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오

public class 문제9 {
	
	static boolean isyear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean bCheck = isyear(2024);
		if (bCheck) {
			System.out.println("윤년입니다");
		} else {
			System.out.println("윤년이 아닙니다");
		}
	}

}
