package day05;

class Parent2 {
	public void m1() {
		System.out.println("m1");
	}
}

class Child2 extends Parent2 {
	public void m2() {
		System.out.println("m2");
	}
}

public class Test2 {
	public static void testMethod(Object obj) {
		System.out.println("객체 + 객체의 자식");
	}
	public static void testMethod2(Parent2 p) {
		System.out.println("Parnet + 자식");
	}
	public static void main() {
		Parent2 p = new Parent2();

//		Child2 c= p;
		// 자식 타입으로 부모 가리키는 것은 x

		Child2 c = new Child2();
		p = c;
		// 형변환

		p = new Child2();
		c = (Child2) p;
		// 명시적
		
		p.m1();
//		p.m2();
		//p가 child2를 가리키므로 m2를 가지고 있어도 사용할 수 없음
		
		c.m2();
		//형변환을 통해 사용 가능
		
		Parent2 p3 = new Parent2();
		if(p3 instanceof Child2) {	//p3의 인스턴스가 Child2일 경우
			Child2 c3 = (Child2)p3; //형변환 가능한 경우는 타입과 상관없이 인스턴스가 Child일 경우 가능
			//컴파일시 에러 x, 실행시 에러 o
		}
		testMethod("123");
//		testMethod2("abc");
		//Parent2 타입만 가능
		testMethod2(p3);
		testMethod2(c);
	}
}
