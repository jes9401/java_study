package day05;

public class ArrayException {
public static void main(String[] args) {
	int[] intArray = new int[5];
	intArray[0]=0;
	for(int i=0;i<5;i++) {
		try {
			intArray[i+1]=i+1+intArray[i]; //4�� ��� ����

		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("intArray�� 0~4��°�� ����");
		}
		finally {
			System.out.println("intArray["+i+"] ="+intArray[i]);
		}
		
	}
}
}
