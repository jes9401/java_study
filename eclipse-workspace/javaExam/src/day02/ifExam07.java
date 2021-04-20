package day02;

import java.util.*;

public class ifExam07 {
	/*
	 * 3개의 정수를 입력받아 조건연산자를 이용하여 입력받은 수들 중 최소값을 출력하는 프로그램을 작성하시오.
	 * 
	 * 
	 * 입력예:18 -5 10 출력예:-5
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
		System.out.println("세 개 의 정수 입력 : ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		minNum(a, b, c);
	}

}
