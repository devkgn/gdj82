package pkg04_scanner;
// 1. import문
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		String str = new String("감사합니다.");
		System.out.println(str.charAt(0));
		// 2. 참조변수
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int number = sc.nextInt();
		System.out.println("입력된 정수는 "+number+"입니다.");
		
		
		
		
//		byte b_num = sc.nextByte();
//		System.out.println(b_num);
//		short s_num = sc.nextShort();
//		System.out.println(s_num);
		// 3. 메소드 사용
		// sc.nextByte();
		// sc.nextShort();
		// sc.nextInt(); 
		// sc.nextLong();
		// sc.nextFloat();
		// sc.nextDouble();
		// sc.nextBoolean();
		// sc.next();
		// sc.nextLine();
		// char 데이터 사용법
//		String str1 = sc.next();
//		System.out.println(str1);
//		char char1 = sc.next().charAt(0);
//		System.out.println(char1);
		// next()와 nextLine()의 차이
		
		String str1 = sc.next();
		String str2 = sc.nextLine();
		System.out.println(str1);
		System.out.println(str2);
		
		// 4. 스트림을 닫아준다.
		sc.close();

	}

}
