package one;

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
      
		Buyer buyer1 = new Buyer();
		
		Tv tv = new Tv();
		
		buyer1.buyTv(tv);
		
		System.out.println("현재 남은 돈은 " + buyer1.money + "원입니다");
		System.out.println("현재 보너스 점수는 "
				+ buyer1.bonusPoint + "점입니다");
		
		System.out.println();
		
		
		Com com = new Com();
		
		buyer1.buyCom(com);
		
		System.out.println("현재 남은 돈은 " + buyer1.money + "원입니다");
		System.out.println("현재 보너스 점수는 "
				+ buyer1.bonusPoint + "점입니다");
		
	}

}
