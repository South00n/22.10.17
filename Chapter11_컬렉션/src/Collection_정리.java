import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

/*
 * 	   578page => 컬렉션
 * 	   			  ---- 데이터 모아서 메모리에 저장 (자료구조 : 메모리에 저장된 데이트를 쉽게 관리)
 * 				  컬렉션 프레임워크 : 표준화 (동일하게 사용)
 * 								  |
 * 							    인터페이스
 * 
 * 							  Collection
 * 				List : 순서가 있다, 데이터중복 허용
 * 					   ArrayList, Vector, LinkedList, Stack, Queue
 * 				Set : 순서가 없다, 데이터 중복을 허용하지 않는다
 * 					  HashSet, TreeSet
 * 				Map : key, value => 쌍으로 저장
 * 					  key는 중복할 수 없다, value : 중복이 가능
 * 					  put("id", "admin")
 * 					  => 시험 (도서)
 * 
 * 				Collection (자료구조 => CURD)
 * 				  => add() : 데이터 추가
 * 				  => set() : 데이터 수정
 * 				  => remove() : 데이터 삭제
 * 				  => get() : 데이터 읽기
 * 				  => size() : 데이터 갯수
 * 
 * 				ArrayList
 * 				--------- 단점 (인덱스번호를 자동으로 조절) => 순차적으로 생성 : 데이터 수집용
 * 												   => Object => 형변환
 * 												   => 개발자 요구 (제네릭스)
 */
public class Collection_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		System.out.println(list);
		
		Vector vec = new Vector();
		vec.add(1);
		vec.add(2);
		System.out.println(vec);
		
		LinkedList list1 = new LinkedList();
		list1.add(1);
		list1.add(2);
		System.out.println(list1);
	}

}
