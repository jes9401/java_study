package day06;

public class StringExam {

	public static void main(String[] args) {
		String str = "abc";
		String str2 = "abc";
		String str3 = new String("abc");
		String str4 = new String("abc");

		System.out.println(str==str2);
		System.out.println(str.equals(str3));
		System.out.println(str.equals(str4));
		System.out.println(str.concat("def"));
		//값을 대입을해줘야 변경됨
		System.out.println(str);
		System.out.println(str2);
		
		int i = 20;
		String s = i+"";
		
		String h = "Hello Java!";
		System.out.println(h.charAt(0));
		for(int j=0;j<h.length();j++) {
			System.out.print(h.charAt(j)+" ");
		}
		System.out.println();
		System.out.println(str.toUpperCase().charAt(0));
		String test = new String("test").toUpperCase();
		System.out.println(test);
		
		String ss=h.toUpperCase();
		System.out.println(ss);
		System.out.println(h.concat("??"));
		System.out.println("!".concat(ss).concat("@"));
		System.out.println(ss.charAt(0));
	}

}
