package day06;

public class RectTest {
	public static void main(String[] args) {
		Rect a = new Rect(2, 3);
		Rect b = new Rect(3, 2);
		Rect c = new Rect(3, 4);
		Rect d = new Rect(0,1);
		Circle c1 = new Circle(10);

		if (a.equals(b))
			System.out.println("사각형 a 와 사각형 b는 같습니다.");
		if (a.equals(c))
			System.out.println("사각형 a 와 사각형 c는 같습니다.");
		if (b.equals(c))
			System.out.println("사각형 b 와 사각형 c는 같습니다.");
		
		System.out.println(a.equals(c1));
		System.out.println(a.equals(d));
	}

}