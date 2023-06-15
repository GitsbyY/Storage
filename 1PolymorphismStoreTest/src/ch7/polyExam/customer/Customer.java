package ch7.polyExam.customer;

import ch7.polyExam.product.Book;
import ch7.polyExam.product.Computer;
import ch7.polyExam.product.Product;
import ch7.polyExam.product.SmartPhone;
import ch7.polyExam.product.Tv;

public class Customer { // 물건 사는 사람

	public int money = 1000; // 소유금액
	public int bonusPoint = 0;
	//제품 하나를 비어있는 상태로 해 놓았기 때문에 하나를 받을 수 있다
	public Product product = null;

	public Customer() {

	}

	public void buy(Product product) {

		if (money < product.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다");
			return;
		}

		money = money - product.price;
		bonusPoint = bonusPoint + product.bonusPoint;
		System.out.println(product + "을/를 구입하였습니다.");
		this.product = product;
	
	}

	public void useProduct() {
		//instanceof -> 
		if (product instanceof Book) {
			Book book = (Book) product;

			book.use();
		} else if (product instanceof Computer) {
			Computer com = (Computer) product;

			com.use();
		} else if (product instanceof SmartPhone) {
			SmartPhone smartPhone = (SmartPhone) product;

			smartPhone.use();
		} else if (product instanceof Tv) {
			Tv tv = (Tv) product;
			
			tv.use();
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String str = "";

		str = "현재 남은 돈은 " + money + "만원입니다.\n" + "현재 보너스 점수는 " + bonusPoint + "점입니다.";

		return str;
	}
}
