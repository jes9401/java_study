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
		System.out.println("��ü + ��ü�� �ڽ�");
	}
	public static void testMethod2(Parent2 p) {
		System.out.println("Parnet + �ڽ�");
	}
	public static void main() {
		Parent2 p = new Parent2();

//		Child2 c= p;
		// �ڽ� Ÿ������ �θ� ����Ű�� ���� x

		Child2 c = new Child2();
		p = c;
		// ����ȯ

		p = new Child2();
		c = (Child2) p;
		// �����
		
		p.m1();
//		p.m2();
		//p�� child2�� ����Ű�Ƿ� m2�� ������ �־ ����� �� ����
		
		c.m2();
		//����ȯ�� ���� ��� ����
		
		Parent2 p3 = new Parent2();
		if(p3 instanceof Child2) {	//p3�� �ν��Ͻ��� Child2�� ���
			Child2 c3 = (Child2)p3; //����ȯ ������ ���� Ÿ�԰� ������� �ν��Ͻ��� Child�� ��� ����
			//�����Ͻ� ���� x, ����� ���� o
		}
		testMethod("123");
//		testMethod2("abc");
		//Parent2 Ÿ�Ը� ����
		testMethod2(p3);
		testMethod2(c);
	}
}
