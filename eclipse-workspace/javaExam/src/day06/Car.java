package day06;

public class Car {
	String name, 제조사;
	int speed;
	public Car(String name, int speed, String 제조사) {
		this.name=name;
		this.speed=speed;
		this.제조사=제조사;
	}
	public Car(String name, int speed) {
		this.name=name;
		this.speed=speed;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", 제조사=" + 제조사 + ", speed=" + speed + "]";
	}
	
	
}
