package day02;

public class Swap {

	public static void main(String[] args) {
		int n1=10;
		int n2=30;
		int temp=0;
		if(n1<n2) {
			temp=n1;
			n1=n2;
			n2=temp;
		}
		System.out.println("n1 : "+n1);
		System.out.println("n2 : "+n2);
		
		int a1=20;
		int a2=10;
		int a3=5;
		if(a1>=a2) {
			if(a2>a3) {
				System.out.println("a1�� �ִ밪�Դϴ�.");
			}
		}else {
			System.out.println("a1("+a1+")�� a2("+a2+")���� �۽��ϴ�.");
		}
	}

}
