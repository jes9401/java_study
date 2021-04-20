package day06;

public class StringBufferedTest {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		System.out.println(sb.append("def"));
		sb.insert(1, "my");
		System.out.println(sb);
		sb.setLength(5);
		System.out.println(sb);
	}
}
