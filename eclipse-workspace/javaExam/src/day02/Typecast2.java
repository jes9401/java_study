package day02;

public class Typecast2 {

	public static void main(String[] args) {
		byte b;
		int i = 414;
		float f = 123.456f;
		
		b=(byte)i;
		System.out.println("int 414를 byte로 변환 : " + b);
		// -98
		i=(int)f;
		System.out.println("float 123.456을 int로 변환 : " + i);
		// 123
		b=(byte)f;
		System.out.println("float 123.456을 byte로 변환 : " + b);
		// 123
	}

}
