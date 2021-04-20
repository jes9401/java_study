package day05;

class Parent {
	int i;

	public Parent() {
		System.out.println("Parent 奄沙 持失切 ");
	}

	public Parent(int i) {
		System.out.println("Parent i 持失切 ");
	}
}

class Child extends Parent {
	int j;

	public Child() {
		System.out.println("Child 奄沙 持失切");
	}

	public Child(int i, int j) {
		System.out.println("Child i j 持失切");
	}

	public Child(int j) {
		System.out.println("Child j 持失切");
	}
}

public class Test {
	public static void main(String[] args) {
//		Parent p = new Parent();
//		Child c1 = new Child();
//		Parent c2 = new Child();
		
		Parent p = new Parent(10);
		Child c = new Child(10, 20);
		Child c2 = new Child(10);
	}
}
