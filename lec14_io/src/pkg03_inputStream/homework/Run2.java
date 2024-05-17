package pkg03_inputStream.homework;

public class Run2 {
	public static void main(String[] args) {
		Practice p = new Practice();
		
		long diff1 = 0;
		long diff2 = 0; 
		System.out.println("bis 먼저 실행");
		while(true) {
			long start2 = System.nanoTime();
			p.method2();
			long end2 = System.nanoTime();
			long start1 = System.nanoTime();
			p.method1();
			long end1 = System.nanoTime();
			diff1 = end1-start1;
			diff2 = end2-start2;
			System.out.println("fis : "+diff1);
			System.out.println("bis : "+diff2);
			System.out.println("==================");
			if(diff1 < diff2) break;
		}
		
		
		
	
	}
}
