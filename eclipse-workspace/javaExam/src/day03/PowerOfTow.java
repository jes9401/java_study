package day03;

import java.util.*;

public class PowerOfTow {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int result = 1;
		System.out.println("�¼�");
		int pow = scanner.nextInt();
		int n = pow;
		while (n > 0) {
			result = result * 2;
			n--;
		}
		System.out.printf("2�� %d �������� %d�Դϴ�.", pow, result);
	}
}
