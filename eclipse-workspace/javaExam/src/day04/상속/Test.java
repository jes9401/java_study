package day04.상속;

public class Test {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.i);
		System.out.println(c.getI());
		c.print();
		
		Parent p = new Child();
		//부모는 자식을 가리킬 수 있음
		Object obj = new Child();
		
//		Child c2 = new Parent();
//		Child c3 = p;
//		//반대 경우는 안됨
		
		System.out.println(p.i);
		//필드는 오버라이드 되면 타입을 따른다
		
		System.out.println(p.getI());
		//메서드는 오버라이드 되면 무조건 자식 메서드 따름
		
//		p.print(); //자식 메서드에만 있어서 사용 불가
		((Child)p).print();
		//형변환하면 사용가능
	}
}
