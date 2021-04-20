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
		//p2는 Parent 타입이지만 Child를 참조하고있음
		Child c2=(Child)p2;
		
		p2=new Parent();
		//p2는 Parent를 참조
		Child c3 = (Child)p2;	
		//컴파일 에러는 없지만 실행 시 에러
		
		if(p2 instanceof Child) {
			Child c4 = (Child)p2;
		}
	}

}
