package day02;

import java.util.*;

public class ifExam07 {
	/*
	 * 3���� ������ �Է¹޾� ���ǿ����ڸ� �̿��Ͽ� �Է¹��� ���� �� �ּҰ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * 
	 * �Է¿�:18 -5 10 ��¿�:-5
	 */
	static void minNum(int a, int b, int c) {
		if (a < b && a < c) {
			System.out.println(a);
		} else if (b < a && b < c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� �� �� ���� �Է� : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		minNum(a, b, c);
	}

}
