package day06;

public class Car {
	String name, ������;
	int speed;
	public Car(String name, int speed, String ������) {
		this.name=name;
		this.speed=speed;
		this.������=������;
	}
	public Car(String name, int speed) {
		this.name=name;
		this.speed=speed;
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", ������=" + ������ + ", speed=" + speed + "]";
	}
	
	
}
