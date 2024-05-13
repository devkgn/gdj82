package pkg01_lang.practice02;

public class Run {
	public static void main(String[] args) {
		Practice p = new Practice();
		// 1. searchStr() 동작 -> true
		// 2. printSentence의 매개변수 -> 1번 사용
		p.printSentence(p.searchStr("2024", "05", "13"));
	}
}
