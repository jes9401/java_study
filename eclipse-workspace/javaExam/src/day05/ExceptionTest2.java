package day05;
import java.io.IOException;
import java.lang.*;

public class ExceptionTest2 {
	public static void main(String[] args) {
		int a = 1;
		double b;
		try {
			b=100/a;
			int[] iarr= {1,2,3};
			System.out.println(iarr[3]);
		}
		catch(ArithmeticException e) {
			System.out.println("error : "+e);
		}
		catch(ArrayIndexOutOfBoundsException e2) {
			System.out.println("error : "+e2);
			e2.printStackTrace();
		}
		catch(Exception e){
			System.out.println(e);
			System.out.println("에러 모름");
		}
		finally {
			System.out.println("무조건 실행");
		}
		System.out.println("hh");
	}
}
