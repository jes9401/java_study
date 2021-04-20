package day02;

import java.util.*;

public class IfExam04 {
	/*
	 * ����ü���� �����԰� 50.80kg ���ϸ� "�ö��̱�", 61.23kg ���� "����Ʈ��", 72.57kg ���� "�̵��", 88.45kg
	 * ���� "ũ������", �� �̻��� "����"�̶�� ����. �����Ը� �Է¹޾� ü���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. �Է¿� : 87.3
	 * 
	 * ��¿� : ũ������
	 */
	static void weightDiscrimination(float weight) {
		String result;
		if (weight > 88.45) {
			result = "����";
		} else if (weight > 72.57) {
			result = "ũ������";
		} else if (weight > 61.23) {
			result = "�̵��";
		} else if (weight > 50.80) {
			result = "����Ʈ��";
		} else {
			result = "�ö��̱�";
		}
		System.out.println(result);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ : ");
		float weight = scanner.nextFloat();
		weightDiscrimination(weight);

	}

}
