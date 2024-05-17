package pkg05_objStream.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class OutputTest {
	public static void main(String[] args) {
		File dir = new File("\\storage");
		if(!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir,"students.dat");
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			
			Student s1 = new Student("김철수",20);
			Student s2 = new Student("김영희",24);
			
			oos.writeObject(s1);
			oos.writeObject(s2);
			
			oos.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	}
}
