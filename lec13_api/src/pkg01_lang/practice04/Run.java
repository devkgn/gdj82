package pkg01_lang.practice04;

public class Run {
	public static void main(String[] args) {
		Practice p = new Practice();
		String result = p.deleteBlank(" 거 의 다 왔 어 요 ! ");
		System.out.println(result);
		//거의다왔어요!
	}
}
