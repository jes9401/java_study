package day03;

public class ForTest {
	// �޼��� ���� ���
	// ���������� ����Ÿ�� �޼����(�Ű�������){}
	public void printSum(int number) {
		int oddSum = 0, evenSum = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}
		}
		System.out.println("¦���� �� : " + evenSum);
		System.out.println("Ȧ���� �� : " + oddSum);
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10 �� :" + sum);

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("¦�� : " + i);
			}
		}
		ForTest test = new ForTest();
		test.printSum(100);
	}
}
