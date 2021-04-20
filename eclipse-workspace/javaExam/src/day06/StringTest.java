package day06;

public class StringTest {
	public static void main(String[] args) {
		String s = new String("aBcAbCabcABC");

		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.length());
		System.out.println(s.replace("a", "R"));
		System.out.println(s.replace("abc", "123"));
		System.out.println(s.substring(0, 3));
		System.out.println(s.toUpperCase());
	}
}
