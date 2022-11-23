package coc.sist.collection;
// 정수 저장
import java.util.*; // ArrayList

public class MainClass_ArrayList_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(7); // 0
		list.add(4); // 1
		list.add(3); // 2
		list.add(6); // 3
		list.add(2); // 4
		list.add(5); // 5
		list.add(1); // 6
		
		for(Object i : list) { // 데이터형 일치 or 크게
			System.out.println(i);
		}
		System.out.println("======= 정렬 =======");
		Collections.sort(list);
		for(Object i : list) { 
			System.out.println(i);
		}
		System.out.println("======= Copy =======");
		ArrayList list2 = new ArrayList(list.subList(1, 5));
		// 배열 ==> copy ==> arraycopy(), clone()
		for(Object i : list2) { 
			System.out.println(i);
		}
		// 원하는 부분만 copy ==> subList ==> 페이지 나누기
		// CURD => Create(add) Update(set) Read(get) Delete(remove) => 웹의 핵심
	}

}
