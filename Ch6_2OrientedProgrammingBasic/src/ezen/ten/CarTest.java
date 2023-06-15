package ezen.ten;

public class CarTest {
	public static void main(String[] args) {
		
		String color = "";
		String gearType = "";
		int door = 0 ;
		
		color = "blue";
		
		
		
		Car car = new Car(color, gearType, door);
			
		
		
		System.out.println(car.color);
		System.out.println("자동차 변속기 종류 : " + car.gearType);
		System.out.println(car.door);
		
	}
	/*
	생성자 (Constructor) [생성 될 때 new]
	생성자는 인스턴스가 생성 될 때 호출되는 인스턴스 초기화 메서드이다.
	인스턴스 변수의 초기화 작업에 주로 사용되며,
	인스턴스 생성 시에 실행되어야 할 작업을 위해서도 사용된다.
	
	생성자 선언 조건
	1. 생성자의 이름은 클래스의 이름과 같아야한다
	2. 생성자는 리턴 값이 없다
	
	생성자 역시 메서드처럼 클래스 내에 선언되며, 구조도 메서드와 유사하지만
	리턴값이 없다는 점이 특징이다
	
	표현식
	클래스 이름(타입 변수명, 타입 변수명,,,,) {
		인스턴스 생성시 수행될 코드들
		주로 인스턴스 변수의 초기화 작업 수행
	}
	
	1.연산자 new에 의해서 메모리(heap)에 인스턴스가 생성된다
	2.생서자가 호출되어 수행된다
	3.연사자 new의 결과로, 생성된 인스턴스의 주소가 반환되어 참조변수에 
	
	*/
	
}
