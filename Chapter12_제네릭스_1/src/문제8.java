import java.util.HashSet;
import java.util.Set;

/*
 * 8.  arr[] = {10, 20, 30, 40, 50, 60, 70, 40, 30, 20} 
 * 배열에 중복된 데이터를 제거하고 아래의 그림과 같이 출력하는 프로그램을 작성하시오. 
 * (데이터출력시 순서는 상관없음)
 */
public class 문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10, 20, 30, 40, 50, 60, 70, 40, 30, 20};
		Set set = new HashSet();
		
		for(int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		
		System.out.println(set);
	}

}
