package day02;

public class 청소기 {
	void 청소하다() {
		System.out.println("청소를 시작하다");
		먼지흡입();
		걸레질하다();
		청소기청소();
		System.out.println("청소를 끝내다");
	}
	
	void 먼지흡입() {
		System.out.println("먼지를 흡입하다");
	}
	
	void 걸레질하다() {
		System.out.println("걸레질 합니다");
	}
	private void 청소기청소() {
		System.out.println("청소기를 청소하다");
	}
}
