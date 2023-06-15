package one;

public class Buyer { // 물건 사는 사람

	int money = 1000; // 소유금액
	int bonusPoint = 0;
	
	
	
	void buyTv(Tv tv) {
		
		if(money < tv.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}
		
		money = money - tv.price;
		bonusPoint = bonusPoint + tv.bonusPoint;
		
		String resultStr = "";
		resultStr = tv.productName();
		resultStr = resultStr + "을/를 구입하였습니다.";
		
		System.out.println(resultStr);
	}
	
	void buyCom(Com com) {
		
		if(money < com.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}
		
		money = money - com.price;
		bonusPoint = bonusPoint + com.bonusPoint;
		
		String resultStr = "";
		resultStr = com.productName();
		resultStr = resultStr + "을/를 구입하였습니다.";
		
		System.out.println(resultStr);
	}
}
