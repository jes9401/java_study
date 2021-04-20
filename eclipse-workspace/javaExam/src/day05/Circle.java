package day05;

public class Circle extends Shape implements Drawable{
	private int r;

	public Circle() {
		this(0);
	}

	public Circle(int r) {
		this.r = r;
	}

	@Override
	public double calculateArea() {
		double r = this.r;
		return (double) r * r * Math.PI;
	}
	public void draw() {
		System.out.println("원을 그렸습니다.");
	}

}
