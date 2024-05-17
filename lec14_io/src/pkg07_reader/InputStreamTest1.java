package pkg07_reader;

import java.io.File;
import java.io.FileInputStream;

public class InputStreamTest1 {
	public static void main(String[] args) {
		File dir = new File("\\storage");
		File file = new File(dir,"sample3.html");
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream(file);
			int c = 0 ; 
			StringBuilder sb = new StringBuilder();
			while(true) {
				c = fis.read();
				if(c == -1) {
					break;
				}
				sb.append((char)c);
			}
			System.out.println(sb.toString());
			fis.close();		
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}
}
