package day03;

import java.util.*;

public class PrimeDetect {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Ҽ����� �Ǵ��� ���� : ");
		int num = scanner.nextInt();
		int divisor = 2;
		boolean isPrime = true;
		while (divisor < num) {
			if (num % divisor == 0) {
				isPrime = false;
				break;
			}
			divisor++;
		}
		if (isPrime == true) {
			System.out.println(num + "�� �Ҽ��Դϴ�.");
		} else {
			System.out.println(num + "�� �Ҽ��� �ƴմϴ�.");
		}
	}
}
