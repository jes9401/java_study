package day06;

public class StringEx {
	public static String midStr(String s) {
		int temp = (s.length() / 2);
		if (s.length() % 2 == 0) {
			return s.substring(temp - 1, temp + 1);
		} else {
			return s.substring(temp, temp + 1);
		}
	}

	public static String reverseString(String s) {
		String result = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			result += s.charAt(i);
		}
		return result;
	}

	public static String convertString(String s) {
		String result = "";
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (Character.isUpperCase(c) == true) {
				result += Character.toLowerCase(c);
			} else {
				result += Character.toUpperCase(c);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(StringEx.midStr("abcd")); // bc
		System.out.println(StringEx.midStr("abcde")); // c
		System.out.println(StringEx.reverseString("abcdef")); // fedcba
		System.out.println(StringEx.convertString("aBcd")); // AbCD
	}
}
