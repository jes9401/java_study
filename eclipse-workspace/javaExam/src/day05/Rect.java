package day05;

public class Rect extends Shape implements Drawable{
	private double h,w;
	// 자식 클래스는 추상메서드를 반드시 구현해야함
	// 자식 클래스도 추상 클래스로 선언 가능
	@Override
	public double calculateArea() {
		double h =this.h;
		double w = this.w;
		return (double) w * h;
	}
	public Rect() {
		this(0,0);
	}
	public Rect(double h, double w) {
		this.h=h;
		this.w=w;
	}
	public void draw() {
		System.out.println("사각형을 그렸습니다.");
	}

}