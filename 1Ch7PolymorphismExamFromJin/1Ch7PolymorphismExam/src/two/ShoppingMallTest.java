package two;

public class ShoppingMallTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		사람은 tv구매가가능하다
//		사람은 com구매가가능하다
//		com은 200원이다
//		사람은 책도 구매가가능하다
//		책은 30원이다
//		사람은 3사람 존재한다
//		각각 한사람은 tv
//		다른사람은 com
//		다른사람은 책을 구매한다
//		사람에게는 이름이 존재한다
//		서로다른 소지금액을 부여하시오
		
		Buyer buyer1 = new Buyer("손진원",2000);
		Buyer buyer2 = new Buyer("조남용",500);
		Buyer buyer3 = new Buyer("임찬우",20);
		Com com = new Com();
		Book book = new Book();
		Tv tv = new Tv();
		
	
		buyer1.buyTv(tv);
		System.out.println();
		System.out.println("고객이름: "+ buyer1.BuyerName);
		System.out.println("현재 남은 돈은 " + buyer1.money + "원입니다");
		System.out.println("현재 보너스 점수는 "
				+ buyer1.bonusPoint + "점입니다");
		System.out.println();
		
	
		buyer2.buyCom(com);
		System.out.println();
		System.out.println("고객이름: "+ buyer2.BuyerName);
		System.out.println("현재 남은 돈은 " + buyer2.money + "원입니다");
		System.out.println("현재 보너스 점수는 "
				+ buyer1.bonusPoint + "점입니다");
		
		System.out.println();
		
		
		buyer3.buyBook(book);
		System.out.println();
		System.out.println("고객이름: "+ buyer3.BuyerName);
		System.out.println("현재 남은 돈은 " + buyer3.money + "원입니다");
		System.out.println("현재 보너스 점수는 "
				+ buyer3.bonusPoint + "점입니다");
		
		System.out.println();
		
		
		
		
	}

}
