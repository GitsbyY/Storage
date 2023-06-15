package ezen.nine.test;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calc calc = new Calc();
		
		long resultNum = 0;
		int a = 10;
		int b = 20;
		
		resultNum = calc.add(a,b);
		System.out.println(resultNum);
		
		resultNum = calc.add(3L,3);
		System.out.println(resultNum);
		
		resultNum = calc.add(4,4L);
		System.out.println(resultNum);
		
		resultNum = calc.add(5L,10L);
		System.out.println(resultNum);
		
		
		
		
	}
/*	
	오버로딩(overloading)
	
	메서드도 변수와 마찬가지로 같은 클래스 내에서 구별 될 수 있어야 한다.
	그래서 각기 다른 이름을 가져야한다.
	
	자바에서는 한 클래스 내에 이미 사용하려는 이름과 같은 이름을 가진 메서드가 있더라도
	매개변수의 개수 또는 타입이 다르면, 같은 이름을 사용해서 매서드를 정의할 수 있다.
	
	
	메서드 오버로딩 또는 간단히 오버로딩이라고 한다.
	
	한 클래스 내에 같은 이름의 메서드를 여러개 정의하는 것을 
	
	오버로딩의 조건
	1. 메서드의 이름이 같아야 한다.
	2. 매개변수의 개수 또는 타입이 달라야한다.
	
	단, 반환타입은 오버로딩을 구현하는데 아무런 영향을 주지 못한다.
	
	
	
	오버로딩의 장점?
	
	같은 기능을 하겠구나 라고 쉽게 예측을 할 수 있게 된다
	메서드의 이름을 짓는데 고민을 덜 수 있다
	사용되었어야 할 메서드 이름을 다른 메서드의 이름으로 사용할 수 있다.
	
	ex)
	void addFloat()
	void addDouble()
	void addLong()
	void add()
	
*/	
}
