package day04;

public class BookTest {

	public static void main(String[] args) {

		Book b1 = new Book("����� �ڹ�", "���Ǽ�");
		b1.���������� = 1;
		System.out.println(b1.���� + " " + b1.������ + " " + b1.isbn);
		System.out.println(b1.��ü������ + " " + b1.����������);
		b1.å�����ѱ��();
		System.out.println(b1.����������);
		b1.å�����ѱ��(122);
		System.out.println(b1.����������);

		Book b2 = new Book("å����2", "������2", "111-2222", 300);
		System.out.printf("%s %s %s %d \n", b2.����, b2.������, b2.isbn, b2.��ü������);
		System.out.println(b2);
		System.out.println(b1);

		Book b3 = new Book();
		b3.set����("����3");
		b3.set������("������3");
		System.out.println(b3.get����() + " " + b3.get������());
	}
}
