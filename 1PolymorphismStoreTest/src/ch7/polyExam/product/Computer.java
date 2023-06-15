package ch7.polyExam.product;

public class Computer extends Product{

	public Computer() {
		super(200);
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("com을 사용 중");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Computer";
	}
	
}
