package day04.���;

public class Child extends Parent {
	int i = 10;
	
	@Override
	int getI() {
		return i;
	}
	void print() {
		System.out.println(i);
	}
}
