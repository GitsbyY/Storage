package ch7.polyExam.product;

public class Book extends Product{

	public Book() {
		super(1);
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("책을 읽는 중");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Book";
	}
	
}
