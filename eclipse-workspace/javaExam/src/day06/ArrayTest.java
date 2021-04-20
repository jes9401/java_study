package day06;

import java.util.ArrayList;

public class ArrayTest {

	public static void main(String[] args) {
		ArrayList<Circle> list = new ArrayList<Circle>();
//		list.add("a");
		list.add(new Circle(0, 0, 3));
//		list.add(10);
		list.add(new Circle(0, 0, 5));
		
		list.get(0).test();
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("a");
		list2.add("b");
		
		System.out.println(list);
		System.out.println(list2); 
		
		for(int i =0; i < list.size();i++) {
			list.get(i).test();
		}
		for (String string : list2) {
			System.out.println(string);
		}
	}

}
