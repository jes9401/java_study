package day05;

public interface Ainter {
	int v = 1220; 

	public void m1();

	default public void mm3() {
		System.out.println("Ainter에서 구현");
	}

	static public void m4() {

	}
}
