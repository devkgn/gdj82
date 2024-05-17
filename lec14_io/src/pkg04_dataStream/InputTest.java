package pkg04_dataStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class InputTest {
	public static void main(String[] args) {
		File dir = new File("\\storage");
		File file = new File(dir,"sample4.dat");
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream(file));
			
			String name = dis.readUTF();
			int age = dis.readInt();
			double height = dis.readDouble();
			boolean isAdult = dis.readBoolean();
			char gender = dis.readChar();
			
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
			System.out.println("키 : "+height);
			System.out.println("성인여부 : "+(isAdult?"성인":"미성년자"));
			System.out.println("성별 : "+gender);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
