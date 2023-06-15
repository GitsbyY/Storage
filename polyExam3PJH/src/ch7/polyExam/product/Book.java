package ch7.polyExam.product;

public class Book extends Product {
	public Book() {
		super(1); // Tv의 가격을 100만원으로 한다.
	}

	public void use() {
		System.out.println("책을 읽는 중\n");
	}
	
	public String toString() { // Object클래스의 toString()을 오버라이딩한다.
		return "Book";
	}
}
