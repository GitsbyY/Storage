package ezen.tenSix;

public class CarTest {
	
/*	
	참조변수의 형변환
	기본형 변수와 같이 참조변수도 형변환이 가능하다
	단, 서로 상속관계에 있는 크래스에서만 가능하기 때문에
	자식타입의 참조변수를 조상타입의 참조변수로
	부모타입의 참조변수를 자식타입의 참조변수로의 형변환만 가능하다.
	
	자손타입 -> 조상타입(Up - Casting) : 형변환 생략가능
	자손타입 <- 조상타입(애주 - Casting) : 형변환 생략불가
*/	
	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		
		FireEngine fe2 = null;
		
		fe.water();
		car = (Car)fe;
		fe.water();
//		car.water();
//		car = new Car();
//		car.stop();
//		car.drive();
//		fe2 = car;
		fe2 = (FireEngine)car;
		fe2.water();
		
	}
	
}
