package ezen.six;

public class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		
		super는 자식 클래스에서 부모 클래스로부터 상속받은 멤버를 참조하는데
		사용되는 참조 변수이다
		멤버변수와 지역변수의 이름이 같을 때 this를 사용해서 구별했듯이
		상속받은 멤버와 자신의 클래스에 정의 된 멤버의 이름이 같을 때
		super를 사용해서 구별할 수 있다
		
		기본적으로 부모 클래스의 멤버와 자식 클래스의 멤버가 종복 정의되어
		서로 구별해야하는 경우에만 super를 사용하는 것이 좋다
		
		오로지 인스턴스 메서드에서만 사용가능하다
			
*/		
		
		Child c = new Child();
		
		c.method();
		
		
	}

}
