package day03;

public class Test {
	public static void main(String[] args) {
		int i = 10;
		String name = "jeong";
		System.out.println(i);
		System.out.println(name);
		System.out.println(i + name);
		System.out.println("내 이름은 " + name + "이고, 나이는 " + i + "입니다.");
		System.out.printf("내 이름은 %s이고, 나이는 %d입니다.\n", name, i);
		ForTest test = new ForTest();
		test.printSum(1000); // ForTest 클래스에서 불러옴
	}
}
