package ezen.four;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		
		클래스 간의 관계 - 포함관계
		
		상속 이외에도 클래스를 재사용하는 방법이 있다
		클래스 간에 포함(Composite) 관계를 맺어주는 것이다
		
		클래스 간의 포함관계를 맺어 주는 것은 한 클래스의 멤버변수를
		다른 클래스 타입의 참조 변수를 선언하는 것을 뜻한다.
*/		
		//Point p = new Point();
		Circle c = new Circle();
		
		//p.x = 1;
		//p.y = 2;
		c.point.x = 10;
		c.point.y = 20;
		c.r = 2;
		//c.point = p;
		
		System.out.println("x 좌표 : " + c.point.x
				+ ", 좌표 : " + c.point.y + ", 반지름 : " + c.r);
		
	}

}
