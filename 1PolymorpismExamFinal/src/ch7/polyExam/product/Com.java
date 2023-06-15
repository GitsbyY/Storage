package ch7.polyExam.product;

public class Com extends Product{

	public Com() {
		super(200);
	}
	
	public String use(){
		String use = "com을 사용 중";
	    return use;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "com";
	}
}
