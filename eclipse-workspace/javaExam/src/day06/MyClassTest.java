package day06;

import java.util.ArrayList;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass my = new MyClass("정의석");
		System.out.println(my.getClass());
		System.out.println(my);
		System.out.println(my.toString());
		System.out.println(my.hashCode());
		//오브젝트의 기본적인 기능들 
		
		MyClass my2 = new MyClass("Kim");
		System.out.println(my2);
		
		Car c = new Car("똥차", 50,"현대");
		System.out.println(c);

		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		System.out.println(list);
		
		MyClass my3 = new MyClass("정의석");
		System.out.println(my==my3);
		System.out.println(my.equals(my3));
		//MyClass에서 equals메서드 오버라이드 했기 때문에 true 
		String str = "abc";
		String str3 = new String("abc");
		System.out.println(str.equals(str3));
	}
}
