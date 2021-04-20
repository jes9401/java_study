package day06;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		List<String> sList = new ArrayList<>();
		sList.add("a");
		sList.add("a");
		sList.add("a");
		
		
		Set<String> sset = new HashSet<>();
		sset.add("a");
		sset.add("b");
		System.out.println(sList);
		for (String string : sset) {
			System.out.println(string);
		}

		Iterator<String> iter =   sset.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println(sset);
		
		Set<Car> mySet = new HashSet<>();
		mySet.add(new Car("Å¸ÀÌÄ­", 200));
		mySet.add(new Car("Å¸ÀÌÄ­", 200));
		
		System.out.println(mySet);
	}

}
