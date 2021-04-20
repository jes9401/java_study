package day05;

public abstract class Shape implements Drawable{	//추상 클래스
	//추상 메서드 선언, 추상 메서드가 하나라도 있으면 추상 클래스
	public abstract double calculateArea();
	public abstract void draw();
	
}
