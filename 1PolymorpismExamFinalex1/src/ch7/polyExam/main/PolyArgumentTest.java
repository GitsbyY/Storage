package ch7.polyExam.main;

import ch7.polyExam.customer.Customer;
import ch7.polyExam.product.Book;
import ch7.polyExam.product.Com;
import ch7.polyExam.product.SmartPhone;
import ch7.polyExam.product.Tv;

public class PolyArgumentTest {
	
	public PolyArgumentTest() {
		
	}
	
	public static void main(String[] args) {
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
		
		Customer customer1 = new Customer("손진원",1000);
//		Customer customer2 = new Customer("조남용",1000);
//		Customer customer3 = new Customer("임찬우",1000);
//		Customer customer4 = new Customer("유효준",999);
		
		Com com = new Com();
		Book book = new Book();
		Tv tv = new Tv();
		SmartPhone sp = new SmartPhone();
		
	
		customer1.buy(tv);
		System.out.println(customer1);
		System.out.println();
//		System.out.println("고객이름: "+ buyer1.BuyerName);
//		System.out.println("현재 남은 돈은 " + customer1.money + "만원입니다");
//		System.out.println("현재 보너스 점수는 "
//				+ customer1.bonusPoint + "점입니다");
//		System.out.println();
		
		
		customer1.buy(com);
//		System.out.println();
//		System.out.println("고객이름: "+ buyer2.BuyerName);
		System.out.println("현재 남은 돈은 " + customer1.money + "만원입니다");
		System.out.println("현재 보너스 점수는 "
				+ customer1.bonusPoint + "점입니다");
		
		System.out.println();
		
		
		customer1.buy(book);
//		System.out.println();
//		System.out.println("고객이름: "+ buyer3.BuyerName);
		System.out.println("현재 남은 돈은 " + customer1.money + "만원입니다");
		System.out.println("현재 보너스 점수는 "
				+ customer1.bonusPoint + "점입니다");
		
		System.out.println();
		
		customer1.buy(sp);
//		System.out.println();
//		System.out.println("고객이름: "+ buyer4.BuyerName);
		System.out.println("현재 남은 돈은 " + customer1.money + "만원입니다");
		System.out.println("현재 보너스 점수는 "
				+ customer1.bonusPoint + "점입니다");
		
		System.out.println();
		
		
		
		
	}

}
