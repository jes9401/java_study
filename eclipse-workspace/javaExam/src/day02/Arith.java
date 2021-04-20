package day02;

public class Arith {

	public static void main(String[] args) {
		int a = 7;
		int b = 3;
		
		System.out.println(a++); //전위연산
		System.out.println(a);
		System.out.println(++a); //후위연산
		
		System.out.println(10.0/3);
		System.out.println(10/3.0);
		System.out.println(10/3); //둘 다 정수일 경우에만 버림 연산
		System.out.println((double)10/3); 

	}

}
