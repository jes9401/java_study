package day02;

import java.util.*;

public class IfExam05 {
	/*
	 * �� ���� �Ǽ��� �Է¹޾� ��� 4.0 �̻��̸� "A", ��� 3.0 �̻��̸� "B", �ƴϸ� "C" ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * 
	 * �Է¿� : 4.3 3.5 ��¿� :B
	 * 
	 * �Է¿� : 4.0 2.9 ��¿� :C
	 * 
	 */
	static void isGrade(float a, float b) {
		if (a > 4.0 && b > 4.0) {
			System.out.println("A");
		} else if (a > 3.0 && b > 3.0) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}

	public static void main(String[] args) {
		float a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ���� �Ǽ� �Է� : ");
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		isGrade(a, b);

	}

}
