import java.util.*;

public class 문제9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		ArrayList<Integer> gyo = new ArrayList<Integer>();
		ArrayList<Integer> cha = new ArrayList<Integer>();
		ArrayList<Integer> hap = new ArrayList<Integer>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);

		list2.add(3);
		list2.add(4);
		list2.add(5);
		list2.add(6);		
		
		System.out.println(list1);
		System.out.println(list2);
		
		//list1.retainAll(list2);
		//System.out.println("교집합 : " + list1);

		//list1.addAll(list2);
		//System.out.println("합집합 : " + list1);

		//list1.removeAll(list2);
		//System.out.println("차집합 : " + list1);
		
		
	}

}
