package day05;

public class MyClass implements Binter, Cinter {

	@Override
	public void m1() {
		// TODO Auto-generated method stub

	}

	@Override
	public int m3() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		Ainter a = new MyClass();
		a.m1();
		System.out.println(a instanceof MyClass);
		System.out.println(a instanceof Ainter);
		System.out.println(a instanceof Binter);
		System.out.println(a instanceof Cinter);
		Binter b = new MyClass();
		b.m1();
		b.m2();
		
		Cinter c = new MyClass();
		c.m1();
		c.m3();
	}
}
