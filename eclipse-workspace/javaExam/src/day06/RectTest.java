package day06;

public class RectTest {
	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		Rect d = new Rect(0,1);
		Circle c1 = new Circle(10);

		if (a.equals(b))
			System.out.println("�簢�� a �� �簢�� b�� �����ϴ�.");
		if (a.equals(c))
			System.out.println("�簢�� a �� �簢�� c�� �����ϴ�.");
		if (b.equals(c))
			System.out.println("�簢�� b �� �簢�� c�� �����ϴ�.");
		
		System.out.println(a.equals(c1));
		System.out.println(a.equals(d));
	}

}