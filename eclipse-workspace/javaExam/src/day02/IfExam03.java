package day02;

import java.util.*;

public class IfExam03 {
	/*
	 * ���̸� �Է¹޾� 20�� �̻��̸� �������Դϴ�.�� ��� ����ϰ� �׷��� ������ ������� �۳� �Ŀ� ������ �˴ϴ�.�� ��� �޽����� ����ϴ�
	 * ���α׷��� �ۼ��Ͻÿ�.
	 * 
	 * �Է¿� : 18 ��¿� : ����� 2�� �Ŀ� ������ �˴ϴ�.
	 */
	static void adult(int age) {
		if (age >= 20) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.printf("����� %d�� �Ŀ� ������ �˴ϴ�.", 20 - age);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("���̸� �Է��ϼ��� : ");
		int age = scanner.nextInt();
		adult(age);

	}

}
