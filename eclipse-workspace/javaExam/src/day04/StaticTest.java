package day04;

public class StaticTest {
	String name;
	int count;
	
	static int totalCount;
	
	public void instanceMethod(String name) {
		this.name=name;
		System.out.println(count);
		System.out.println(totalCount);
		staticMethod();
	}
	
	public static void staticMethod() {
		//����ƽ �޼��� ����
		
//		System.out.println(name);
		//name�� StaticTest Ŭ������ �ν��Ͻ�ȭ �� �� �����ǰ� ������ ����� �� ����
		
		System.out.println(totalCount);
	}
	
	public static void main(String[] args) {
		System.out.println(totalCount);
		staticMethod();
		StaticTest st = new StaticTest();
		System.out.println(st.name);
	}
}
