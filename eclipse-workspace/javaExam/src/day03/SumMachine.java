package day03;

public class SumMachine {
	// Ȧ���� ��
	public int oddSum(int number) {
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		return sum;
	}

	// ¦���� ��
	public int evenSum(int number) {
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	//������ ���
	public void gugudan(int num) {
		for (int i =1;i<10;i++) {
			System.out.printf("%d X %d = %d \n",num,i,num*i);
		}
	}
}
