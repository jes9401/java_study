package day03;

public class ForTest {
	// 메서드 정의 방법
	// 접근제한자 리턴타입 메서드명(매개변수들){}
	public void printSum(int number) {
		int oddSum = 0, evenSum = 0;
		for (int i = 1; i <= number; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + i;
			} else {
				oddSum = oddSum + i;
			}
		}
		System.out.println("짝수의 합 : " + evenSum);
		System.out.println("홀수의 합 : " + oddSum);
	}

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("1~10 합 :" + sum);

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("짝수 : " + i);
			}
		}
		ForTest test = new ForTest();
		test.printSum(100);
	}
}
