package ezen.tenEight;

public class CarTest {
	
	public static void main(String[] args) {
		
		Car car = new Car();
		
		FireEngine fe = null;
		Ambulance am = null;
		
		System.out.println(car);
		System.out.println(fe);
		car.drive();
//		fe.water();
		
		//형변환은 되었지만 사용되어지지는 않는다.
		fe = (FireEngine)car;
		System.out.println(car);
		System.out.println(fe);
//		fe.water();
		fe.drive();
		
		am = (Ambulance)car;
		System.out.println(car);
		System.out.println(fe);
		am.drive();
//		am.siren();
		
	}
	
}
