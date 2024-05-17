package pkg04_dataStream;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class Practice2 {
	public static void main(String[] args) {
		// 이름 : 철수
		// 나이 : 25
		// 성별 : 남성
		File dir = new File("\\storage");
		File file = new File(dir,"output.dat");
		DataInputStream dis = null;
		try {
			dis = new DataInputStream(new FileInputStream(file));
			
			String name = dis.readUTF();
			int age = dis.readInt();
			char gender = dis.readChar();
			
			System.out.println("이름 : "+name);
			System.out.println("나이 : "+age);
			System.out.println("성별 : "+(gender=='남'?"남성":"여성"));
			
			dis.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
