package pkg05_practice.model.vo;

public class Circle extends Point{
	private int radius;
	private static final double PI = 3.14;
	
	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.printf("면적 : %.1f\n",PI*radius*radius);
		System.out.printf("둘레 : %.1f\n",PI*radius*2);
	}
}
