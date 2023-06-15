package ezen2.one;

public class Tv extends Product{
	
	public Tv(){
		super(100);
	}
	
	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("tv 시청 중");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tv";
	}
	
}
