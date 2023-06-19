package one;

public class Dog extends Child implements Animal, Sociability {

	//강아지가 가진 특징
//	다리가 있다 -> 네발로 걷는다
//	 		 -> 네발로 달린다
//	 		 -> 두 발로 뛴다
//	입으로 먹는다
	
	String leg = "4발";
	String mouth = "입";
	
	
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println(leg +"로 걷는다");
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(leg + "로 달린다");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(mouth + "로 먹는다");
	}


	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("강아지는 주인 옆에 와서 잔다.");
	}


	@Override
	public void kind() {
		// TODO Auto-generated method stub
		System.out.println("강아지는 사람에게 친절하다.");
	}


	


}
