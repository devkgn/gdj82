package pkg04_dataStream;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class Practice {
	public static void main(String[] args) {
		File dir = new File("\\storage");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir,"output.dat");
		DataOutputStream dos = null;
		try {
			dos = new DataOutputStream(new FileOutputStream(file));
			
			String name = "철수";
			int age = 25;
			char gender = '남';
			
			dos.writeUTF(name);
			dos.writeInt(age);
			dos.writeChar(gender);
			
			dos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
