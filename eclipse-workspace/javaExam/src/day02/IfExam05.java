package day02;

import java.util.*;

public class IfExam05 {
	/*
	 * 두 개의 실수를 입력받아 모두 4.0 이상이면 "A", 모두 3.0 이상이면 "B", 아니면 "C" 라고 출력하는 프로그램을 작성하시오.
	 * 
	 * 
	 * 입력예 : 4.3 3.5 출력예 :B
	 * 
	 * 입력예 : 4.0 2.9 출력예 :C
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
		System.out.println("두 개의 실수 입력 : ");
		a = scanner.nextFloat();
		b = scanner.nextFloat();
		isGrade(a, b);

	}

}
