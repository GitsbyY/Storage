package ch7.polyExam.product;

public class Tv extends Product{
	
	public Tv(){
		super(100);
	}
	
	public String use(){
		String use = "tv 시청 중";
	    return use;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "tv";
	}
}
