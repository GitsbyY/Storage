package ezen.tenFive;

public class PolymorphismTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		
		
		다형성(Polymorphism)이란?
				
		상속과 함께 객체지향개념의 중요한 특징 중 하나인 것이 다형성
		
		다형성은 상속과 깊은 관계가 있으므로 꼭 상속에 대해 알고 있어야 한다
		
		다형성이란 여러가지 형태를 가질 수 있는 능력을 의미하며
		자바에서는 한 타입의 참조변수로 여러 타입의 객체를 참조할 수 있도록 함
		
		다르게 이야기하면
		조상 클래스 타입의 참조변수로 자손 클래스의 인스턴스를 참조 할 수 있도록 하였다
		는 것이다.
		
		TV와 CaptionTv 클래스가 서로 상속관계에 있는 경우
		부모 클래스 타입의 참조 변수로 자식 클래스의 인스턴스를
		참조하도록 하는 것이 가능하다
		
		Tv 타입의 참조변수로는 CaptionTv 인스턴스 중에서 Tv클래스의 멤버들만
		사용할 수 있다
		둘 다 같은 타입의 인스턴스지만, 참조변수의 타입에 따라
		사용 할 수 있는 멤버의 개수가 달라진다
		
		핵심 요약
		부모 타입의 참조변수로 자식 타입의 인스턴스를 참조할 수 있다
		반대로 자식 타입의 참조변수로 부모 타입의 인스턴스를 참조할 수 없다
		
*/		
		
		Tv tv = new Tv();
		CaptionTv captionTv = new CaptionTv();
		
		
		captionTv.caption();
		
//		다형성의 개념
		tv = captionTv;
		
		tv.channelUp();
		System.out.println(tv.channel);
		
//		tv.caption();
//		captionTv = tv;
		
		
	}

}
