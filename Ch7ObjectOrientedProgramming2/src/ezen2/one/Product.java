package ezen2.one;

public class Product {
	
	public int price = 0;	 //제품의 가격
	public int bonusPoint = 0; // 제품구매 시 제공하는 보너스 점수
	
	public Product(int price) {
		
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	public void use() {
		System.out.println("사용 중");
	}
}
