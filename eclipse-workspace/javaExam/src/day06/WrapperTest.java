package day06;

public class WrapperTest {
	public static void inputObject(Object obj) {
		System.out.println("°´Ã¼¸¸");
		System.out.println(obj.getClass());
	}

	public static void main(String[] args) {
		int i = 10;
		inputObject(i);
		
		Integer ii=10;
		int result = ii.intValue()+1;
		System.out.println(result);
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
	}
}
