package day03;

import java.util.Scanner;

public class SumMachineTest {

	public static void main(String[] args) {
		SumMachine sm = new SumMachine();
		int odd, even;
		even = sm.evenSum(100);
		System.out.println("짝수의 합 : " + even);
		odd = sm.oddSum(100);
		System.out.println("홀수의 합 : " + odd);

		Scanner scanner = new Scanner(System.in);
		System.out.println("몇 단을 출력할까요? => ");
		int num = scanner.nextInt();
		sm.gugudan(num);

	}

}
