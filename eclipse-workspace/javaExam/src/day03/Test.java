package day03;

public class Test {
	public static void main(String[] args) {
		int i = 10;
		String name = "jeong";
		System.out.println(i);
		System.out.println(name);
		System.out.println(i + name);
		System.out.println("�� �̸��� " + name + "�̰�, ���̴� " + i + "�Դϴ�.");
		System.out.printf("�� �̸��� %s�̰�, ���̴� %d�Դϴ�.\n", name, i);
		ForTest test = new ForTest();
		test.printSum(1000); // ForTest Ŭ�������� �ҷ���
	}
}
