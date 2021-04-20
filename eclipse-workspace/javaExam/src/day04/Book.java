package day04;

public class Book {
	// 지은이, isbn, 제목, 전체페이지, 현재페이지 -- 필드

	// 메서드 : 책장을 넘기다() - 1 페이지씩 넘긴다, 책장을 넘기다(page) - 해당 페이지로 이동
	String 지은이, 제목, isbn;
	int 전체페이지, 현재페이지;

	public Book() {
	}

	// 생성자 => 메서드와 유사, return 타입 없고 메서드명=클래스명
	public Book(String 제목, String 지은이) {
		this(제목,지은이,"000",200);
	}

	public Book(String 제목, String 지은이, String isbn, int 전체페이지) {
		this.제목 = 제목;
		this.지은이 = 지은이;
		this.isbn = isbn;
		this.전체페이지 = 전체페이지;
	}

	public void 책장을넘기다() {
		현재페이지 += 1;
	}

	public void 책장을넘기다(int p) {
		현재페이지 = p;
	}
	public void set제목(String s) {
		this.제목=s;
	}
	public void set지은이(String s) {
		this.지은이=s;
	}
	public String get제목() {
		return this.제목;
	}
	public String get지은이() {
		return this.지은이;
	}
	@Override
	public String toString() {
		return "Book [지은이=" + 지은이 + ", 제목=" + 제목 + ", isbn=" + isbn + ", 전체페이지=" + 전체페이지 + ", 현재페이지=" + 현재페이지 + "]";
	}


	
}
