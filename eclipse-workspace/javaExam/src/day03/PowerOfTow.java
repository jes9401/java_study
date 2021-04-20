package day03;

import java.util.*;

public class PowerOfTow {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int result = 1;
		System.out.println("승수");
		int pow = scanner.nextInt();
		int n = pow;
		while (n > 0) {
			result = result * 2;
			n--;
		}
		System.out.printf("2의 %d 제곱근은 %d입니다.", pow, result);
	}
}
