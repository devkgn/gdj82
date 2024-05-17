package pkg07_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedTest {
	public static void main(String[] args) {
		// 1. 디렉토리 객체 생성
		File dir = new File("\\storage");
		// 2. 파일 객체 생성
		File file = new File(dir,"sample2.txt");
		// 3. 파일 입력 스트림 선언
		FileReader fr = null;
		BufferedReader br = null;
		try {
			// 4. 파일 입력 스트림 생성
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			// 5. 읽은 단위 지정
			String line = null;
			StringBuilder sb = new StringBuilder();
			
			// 6. 읽기
			while(true) {
				line = br.readLine();
				if(line == null) {
					break;
				}
				sb.append(line).append(",");
			}
			System.out.println(sb.toString());
			// 7. 닫기 
			br.close();
			fr.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
