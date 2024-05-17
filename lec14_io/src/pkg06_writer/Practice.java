package pkg06_writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Practice {
	public static void main(String[] args) {
		File dir = new File("\\storage\\practice");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir,"output.txt");
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			String[] lines = {"첫 번째 줄입니다", "두 번째 줄입니다", "세 번째 줄입니다"};
			
//			for(String line : lines) {
//				bw.write(line);
//				bw.newLine();
//			}
			for(int i = 0 ; i < lines.length ; i++) {
				bw.write(lines[i]);
				bw.newLine();
			}
			
			bw.close();
			fw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
