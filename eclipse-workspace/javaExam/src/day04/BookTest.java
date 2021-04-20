package day04;

public class BookTest {

	public static void main(String[] args) {

		Book b1 = new Book("모두의 자바", "정의석");
		b1.현재페이지 = 1;
		System.out.println(b1.제목 + " " + b1.지은이 + " " + b1.isbn);
		System.out.println(b1.전체페이지 + " " + b1.현재페이지);
		b1.책장을넘기다();
		System.out.println(b1.현재페이지);
		b1.책장을넘기다(122);
		System.out.println(b1.현재페이지);

		Book b2 = new Book("책제목2", "지은이2", "111-2222", 300);
		System.out.printf("%s %s %s %d \n", b2.제목, b2.지은이, b2.isbn, b2.전체페이지);
		System.out.println(b2);
		System.out.println(b1);

		Book b3 = new Book();
		b3.set제목("제목3");
		b3.set지은이("지은이3");
		System.out.println(b3.get제목() + " " + b3.get지은이());
	}
}
