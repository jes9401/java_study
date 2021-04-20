package day05;

public class ShapeTest {

	public static void main(String[] args) {
//		Shape rect = new Rect(10,300);
//		Shape circle = new Circle(10);
//		rect.draw();
//		System.out.println(rect.calculateArea());
//		circle.draw();
//		System.out.println(circle.calculateArea());
		Circle c = new Circle(10);
		Shape s = c;
		Drawable d = c;
		
		System.out.println(s.calculateArea());
		d.draw();
	}

}
