package day06;
class Box2<E>{
	private E obj;

	public E getObj() {
		return obj;
	}

	public void setObj(E obj) {
		this.obj = obj;
	}	
}
public class Test2 {

	public static void main(String[] args) {
		Box2<String> b = new Box2<>(); 
		b.setObj("ssdfd");
//		b.setObj(10);
	}

}
