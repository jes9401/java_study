package day03;

public class WhileTest {
	public static void main(String[] args) {
		int count = 5;
		while (count > 1) {
			System.out.println("hello!!");
			count--;
		}
		System.out.println(count);
		do {
			System.out.println("hi!"); // do�� ��� �ѹ� �����ϰ� ���� ��
			System.out.println(count);
		} while (count-- > 0);
	}
}
