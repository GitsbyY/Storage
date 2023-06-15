package ch7.polyExam.main;

import java.util.Scanner;

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
		
		Customer customer1 = new Customer();
//		
		Scanner scan = new Scanner(System.in);
		
	    int choice = 0;
		Com com = new Com();
		Book book = new Book();
		Tv tv = new Tv();
		SmartPhone sp = new SmartPhone();
		
		System.out.println("구매 할 물건의 번호를 입력하세요");
		System.out.println("1번 tv");
		System.out.println("2번 컴퓨터");
		System.out.println("3번 스마트폰");
		System.out.println("4번 책");
		choice = scan.nextInt();
		if(choice == 1) {
			customer1.buy(tv);
			System.out.println(customer1);
			System.out.println();
			System.out.println(tv.use());
		}else if(choice ==2) {
			customer1.buy(com);
			System.out.println(customer1);
			System.out.println();
			System.out.println(com.use());
		}else if(choice ==3) {
			customer1.buy(sp);
			System.out.println(customer1);
			System.out.println();
			System.out.println(sp.use());
		}else if(choice ==4) {
			customer1.buy(book);
			System.out.println(customer1);
			System.out.println();
			System.out.println(book.use());
		}
		scan.close();
		
//		customer1.buy(tv);
//		System.out.println(customer1);
//		System.out.println();
//		System.out.println("고객이름: "+ buyer1.BuyerName);
//		System.out.println("현재 남은 돈은 " + customer1.money + "만원입니다");
//		System.out.println("현재 보너스 점수는 "
//				+ customer1.bonusPoint + "점입니다");
//		System.out.println();
		
		
//		customer1.buy(com);
//		System.out.println();
//		System.out.println("고객이름: "+ buyer2.BuyerName);
//		System.out.println("현재 남은 돈은 " + customer1.money + "만원입니다");
//		System.out.println("현재 보너스 점수는 "
//				+ customer1.bonusPoint + "점입니다");
		
//		System.out.println();
		
		
/*		customer1.buy(book);
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
*/		
		
		
		
	}

}
