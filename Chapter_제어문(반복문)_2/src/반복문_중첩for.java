/*
 *   1) 조건문 중첩 (웹에서는 로그인)
 *   	if (조건문) {
 *   		if (조건문) {
 *   			Admin ===========> if (조건문 && 조건문)
 *   		} else {
 *   			User		
 *   		}
 *   	} else {
 *   		Guest
 *   	} // 로그인이 됐을때 어드민일때 유저일때 메뉴 로그인이 안됐을때 게스트일때 메뉴 만들때 사용
 *   
 *   2) 선택문 중첩 (게임, 네트워크)
 *   	switch (변수) {
 *   		case 값 :
 *   			switch (변수) {
 *   				case 값 :
 *   			}
 *   		break;
 *   	}
 *   
 *   3) 반복문 중첩
 *   	for () {
 *   		for () {
 *   		}
 *   	}
 *   	====================================
 *   	이중 for문
 *   	for () {
 *   		for () {
 *   			실제 출력물
 *   		}
 *   		\n
 *   	}
 *   
 *   	============> 변수위치 중요
 *   
 *   	형식) 2중 for문	 
 *   		for (초기값; 조건식; 증가식) {
 *   			for (초기값; 조건식; 증가식) {
 *   				실행문장
 *   			}
 *   		}
 *   
 *   
 *   
 */
public class 반복문_중첩for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		System.out.println("★★★★★");
		System.out.println();
		
		// 1차 for문
		for (int i = 1; i <= 5; i++) {
			System.out.println("★★★★★");
		}
		System.out.println();
		
		// 2차 for문
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("★");
			}
			System.out.println();
		}
	
	}

}
