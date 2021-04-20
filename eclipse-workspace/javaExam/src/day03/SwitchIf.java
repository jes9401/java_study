package day03;

import java.util.Scanner;

public class SwitchIf {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int days;
		switch (month) {
		case 2:
			days = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		default:
			days = 31;
			break;
		}
		System.out.printf("%d월은 %d일", month, days);
		month = scanner.nextInt();
		if (month == 2) {
			days = 28;
		} else if ((month == 4) || (month == 6) || (month == 9) || (month == 1)) {
			days = 30;
		} else {
			days = 31;
		}
		System.out.printf("%d월은 %d일까지입니다.", month, days);
	}
}
