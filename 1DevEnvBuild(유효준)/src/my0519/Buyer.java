package my0519;

public class Buyer {//물건 사는 사람
	
	int money = 1000;//소유금액
	int bonusPoint = 0;
	String buyerName = "";
	void poket() {
		System.out.println();
		System.out.println("현재 소지하고 계신 금액은 " + money + " 입니다.");
		System.out.println();
	}
	
	void buyTv(Tv tv) {
		
		if(money < tv.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money = money - tv.price;
		bonusPoint = bonusPoint + tv.bonusPoint;
		
		String resultStr ="";
		resultStr = tv.productName();
		resultStr = resultStr + "을/를 구입하였습니다.";
		
		System.out.println(resultStr);
		
		
	}
	
	void buyCom(Com com) {
		
		if(money < com.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money = money - com.price;
		bonusPoint = bonusPoint + com.bonusPoint;
		
		String resultStr ="";
		resultStr = com.productName();
		resultStr = resultStr + "을/를 구입하였습니다.";
		
		System.out.println(resultStr);
		
		
	}
	
}
