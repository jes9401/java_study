package day04;

public class Goods {
	private String name;
	private int price, countStock, countSold;
	
	public Goods() {
	}
	public Goods(String name, int Price, int countStock,int countSold) {
		this.name=name;
		this.price=Price;
		this.countStock=countStock;
		this.countSold=countSold;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	@Override
	public String toString() {
		return "상품이름:" + name + "\n상품가격:" + price + "\n재고수량:" + countStock + "\n팔린수량:" + countSold
				;
	}
	
	

}
