package day03;

import java.util.Scanner;

public class SwitchTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		/* int value = Integer.parseInt(args[0]); */
		switch (value) {
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다");
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
			System.out.println("일찍왔네");
			break;
		case 4:
		case 5:
		case 6:
			System.out.println("적당히 왔네");
			break;
		case 7:
			System.out.println("늦었네");
			break;
		default:
			break;
		}
	}
}
