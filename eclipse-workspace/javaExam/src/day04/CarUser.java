package day04;

public class CarUser {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = new Car();
		c.setName("Ƽ��");
		//c.name="Ƽ��";
		c.setSpeed(200);
		//c.speed=200;
		c.������="���";
		c2.������="����";
		c2.setName("�׷���");
		c2.setSpeed(100);
		int speed = c.getSpeed();
//		System.out.println(speed);
		System.out.println("�� �̸��� "+c.name+"�Դϴ�.");
		System.out.println("�� �ӵ��� "+c.speed+"�Դϴ�.");
		System.out.println("������� "+c.������+"�Դϴ�.");
	
		System.out.println("�� �̸��� "+c2.name+"�Դϴ�.");
		System.out.println("�� �ӵ��� "+c2.speed+"�Դϴ�.");
		System.out.println("������� "+c2.������+"�Դϴ�.");
		
		c.������="�׽�Ʈ";
		System.out.println(c.������);
	}

}
