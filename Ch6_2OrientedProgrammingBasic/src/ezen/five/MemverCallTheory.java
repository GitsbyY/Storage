package ezen.five;

public class MemverCallTheory {
	
//	스태틱 메서드와 인스턴스 메서드

/*
	인스턴스 메서드
	인스턴스 변수와 관련된 작업을 하는, 즉 메서드의 작업을 수행하는데 
	인스턴스 변수를 필요로 하는 메서드
	인스턴스와 관계없는 메서드를 클래스 메서드(static 메서드)로 정의한다
	
	클래스 영역에 선언된 변수를 멤버변수라고한다
	멘버변수 중에 static이 붙은 것은 스태틱 변수, static이 붙지 않은 것은
	인스턴스 변수라고 한다
	멤버변수는 instance 변수와 static 변수 모두를 총칭하는 말이다
	
	1.클래스를 설계할 때, 멤버변수 중 모든 인스턴스에 공통적으로 사용해야하는
	것에 static을 붙인다.
	-생성된 각 인스턴스는 서로 독립적이기 때문에 각 인스턴스의 변수는 서로 다른 값을
	유지한다. 그러나 모든 인스턴스에서 값이 유지되어야 하는 변수는 static을 붙여서
	정의한다.
	
	2. 스태틱 변수는 인스턴스를 생성하지 않아도 사용할 수 있다.
	-static이 붙은 변수는 클래스가 메모리에 올라 갈 때 이미 자동적으로 생성된다.
	
	3. 스태틱 메서드는 인스턴스 변수를 사용 할 수 없다.
	-인스턴스 변수는 인스턴스가 반드시 존재해야만 사용 할 수 있는데, 스태틱 메서드는
	인스턴스 생성없이 호출가능함으로 클래스 메서드가 호출 되었을 때 인스턴스가 존재하지 않을
	수도 있다. 그래서 클래스 메서드에서 인스턴스 변수와 사용을 금지한다.
	반면에 인스턴스 변수나 인스턴스 메서드에서 static이 붙은 멤버들을 사용하는 것이
	언제나 가능하다. 인스턴스 변수가 존재한다는 것은 static 변수가 이미 메모리에
	존재한다는 것을 의미하기 때문이다.
	
	(이치는 맞기는 하지만 잘 못 된 내용. 속도만이 중요하지 않다.)
	4. 메서드 내에서 인스턴스 변수를 사용하지 않는다면, static을 붙이는 것을 고려한다
	-메서드의 작업 내용 중에서 인스턴스 별수를 필요로한다면 static을 붙일 수 없다.
	반대로 인스턴스 변수를 필요로 하지 않는다면 static을 붙이자(?)
	메서드 호출시간이 짧아짐으로 성능이 향상된다. static을 안 붙인 메서드는 실행 시
	호추로디어야 할 메서드를 찾는 과정이 추가적으로 필요하기 때문이다(?)

*/
	
}
