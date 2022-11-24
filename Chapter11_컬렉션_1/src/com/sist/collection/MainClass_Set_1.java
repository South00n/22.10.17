package com.sist.collection;

import java.util.*;

public class MainClass_Set_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set set = new HashSet();
		
		for(;;) {
			int r = (int)(Math.random() * 45) + 1;
			set.add(r);
			if(set.size() == 6) {
				break;
			}
		}
		System.out.println(set);
		// List로 변환
		List list = new ArrayList(set); // sort이용하려면 Set을 List로 변환
		Collections.sort(list);
		System.out.println(list);
		
		for(int i = list.size() - 1; i >= 0; i--) {
			System.out.print(list.get(i) + " ");
		}
	}

}
