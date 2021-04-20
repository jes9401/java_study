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
			System.out.println("hi!"); // do를 적어도 한번 실행하고 조건 비교
			System.out.println(count);
		} while (count-- > 0);
	}
}
