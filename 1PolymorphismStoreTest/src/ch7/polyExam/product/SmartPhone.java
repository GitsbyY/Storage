package ch7.polyExam.product;

public class SmartPhone extends Product{

	public SmartPhone() {
		super(70);
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("폰 사용 중");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SmartPhone";
	}
	
}
