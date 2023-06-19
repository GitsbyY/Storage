package one;

public class Cat implements Animal {

	
	String leg = "4발";
	String mouth = "입";
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println(leg +"로 소리없이 걷는다.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(leg +"로 달린다.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println(mouth +"앙증맞게 먹는다");
	}

	public void cry() {
		// TODO Auto-generated method stub
		System.out.println(mouth +"으로 갸르릉 운다.");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("고양이는 사랑스럽게 잠을 잔다");
	}

}
