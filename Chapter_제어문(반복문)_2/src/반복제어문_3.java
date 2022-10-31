/*
 *   1.컴퓨터 가위바위보
 *     ------------ 계속 진행 ==> q/Q 입력하면 종료
 */
import java.util.Scanner;

public class 반복제어문_3 {
	// 종료 => break, continue => 잘못된 입력 (경고)
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win = 0; // 이긴 횟수
		int lose = 0; // 진 횟수
		int same = 0; // 비긴 횟수
		int count = 0; // 게임 횟수
		Scanner sc = new Scanner(System.in);
		// new ==> 메모리 공간을 차지 반복문에 넣으면 계속 생성
		while (true) {
			// 난수 발생 ==> 게임 시점 ==> 0(가위), 1(바위), 2(보)
			int com = (int)(Math.random() * 3); // 0~2
			// ==> 웹 (예약일을 랜덤으로 발생시킬거임)
			System.out.print("가위(0), 바위(1), 보(2):");
			int user = sc.nextInt();
			if (user < 0 || user > 2) { // 잘못된 입력
				System.out.println("가위(0), 바위(1), 보(2)를 입력하세요!");
				continue; // 처음부터 다시 실행 ==> while문의 조건문으로 이동
			}
			count++;
			if (com == 0) {
				System.out.println("컴퓨터: 가위");
			} else if (com == 1) {
				System.out.println("컴퓨터: 바위");				
			} else if (com == 2) {
				System.out.println("컴퓨터: 보");								
			}
			
			if (user == 0) {
				System.out.println("사용자: 가위");
			} else if (user == 1) {
				System.out.println("사용자: 바위");				
			} else if (user == 2) {
				System.out.println("사용자: 보");								
			}
			
			// 확인
			/*
			 *   com	user	 com - user
			 *    0		 0			 0 	draw
			 *   가위 	 1			-1	user-win
			 *    		 2			-2	com-win
			 *   com	user
			 *    1		 0			 1	com-win
			 *   바위 	 1			 0	draw
			 *    		 2			-1	user-win
			 *   com	user
			 *    2		 0			 2	user-win
			 *    보		 1			 1	com-win
			 *    		 2			 0	draw
			 *    -------------------------------- user-win = -1, 2 
			 *    -------------------------------- com -win = -2, 1
			 *    -------------------------------- draw
			 */
			 // 10전 4승 2무 4패
			 switch (com - user) {
			 	case -1: case 2:
			 		System.out.println("사용자 Win");
			 		win++;
			 		break;
			 	case -2: case 1:
			 		System.out.println("컴퓨터 Win");
			 		lose++;
			 		break;
			 	case 0:
			 		System.out.println("비겼다");
			 		same++;
			 		break;
			 }
			 
			 //종료 확인
			 System.out.print("게임을 종료할까요?(y/n):");
			 char c = sc.next().charAt(0); // Scanner로 문자한개 받기
			 if (c == 'y' || c == 'Y') {
				 System.out.println("Game Over!");
				 break; // while을 종료
			 }
			 
		} // while문 종료
		System.out.printf("%d전 %d승 %d무 %d패 입니다", count, win, same, lose);
	} // main 종료

}
