package day06;
class Box{
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}
public class Test {

	public static void main(String[] args) {
		Box box = new Box();
		box.setObj(new Circle(0, 0, 3));

		Circle c = (Circle)box.getObj();
	}

}
