package ch7.polyExam.main;

import ch7.polyExam.customer.Customer;
import ch7.polyExam.product.Book;
import ch7.polyExam.product.Computer;
import ch7.polyExam.product.SmartPhone;
import ch7.polyExam.product.Tv;

// 다형성 활용 -> 메서드 매개변수
public class PolyArgumentTest {
	
//	6명의 고객
//	서로 다른 이름, 소지금액
//	모두 스마트폰을 구입
//	
//	3명의 고객이 존재
//	서로 다른 이름, 소지 금액
//	이 3명은 모두 Tv를 구입
//	
//	4명의 고객들은 컴퓨터와 책을 함께 구매
//	서로 다른 이름과 소지금액
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		6명의 고객
//		서로 다른 이름, 소지금액
//		모두 스마트폰을 구입
		
		Customer[] customerSmartPhoneArr = new Customer[6];
		Customer[] customerTvArr = new Customer[4];
		Customer[] customerOtherArr = new Customer[3];
//		Customer customer2 = new Customer("고객1", 1000);
//		Customer customer2 = new Customer("고객2", 1200);
//		Customer customer3 = new Customer("고객3", 1400);
//		Customer customer4 = new Customer("고객4", 1600);
//		Customer customer5 = new Customer("고객5", 1800);
//		Customer customer6 = new Customer("고객6", 2000);
		//사람의 이름에게는 패턴이 없기에 하나씩 만들어햐 한다.
		
		
		String[] customerNameArr = new String[]{"손진원","조남용","임찬우"
				,"이경준","박미영","김태윤",};
	    
		String customerName = "";
		int money = 0;
		
		
		
//		for (int i = 0; i < customerTvArr.length; i++) {
//			System.out.println(customerTvArr[i]);
//		}
		
		Tv tv = new Tv();
		Computer com = new Computer();
		SmartPhone smartPhone = new SmartPhone();
		Book book = new Book();
		
		for (int i = 0; i < customerSmartPhoneArr.length; i++) {
			customerName = customerNameArr[i];
			money = 1000 + (i * 200);
			customerSmartPhoneArr[i] = new Customer(customerName, money);
		}
		
		for (int i = 0; i < customerSmartPhoneArr.length; i++) {
			customerSmartPhoneArr[i].buyProduct(smartPhone);
			System.out.println(customerSmartPhoneArr[i].getCustomerMoneyInfo());
			customerSmartPhoneArr[i].useProduct();
		}
/*		
		for (int i = 0; i < customerSmartPhoneArr.length; i++) {
			System.out.println(customerSmartPhoneArr[i]);
		}
*/		
		//===================================================
		for (int i = 0; i < customerTvArr.length; i++) {
			customerName = customerNameArr[i];
			money = 1000 + (i * 200);
			customerTvArr[i] = new Customer(customerName, money);
		}
		
		for (int i = 0; i < customerTvArr.length; i++) {
			customerTvArr[i].buyProduct(tv);
			System.out.println(customerTvArr[i].getCustomerMoneyInfo());
			customerTvArr[i].useProduct();
		}
/*		
		for (int i = 0; i < customerTvArr.length; i++) {
			System.out.println(customerTvArr[i]);
		}
*/		
		//==============================================
		
		for (int i = 0; i < customerOtherArr.length; i++) {
			customerName = customerNameArr[i];
			money = 1000 + (i * 200);
			customerOtherArr[i] = new Customer(customerName, money);
		}
		
		
		
		for (int i = 0; i < customerOtherArr.length; i++) {
			customerOtherArr[i].buyProduct(book);
			customerOtherArr[i].buyProduct(com);
			System.out.println(customerOtherArr[i].getCustomerMoneyInfo());
			customerOtherArr[i].useProduct();
		}
/*		
		for (int i = 0; i < customerOtherArr.length; i++) {
			System.out.println(customerOtherArr[i]);
		}
*/		
		
		
//		customer1.buyProduct(smartPhone);
//		System.out.println(customer1);
//		customer1.useProduct();
//		
//		customer2.buyProduct(smartPhone);
//		System.out.println(customer2);
//		customer2.useProduct();
//		
//		customer3.buyProduct(smartPhone);
//		System.out.println(customer3);
//		customer3.useProduct();
//		
//		customer4.buyProduct(smartPhone);
//		System.out.println(customer4);
//		customer4.useProduct();
//		
//		customer5.buyProduct(smartPhone);
//		System.out.println(customer5);
//		customer5.useProduct();
//		
//		customer6.buyProduct(smartPhone);
//		System.out.println(customer6);
//		customer6.useProduct();
		
//		Customer customer7 = new Customer("고객7", 2600);
//		Customer customer8 = new Customer("고객8", 2800);
//		Customer customer9 = new Customer("고객9", 3000);
//		
//		customer7.buyProduct(tv);
//		System.out.println(customer7);
//		customer7.useProduct();
//		
//		customer8.buyProduct(tv);
//		System.out.println(customer8);
//		customer8.useProduct();
//		
//		customer9.buyProduct(tv);
//		System.out.println(customer9);
//		customer9.useProduct();
//		
//		Customer customer10 = new Customer("고객10", 3200);
//		Customer customer11 = new Customer("고객11", 3400);
//		Customer customer12 = new Customer("고객12", 3600);
//		Customer customer13 = new Customer("고객13", 4000);
//		
//		customer10.buyProduct(book);
//		customer10.buyProduct(com);
//		System.out.println(customer10);
//		customer10.useProduct();
//		
//		customer11.buyProduct(book);
//		customer11.buyProduct(com);
//		System.out.println(customer11);
//		customer11.useProduct();
//		
//		customer12.buyProduct(book);
//		customer12.buyProduct(com);
//		System.out.println(customer12);
//		customer12.useProduct();
//		
//		customer13.buyProduct(book);
//		customer13.buyProduct(com);
//		System.out.println(customer13);
//		customer13.useProduct();
		
	}
		

}
