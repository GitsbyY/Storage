package one;

public class Rabbit implements Animal {

// 다리가 있다
	
// 입이 있다
	
// 강아지는 멍멍 짖는다
	
// 토끼는 힝 힝 운다.
	
	String leg = "4발";
	String mouth = "입";
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println(leg +"로 걷지는 못한다.");
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(leg + "로 달린다.");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(mouth +"으로 냠냠 먹는다.");
	}
	
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println(mouth +"으로 힝 힝 운다.");
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("토끼는 잠을 잔다");
	}
	

}
