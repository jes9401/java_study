package day03;

import java.util.Scanner;

public class SumMachineTest {

	public static void main(String[] args) {
		SumMachine sm = new SumMachine();
		int odd, even;
		even = sm.evenSum(100);
		System.out.println("¦���� �� : " + even);
		odd = sm.oddSum(100);
		System.out.println("Ȧ���� �� : " + odd);

		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ���� ����ұ��? => ");
		int num = scanner.nextInt();
		sm.gugudan(num);

	}

}
