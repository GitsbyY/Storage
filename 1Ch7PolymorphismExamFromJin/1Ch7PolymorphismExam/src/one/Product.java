package one;

public class Product {
	
	int price = 0;	 //제품의 가격
	int bonusPoint = 0; // 제품구매 시 제공하는 보너스 점수
	
	public Product(int price) {
		
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}
