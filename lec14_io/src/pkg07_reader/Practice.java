package pkg07_reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Practice {
	public static void main(String[] args) {
		// storage/practice/output.txt 파일을 읽어서 정보를 출력하세요. 
		// output.txt 파일안의 문자열의 수를 공백을 제외하고 몇자인지 또한 출력하세요.
		// FileReader와 BufferedReader를 모두 활용하세요.
		// "세 번째 줄입니다." 문장 뒤의 줄바꾸기도 제거하세요.
		// 출력 예시
		/*
		 * 첫 번째 줄입니다 
		 * 두 번째 줄입니다 
		 * 세 번째 줄입니다
		 * 공백 제외 글자수 : 24
		 */
		File dir = new File("\\storage\\practice");
		File file = new File(dir,"output.txt");
		//BufferedReader br = null;
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			//br = new BufferedReader(new FileReader(file));
			String line = null;
			StringBuilder sb = new StringBuilder();
			int sum = 0 ;
			while(true) {
				line = br.readLine();
				if(line == null) {
					// sb = 첫번째줄입니다\n두번째줄입니다\n세번째줄입니다\n;
					sb.delete(sb.length()-1, sb.length());
					break;
				}
				sum +=  (line.replace(" ", "")).length();
				sb.append(line).append("\n");
			}
			System.out.println(sb.toString());
			System.out.println("공백 제외 글자수 : "+sum);
			//br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
