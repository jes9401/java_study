package day02;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[0]+args[1]);
		
		int i = 10;
		Integer ii = 10;
		int result = Integer.parseInt(args[0])+Integer.parseInt(args[1]);
		System.out.println(result);
		Scanner keyboard = new Scanner(System.in);
		int value = keyboard.nextInt();
		System.out.println(value+30);
	}

}
