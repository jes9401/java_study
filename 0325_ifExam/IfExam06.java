package day02;

import java.util.*;

public class IfExam06 {
	/*
	 * 영문 대문자를 입력받아 'A'이면 “매우잘함”, 'B'이면 “잘함”, 'C'이면 “보통임”, 'D'이면 “노력요함”, 'F'이면 “낙제”,
	 * 그 외 문자이면 “잘못입력”이라고 출력하는 프로그램을 작성하시오. 입력예:B
	 * 
	 * 출력예:잘함
	 */
	static void a(String grade) {
		if (grade.equals("A")) {
			System.out.println("매우잘함");
		} else if (grade.equals("B")) {
			System.out.println("잘함");
		} else if (grade.equals("C")) {
			System.out.println("보통임");
		} else if (grade.equals("D")) {
			System.out.println("노력 요함");
		} else if (grade.equals("F")) {
			System.out.println("낙제");
		} else {
			System.out.println("잘못입력");
		}
	}

	public static void main(String[] args) {
		String grade;
		Scanner scanner = new Scanner(System.in);
		System.out.println("영문 대문자 입력 : ");
		grade = scanner.next();
		a(grade);
	}

}
