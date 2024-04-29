package pkg03_method.study.model.vo;

public class Access {
	// public
	public void accessMethod1() {
		System.out.println("접근제한자 public");
	}
	// protected
	protected void accessMethod2() {
		System.out.println("접근제한자 protected");
	}
	// (default)
	void accessMethod3() {
		System.out.println("접근제한자 default");
	}
	
	// private
	private void accessMethod4() {
		System.out.println("접근제한자 private");
	}

}
