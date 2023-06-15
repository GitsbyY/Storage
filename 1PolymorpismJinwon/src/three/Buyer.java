package three;

public class Buyer { // 물건 사는 사람

	int money = 0; // 소유금액
	int bonusPoint = 0;
	String BuyerName = "";
	
	
	Buyer(String a , int b){
		this.BuyerName = a;
		this.money = b;
	}

	void buy(Product product) {
		
		if(money < product.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}
		
		money = money - product.price;
		bonusPoint = bonusPoint + product.bonusPoint;
		
		String resultStr = "";
		resultStr = product.toString();
		resultStr = resultStr + "을/를 구입하였습니다.";
		
		System.out.println(resultStr);
	}
	
}
