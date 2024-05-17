package pkg01_file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class TryCatchTest {
	public static void main(String[] args) {
		File dir = new File("\\storage");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir,"sample4.txt");
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			
			bw.write("Hello");
			bw.newLine();
			bw.write("Bye");
			bw.newLine();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	
	}
}
