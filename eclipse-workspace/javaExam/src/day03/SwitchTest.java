package day03;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		/* int value = Integer.parseInt(args[0]); */
		switch (value) {
		case 1:
			System.out.println("1�Դϴ�");
			break;
		case 2:
			System.out.println("2�Դϴ�");
			break;
		default:
			System.out.println("??");
			break;

		}
		value = scanner.nextInt();
		switch (value) {
		case 1:
		case 2:
		case 3:
			System.out.println("����Գ�");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("������ �Գ�");
			break;
		case 7:
			System.out.println("�ʾ���");
			break;
		default:
			break;
		}
	}
}
