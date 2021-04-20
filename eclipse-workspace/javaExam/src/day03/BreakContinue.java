package day03;

public class BreakContinue {
	public static void main(String[] args) {
		int c = 5;
		for (int i = 0; i < 10; i++) {
			if (i == c)
				continue;
			System.out.println(i);
		}

		a: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("i:" + i + ", j:" + j);
				if (j == 2) {
					System.out.println("break 실행");
					break a; // 레이블 사용해서 전체 반복문 빠져나오기
				}
			}
		}
	}
}
