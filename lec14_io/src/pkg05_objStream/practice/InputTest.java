package pkg05_objStream.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class InputTest {
	public static void main(String[] args) {
		File dir = new File("\\storage");
		File file = new File(dir,"students.dat");
		
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(file));
			Student s1 = (Student)ois.readObject();
			Student s2 = (Student)ois.readObject();
			
			System.out.println("첫번째 학생 정보 : ");
			System.out.println(s1);
			System.out.println("두번째 학생 정보 : ");
			System.out.println(s2);
			
			ois.close();
		}catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
				
	}

}
