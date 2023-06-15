package ch7.polyExam.product;

public class Book extends Product{

	public Book() {
		super(1);
		
	}
	
	public String use(){
		String use = "책을 읽는 중";
	    return use;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "book";
	}
}
