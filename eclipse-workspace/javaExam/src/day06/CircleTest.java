package day06;

public class CircleTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(12);
		Circle c3 = new Circle(10);
		Circle c4 = new Circle(0);
		Rect r1 = new Rect(10, 20);

		if (c1.equals(c2))
			System.out.println("c1과 c2는 같습니다.");
		if (c1.equals(c3))
			System.out.println("c1과 c3은 같습니다.");
		if (c2.equals(c3))
			System.out.println("c2와 c3은 같습니다.");
		System.out.println(c1.equals(r1));
		System.out.println(c1.equals(c4));
	}
}
