package shape;

public class ColorPoint extends Point {
	private int x,y;
	private String color;
	
	public ColorPoint() {
		System.out.println("ColorPoint �⺻ ������ ����");
	}
	public ColorPoint(int x, int y, String color) {
		this.x=x;
		this.y=y;
		this.color=color;
	}
	@Override
	public void show() {
		System.out.printf("��ǥ[x=%d,y=%d,color=%s]�� ���� �׷Ƚ��ϴ�.\n", x, y,color);
	}
}
