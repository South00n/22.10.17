import java.io.*;

public class MainClass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("c:\\javaDev\\news.txt");
		int i = 0;
		//String s = "";
		StringBuffer sb = new StringBuffer();
		while((i=fr.read()) != -1) {
			//s += String.valueOf((char)i);
			sb.append((char)i);
		} 
		fr.close();
		System.out.println(sb);
	}

}
