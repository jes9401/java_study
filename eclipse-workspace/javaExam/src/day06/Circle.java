package day06;

public class Circle {
	private int x, y, radius;

	public Circle(int radius) {
		this.radius = radius;
	}
	public Circle(int x, int y, int radius) {
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public void test() {
		
	}
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(obj==null)
			return false;
		if(obj instanceof Circle) {
			Circle c = (Circle)obj;
			if(radius==0 || c.radius==0) {
				System.out.println("반지름이 0인 원은 비교할 수 없습니다.");
				return false;
			}
			if (radius == c.radius) {
				return true;
			} else {
				return false;
			}
		}else {
			return false;
		}
		


	}
}
