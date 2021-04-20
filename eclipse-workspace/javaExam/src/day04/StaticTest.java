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
		//스태틱 메서드 선언
		
//		System.out.println(name);
		//name은 StaticTest 클래스가 인스턴스화 될 때 생성되게 때문에 사용할 수 없음
		
		System.out.println(totalCount);
	}
	
	public static void main(String[] args) {
		System.out.println(totalCount);
		staticMethod();
		StaticTest st = new StaticTest();
		System.out.println(st.name);
	}
}
