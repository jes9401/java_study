package day02;

import java.util.*;

public class IfExam06 {
	/*
	 * ���� �빮�ڸ� �Է¹޾� 'A'�̸� ���ſ����ԡ�, 'B'�̸� �����ԡ�, 'C'�̸� �������ӡ�, 'D'�̸� ����¿��ԡ�, 'F'�̸� ��������,
	 * �� �� �����̸� ���߸��Է¡��̶�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. �Է¿�:B
	 * 
	 * ��¿�:����
	 */
	static void a(String grade) {
		if (grade.equals("A")) {
			System.out.println("�ſ�����");
		} else if (grade.equals("B")) {
			System.out.println("����");
		} else if (grade.equals("C")) {
			System.out.println("������");
		} else if (grade.equals("D")) {
			System.out.println("��� ����");
		} else if (grade.equals("F")) {
			System.out.println("����");
		} else {
			System.out.println("�߸��Է�");
		}
	}

	public static void main(String[] args) {
		String grade;
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �빮�� �Է� : ");
		grade = scanner.next();
		a(grade);
	}

}
