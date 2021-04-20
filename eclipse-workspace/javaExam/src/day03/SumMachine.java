package day03;

public class SumMachine {
	// 홀수의 합
	public int oddSum(int number) {
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		return sum;
	}

	// 짝수의 합
	public int evenSum(int number) {
		int sum = 0;
		for (int i = 0; i <= number; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		return sum;
	}
	
	//구구단 출력
	public void gugudan(int num) {
		for (int i =1;i<10;i++) {
			System.out.printf("%d X %d = %d \n",num,i,num*i);
		}
	}
}
