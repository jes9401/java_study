package day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		Map<String, Car> map = new HashMap<>();
		map.put("타이칸", new Car("타이칸", 200));
		map.put("티코", new Car("티코", 200));
		map.put("그랜져", new Car("그랜져", 200));
		map.put("다마스", new Car("다마스", 200));
		map.put("타이칸", new Car("타이칸2", 0));
		
		System.out.println(map.get("타이칸"));
		System.out.println("---------------------");
		Set<String> keys = map.keySet();
		
		for (String key : keys) {
			System.out.println(map.get(key));
		}
		
	}

}
