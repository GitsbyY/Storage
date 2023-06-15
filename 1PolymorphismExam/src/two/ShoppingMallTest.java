package two;

public class ShoppingMallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      사람은 tv를 구매할수 있다
//      사람은 com을 구매할 수 있다
//      사람은 book을 구매할 수 있다
//      컴퓨터는 200원이다
//		book 30원이다
		
//		사람은 3 사람 존재한다
//		각각 한 사람은 티비
//		다른 사람은 컴
//		다른 사람은 책을 구매한다
//		사람에게는 이름이 존재한다
//		서로 다른 금액을 부여하시요
      
		Com com = new Com();
		Tv tv = new Tv();
		Book book = new Book();
		Buyer buyer1 = new Buyer();
//		Buyer buyer9 = new Buyer();
//		buyer9.buyerC("임찬우", 9999999, 357);
		
		
		buyer1.buyerName = "박성욱";
		buyer1.money = 10000;
		buyer1.buyer();
		buyer1.buyTv(tv);
		
		System.out.println(buyer1.buyerName+ " 님의 " + "현재 남은 돈은" 
				+buyer1.money+ " 원 입니다.");
		System.out.println("현재 남은 보너스 포인트는" 
				+ buyer1.bonusPoint + " 원 입니다.");
		buyer1.buyer();
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		
		Buyer buyer2 = new Buyer();
		
		buyer2.buyerName = "박미영";
		buyer2.money = 5000;
		buyer2.buyer();
		
		buyer2.buyCom(com);
		System.out.println(buyer2.buyerName+ " 님의 " + "현재 남은 돈은" 
				+buyer2.money+ " 원 입니다.");
		System.out.println("현재 남은 보너스 포인트는" 
				+ buyer2.bonusPoint + " 원 입니다.");
		buyer2.buyer();
		
		System.out.println();
		System.out.println("================================");
		System.out.println();
		
		Buyer buyer3 = new Buyer();
		
		buyer3.buyerName = "김태윤";
		buyer3.money = 9876;
		buyer3.buyer();
		buyer3.buyBook(book);
		
		System.out.println(buyer3.buyerName+ " 님의 " + "현재 남은 돈은" 
				+buyer3.money+ " 원 입니다.");
		System.out.println("현재 남은 보너스 포인트는" 
				+ buyer3.bonusPoint + " 원 입니다.");
		buyer3.buyer();
		
		
	}

}
