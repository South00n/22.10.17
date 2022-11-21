package com.sist.string;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
/*
 * https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&aqs=chrome..69i57j69i60l2.1431j1j7&sourceid=chrome&ie=UTF-8
 */
public class MainClass_String_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 인코딩 (byte[])
			String name = "자바";
			System.out.println("===== 인코딩 =====");
			byte[] b = name.getBytes("UTF-8");
			for(byte bb : b) {
				System.out.print(String.format("%02X",  bb));
			}
			
			System.out.println("\n===== 디코딩 =====");
			byte[] b2 = name.getBytes("CP949");
			for(byte bb : b2) {
				System.out.print(String.format("%02X",  bb));
			}
			
		} catch (Exception e) {}
		
	}	

}
