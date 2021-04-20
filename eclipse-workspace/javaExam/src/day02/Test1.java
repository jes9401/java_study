package day02;

public class Test1 {

	public static void main(String[] args) {
		int i = 10;	//변수 선언+초기화
		int j;		
		j=10;
		System.out.println(i);
		System.out.println(j);
		j=20;
		System.out.println(j);
//		j="hello";
		String str = "hello";
		System.out.println(str);
		
		byte b=100;
		j=b;
		System.out.println(j);
//		b=j; byte는 크기가 1바이트, int는 4바이트라 형변환 불가
		b=(byte)j; //명시적으로 형변환 가능
		char c = 'a'; 
		int k =c;	//a의 아스키코드값 97

		System.out.println(k);
		float f = 10.0f;
//		long l = f; 
		
	}

}
