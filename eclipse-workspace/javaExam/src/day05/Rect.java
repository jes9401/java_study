package day05;

public class Rect extends Shape implements Drawable{
	private double h,w;
	// �ڽ� Ŭ������ �߻�޼��带 �ݵ�� �����ؾ���
	// �ڽ� Ŭ������ �߻� Ŭ������ ���� ����
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
		System.out.println("�簢���� �׷Ƚ��ϴ�.");
	}

}