//변수와 메소드
//선언 위치에 따른 변수
public class Variables {// 클래스 영역 메인이 없어야 온전한 클래스로 사용 할 수 있다.
		
	int iv;			//인스턴스변수 ->객체변수
	static int cv;	//클래스 변수(static 변수, 공유변수)
		
	void method() {// 메소드 영역
		int lv = 0;// 지역변수
	}
/*	
	변수의종류			선언위치				생성시기
	클래스 변수			클래스 영역  			클래스가 메모리에 올라갈 때
	class variable
	
	인스턴스 변수(static 변수)
	instance var 	클래스 영역				인스턴스가 생성 되었을 대
	
	지역 변수			클래스 영역 이외의 영역  	변수 선언문이 수행 되었을 때
					메소드, 생성자 내부
					
				-	변수의 종류와 특징 -
				
   	1. 인스턴스 변수
   	클래스 영역에 선언되며, 클래스의 인스턴스를 생성할 때 만들어진다
   	그렇기때문에 인스턴스 변수으 ㅣ값을 읽어 오거나 저장하기 위해서는 먼저 인스턴스를
   	생성해야 한다
   	인스턴스는 독립적인 저장공간을 가지므로 서로 다른 값을 가질 수 있다.
   	인스턴스마다 고유한 상태를 유지해야하는 속성의 경우 인스턴스 변수로 선언한다.
   	
   	2. 클래스 변수(static 변수)
   	클래스 변수를 선언하는 방법은 인스턴스 변수 앞에 static을 붙이기만 하면 된다
   	인스턴스마다 독립적인 저장공간을 갖는 인스턴스 변수와는 달리, 클래스 변수는
   	모든 인스턴스가 공통된 저장공간(변수)를 공유하게 된다. 한 클래스의
   	모든 인스턴스 들이 공통적인 값을 유지해야 하는 속성의 경우 클래스 변수로 선언한다.
   	
   	클래스 변수는 인스턴스 변수와 달리 인스턴스(new)를 생성하지 않고도 언제해도 바로
   	사용할 수 있다는 특이지 있으며, '클래스이름.클래스변수'와 같은 형식으로 사용한다.
   	클래스가 메모리에 로딩 될 때 생성되어 프로그램이 종료될 때까지 유지된다.
   	
   	3. 지역 변수
   	메소드 내에 선언되어 메소드 내에서만 사용가능하며, 메소드가 종료되면 소멸되어
   	사용할 수 없게 된다.
   	for, while문의 블럭 내에서 선언 된 지역 변수는 지역 변수가 선언 된 블럭{} 내에서만
   	사용가능하며, 블럭{}을 벗어나면 소멸되어 사용 할 수 없게 된다.
   	
*/		
	
}//클래스 영역
