package pkg04_constructor;

public class Practice02 {
	public void test(int i) {}
	// 1번 : 매개변수 자료형이 다른 경우(O)
	public void test(String str) {}
	// 2번 : 매개변수 개수가 다른 경우(O)
	public void test(int i, String str) {}
	// 3번 : 매개변수 명칭이 다른 경우 (X)
	// public void test(int num) {}
	// 4번 : 리턴이 다른 경우 (X)
	// public char test(int point) {}
	// 5번 : 매개변수 개수가 다른 경우(O)
	public void test(int i, int k) {}
	// 6번 : 2번과 일치(X)
	// public void test(int num, String text) {}
	// 7번 : 매개변수의 순서가 다른 경우
	public void test(String str, int i) {}
}
