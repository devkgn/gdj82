package pkg07_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class InputStreamTest2 {
	public static void main(String[] args) {
		File dir = new File("\\storage");
		File file = new File(dir,"sample3.html");
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis);
			br = new BufferedReader(isr);
			
			String line = null;
			StringBuilder sb = new StringBuilder();
			
			while(true) {
				line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line).append("\n");	
			}
			System.out.println(sb.toString());
			br.close();
			isr.close();
			fis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
