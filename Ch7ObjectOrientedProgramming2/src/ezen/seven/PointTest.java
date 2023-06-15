package ezen.seven;

public class PointTest {

/*	
	super() 부모 클래스의 생성자 호출
	
	this()와 마찬가지로 super()역시 생성자이다
	this()는 같은 클래스의 다른 생성자를 호출하는데 사용되지만
	super()는 부모 클래스의 생성자를 호출하는데 사용된다
	자식 클래스의 인스턴스를 생성하면 자식의 멤버와 부모의 멤버가
	모두 합쳐지 ㄴ하나의 인스턴스가 생성 된다
	그래서 자식 클래스의 인스턴스가 부모 클래스의 멤버들을 사용할 수 있는 것이다
	
	생성자의 첫 줄에서 부모 클래스의 생성자를 호출해야하는 이유는 자식 클래스의
	멤버가 부모 클래스의 멤버를 사용 할 수 있으므로 부모의 멤버들이 먼저
	초기화 되어 있어야 하기 때문이다
	
	Object 클래스를 제외한 모든 클래스의 생성자는 첫 줄에 반드시 자신의 다른 생성자
	또는 조상의 생성자를 호출해야 한다
	그렇지 않으면 컴파일러는 생성자의 첫 줄에 super()을 자동적으로 추가 할 것이다
	
	생성자들이 여러개 생기면 선택한 클래스의 어떤 생성자를 이용해서
	인스턴스를 생성 할 것인가 고민해 봐야 한다.
	

*/	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p3 = new Point3D(1,2,3);
		
		System.out.println(p3.getLocation());
	}

}
