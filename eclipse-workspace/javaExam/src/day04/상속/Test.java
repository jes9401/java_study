package day04.���;

public class Test {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println(c.i);
		System.out.println(c.getI());
		c.print();
		
		Parent p = new Child();
		//�θ�� �ڽ��� ����ų �� ����
		Object obj = new Child();
		
//		Child c2 = new Parent();
//		Child c3 = p;
//		//�ݴ� ���� �ȵ�
		
		System.out.println(p.i);
		//�ʵ�� �������̵� �Ǹ� Ÿ���� ������
		
		System.out.println(p.getI());
		//�޼���� �������̵� �Ǹ� ������ �ڽ� �޼��� ����
		
//		p.print(); //�ڽ� �޼��忡�� �־ ��� �Ұ�
		((Child)p).print();
		//����ȯ�ϸ� ��밡��
	}
}
