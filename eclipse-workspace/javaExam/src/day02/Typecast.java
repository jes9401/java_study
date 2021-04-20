package day02;

public class Typecast {

	String stNumber;
	String stName;
	boolean isEnrolled;
	char grade;
	String address;
	String major;
	int unit;
	boolean haveMinor;
	long juminNo;
	String cellphone;
	int age;
	String email;
	public static void main(String[] args) {
		byte b = 25;
		short s = b;
		int i = s;
		long l = i;
		float f = i;
		double d = f;
		
		byte b_1=127;
		//byte´Â -128~127
		
		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		
		System.out.println("f = " + f);
		System.out.println("d = " + d);
		System.out.println("b_1 = " + b_1);
		
	}

}
