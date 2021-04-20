package day04;
import shape.Point;
public class Exam05 {
	public static void main(String[] args) {
		Goods g1=new Goods();
		Goods g2=new Goods("아이폰",700000,20,50);
		System.out.println(g1);
		System.out.println("-----------");
		System.out.println(g2);
		System.out.println("-----------");
		
		Song s1 = new Song();
		Song s2 = new Song("아이유","좋은날","Real",2010,3,"이민수");
		s1.show();
		s2.show();
		System.out.println("-----------");
		
		Point p1 = new Point();
		Point p2 = new Point(2,5);
		p1.show();
		p2.show();
		
		
	}

	
}
