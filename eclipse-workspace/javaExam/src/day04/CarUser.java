package day04;

public class CarUser {

	public static void main(String[] args) {
		Car c = new Car();
		Car c2 = new Car();
		c.setName("티코");
		//c.name="티코";
		c.setSpeed(200);
		//c.speed=200;
		c.제조사="기아";
		c2.제조사="현대";
		c2.setName("그랜져");
		c2.setSpeed(100);
		int speed = c.getSpeed();
//		System.out.println(speed);
		System.out.println("차 이름은 "+c.name+"입니다.");
		System.out.println("차 속도는 "+c.speed+"입니다.");
		System.out.println("제조사는 "+c.제조사+"입니다.");
	
		System.out.println("차 이름은 "+c2.name+"입니다.");
		System.out.println("차 속도는 "+c2.speed+"입니다.");
		System.out.println("제조사는 "+c2.제조사+"입니다.");
		
		c.제조사="테스트";
		System.out.println(c.제조사);
	}

}
