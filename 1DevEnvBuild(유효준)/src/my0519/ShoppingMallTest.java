package my0519;

public class ShoppingMallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//      사람은 tv를 구매할수 있다
//      사람은 com을 구매할 수 있다
//      컴퓨터는 200원이다
		
		Com com = new Com();
		Tv tv = new Tv();
		
		Buyer buyer1 = new Buyer();
		
		buyer1.buyerName = "박상욱";
		buyer1.poket();
		buyer1.buyTv(tv);
		
		System.out.println(buyer1.buyerName+ " 님의 " + "현재 남은 돈은" 
				+buyer1.money+ " 원 입니다.");
		System.out.println("현재 남은 보너스 포인트는" 
				+ buyer1.bonusPoint + " 원 입니다.");
		buyer1.poket();
		buyer1.buyCom(com);
		System.out.println(buyer1.buyerName+ " 님의 " + "현재 남은 돈은" 
				+buyer1.money+ " 원 입니다.");
		System.out.println("현재 남은 보너스 포인트는" 
				+ buyer1.bonusPoint + " 원 입니다.");
		buyer1.poket();
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		
		Buyer buyer2 = new Buyer();
		
		buyer2.buyerName = "박미영";
		buyer2.poket();
		buyer2.buyTv(tv);
		
		System.out.println(buyer2.buyerName+ " 님의 " + "현재 남은 돈은" 
				+buyer2.money+ " 원 입니다.");
		System.out.println("현재 남은 보너스 포인트는" 
				+ buyer2.bonusPoint + " 원 입니다.");
		buyer2.poket();
		buyer2.buyCom(com);
		System.out.println(buyer2.buyerName+ " 님의 " + "현재 남은 돈은" 
				+buyer2.money+ " 원 입니다.");
		System.out.println("현재 남은 보너스 포인트는" 
				+ buyer2.bonusPoint + " 원 입니다.");
		buyer2.poket();
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		Buyer buyer3 = new Buyer();
		
		buyer3.buyerName = "김태윤";
		buyer3.poket();
		buyer3.buyTv(tv);
		
		System.out.println(buyer3.buyerName+ " 님의 " + "현재 남은 돈은" 
				+buyer3.money+ " 원 입니다.");
		System.out.println("현재 남은 보너스 포인트는" 
				+ buyer3.bonusPoint + " 원 입니다.");
		buyer3.poket();
		buyer3.buyCom(com);
		System.out.println(buyer3.buyerName+ " 님의 " + "현재 남은 돈은" 
				+buyer3.money+ " 원 입니다.");
		System.out.println("현재 남은 보너스 포인트는" 
				+ buyer3.bonusPoint + " 원 입니다.");
		buyer3.poket();
		
		
	}

}
