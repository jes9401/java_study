package day02;

import java.util.Scanner;

public class ifExam02 {
	/*
	 * ��������+100-Ű���� �񸸼�ġ �����̶�� ����. Ű�� �����Ը� �ڿ����� �Է¹޾� ù ��° �ٿ� �񸸼�ġ�� ����ϰ�, �񸸼�ġ�� 0����
	 * ũ�� �����ٿ� ���̶�� �޽����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. (��������� �Ʒ� ��� ���� �����ϼ���.)
	 * 
	 * 155 60
	 * 
	 * �񸸼�ġ�� 5�Դϴ�. ����� ���̱���.
	 */
	static void fat(int height,int weight) {
		int result = weight+100-height;
		if (result>0) {
			System.out.println("�񸸼�ġ�� "+result+"�Դϴ�. ����� ���̱���.");
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ű�� �����Ը� �Է��ϼ��� : ");
		int height = scanner.nextInt();
		int weight = scanner.nextInt();
		fat(height,weight);
	}

}
