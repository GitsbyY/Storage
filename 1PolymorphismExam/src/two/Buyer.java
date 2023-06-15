package two;

public class Buyer { // 물건 사는 사람

//	int money = 1000; // 소유금액
	int bonusPoint = 0;
	int money = 0;
	String buyerName = "";
	
	
	void poket() {
		System.out.println();
		System.out.println("현재 소지하고 계신 금액은 " + money + " 입니다.");
		System.out.println();
	}
	
	int money() {
		return money;
	}
/*	
	void buyerC(String buyerName, int money, int bounusPoint) {
		this.buyerName = buyerName;
		this.money = money;
		this.bonusPoint = bounusPoint;
		System.out.println(buyerName + " 회원님의 사용금액은" + money 
				+ "원 입니다. 적립 된 포인트는 " + bounusPoint + " 점 입니다."  );
	}
*/	
	void buyer() {
		System.out.println(buyerName + " 님의 " + " 소지금액은 " + money + "이고"
				+ " bonusPoint는 " + bonusPoint + " 입니다." );		
	}
	
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
	
	void buyBook(Book book) {
		
		if(money < book.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}
		
		money = money - book.price;
		bonusPoint = bonusPoint + book.bonusPoint;
		
		String resultStr = "";
		resultStr = book.productName();
		resultStr = resultStr + "을/를 구입하였습니다.";
		
		System.out.println(resultStr);
	}
}
