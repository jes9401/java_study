package shape;

public class Point {
	private int x, y;
	
	public Point() {
		System.out.println("Point 기본 생성자 생성");
	}
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void show() {
		System.out.printf("좌표[x=%d,y=%d]에 점을 그렸습니다.\n", x, y);
	}
	public void show(boolean bool) {
		if(bool==false) {
			System.out.printf("좌표[x=%d,y=%d]에 점을 지웠습니다.\n", x, y);
		}else {
			System.out.printf("좌표[x=%d,y=%d]에 점을 그렸습니다.\n", x, y);
		}
	}

}
