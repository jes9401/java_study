package day04;

public class Book {
	// ������, isbn, ����, ��ü������, ���������� -- �ʵ�

	// �޼��� : å���� �ѱ��() - 1 �������� �ѱ��, å���� �ѱ��(page) - �ش� �������� �̵�
	String ������, ����, isbn;
	int ��ü������, ����������;

	public Book() {
	}

	// ������ => �޼���� ����, return Ÿ�� ���� �޼����=Ŭ������
	public Book(String ����, String ������) {
		this(����,������,"000",200);
	}

	public Book(String ����, String ������, String isbn, int ��ü������) {
		this.���� = ����;
		this.������ = ������;
		this.isbn = isbn;
		this.��ü������ = ��ü������;
	}

	public void å�����ѱ��() {
		���������� += 1;
	}

	public void å�����ѱ��(int p) {
		���������� = p;
	}
	public void set����(String s) {
		this.����=s;
	}
	public void set������(String s) {
		this.������=s;
	}
	public String get����() {
		return this.����;
	}
	public String get������() {
		return this.������;
	}
	@Override
	public String toString() {
		return "Book [������=" + ������ + ", ����=" + ���� + ", isbn=" + isbn + ", ��ü������=" + ��ü������ + ", ����������=" + ���������� + "]";
	}


	
}
