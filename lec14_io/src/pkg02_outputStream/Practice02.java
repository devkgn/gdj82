package pkg02_outputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practice02 {
	public static void main(String[] args) {
		// storage 폴더에 애국가1.dat 파일에 아래와 같은 문장을 추가하세요.
		
		File dir = new File("\\storage");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
		File file = new File(dir, "애국가1.dat");
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(file,true);
			String str = "\n남산위에 저 소나무 철갑을 두른듯"
					+ "\n바람서리 불변함은 우리기상 일세"
					+ "\n무궁화 삼천리 화려강산 "
					+ "\n대한사람 대한으로 길이보전하세";
			fos.write(str.getBytes());
			fos.flush();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
