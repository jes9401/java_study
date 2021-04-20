package day05;

public class ExceptionTest4 {
	public static void m2(int i) throws RuntimeException {
		System.out.println(100 / i);
		System.out.println("test");
	}

	public static void m1(int i) throws Exception {
		System.out.println(100 / i);
		System.out.println("test");
	}

	public static void inputScore(int score) throws MyException {
		if (score > 100) {
			throw new MyException("100이하로 입력");
		}
		System.out.println("점수 : " + score);
	}

	public static void main(String[] args) {
//		try {
//			m1(0);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

		// m2(0);

		try {
			inputScore(200);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
//			e.printStackTrace(); // 에러 내용 출력
		}

	}

}