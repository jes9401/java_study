package day06;

import java.util.ArrayList;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass my = new MyClass("���Ǽ�");
		System.out.println(my.getClass());
		System.out.println(my);
		System.out.println(my.toString());
		System.out.println(my.hashCode());
		//������Ʈ�� �⺻���� ��ɵ� 
		
		MyClass my2 = new MyClass("Kim");
		System.out.println(my2);
		
		Car c = new Car("����", 50,"����");
		System.out.println(c);

		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		System.out.println(list);
		
		MyClass my3 = new MyClass("���Ǽ�");
		System.out.println(my==my3);
		System.out.println(my.equals(my3));
		//MyClass���� equals�޼��� �������̵� �߱� ������ true 
		String str = "abc";
		String str3 = new String("abc");
		System.out.println(str.equals(str3));
	}
}
