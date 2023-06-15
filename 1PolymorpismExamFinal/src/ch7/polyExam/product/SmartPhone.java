package ch7.polyExam.product;

public class SmartPhone extends Product{

	public SmartPhone() {
		super(70);
	}
	
	public String use(){
		String use = "폰 사용 중";
	    return use;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SmartPhone";
	}
}
