package day02;

public class Test1 {

	public static void main(String[] args) {
		int i = 10;	//���� ����+�ʱ�ȭ
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
//		b=j; byte�� ũ�Ⱑ 1����Ʈ, int�� 4����Ʈ�� ����ȯ �Ұ�
		b=(byte)j; //��������� ����ȯ ����
		char c = 'a'; 
		int k =c;	//a�� �ƽ�Ű�ڵ尪 97

		System.out.println(k);
		float f = 10.0f;
//		long l = f; 
		
	}

}
