package day06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test4 {

	public static void main(String[] args) {
		Map<String, Car> map = new HashMap<>();
		map.put("Ÿ��ĭ", new Car("Ÿ��ĭ", 200));
		map.put("Ƽ��", new Car("Ƽ��", 200));
		map.put("�׷���", new Car("�׷���", 200));
		map.put("�ٸ���", new Car("�ٸ���", 200));
		map.put("Ÿ��ĭ", new Car("Ÿ��ĭ2", 0));
		
		System.out.println(map.get("Ÿ��ĭ"));
		System.out.println("---------------------");
		Set<String> keys = map.keySet();
		
		for (String key : keys) {
			System.out.println(map.get(key));
		}
		
	}

}
