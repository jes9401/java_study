package day02;

class Parent{
	
}
class Child extends Parent{
	
}
public class Test2 {

	public static void main(String[] args) {
		Parent p = new Parent();
		Child c = new Child();
//		c=p;
		p=c;
		Parent p2=c;
		//p2�� Parent Ÿ�������� Child�� �����ϰ�����
		Child c2=(Child)p2;
		
		p2=new Parent();
		//p2�� Parent�� ����
		Child c3 = (Child)p2;	
		//������ ������ ������ ���� �� ����
		
		if(p2 instanceof Child) {
			Child c4 = (Child)p2;
		}
	}

}
