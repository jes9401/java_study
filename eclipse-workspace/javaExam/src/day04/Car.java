package day04;

public class Car {
	int speed;
	String name;
	static String 제조사;
	// 접근제한자 리턴타입 메소드명(매개변수들)
	public void setName(String name) {
		this.name = name;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}
}
