package shape;

public class ColorPoint extends Point {
	private int x,y;
	private String color;
	
	public ColorPoint() {
		System.out.println("ColorPoint 기본 생성자 생성");
	}
	public ColorPoint(int x, int y, String color) {
		this.x=x;
		this.y=y;
		this.color=color;
	}
	@Override
	public void show() {
		System.out.printf("좌표[x=%d,y=%d,color=%s]에 점을 그렸습니다.\n", x, y,color);
	}
}
