package ezen.tenSeven;

public class CarTest {
	
	public static void main(String[] args) {
		
//		Car car = new Car();
		Car car = null;
		FireEngine fe = new FireEngine();
		Ambulance am = null;
		
		fe.water();
		
		car = fe;
		
		am = (Ambulance)car;
		
		am.drive();
		am.siren();
		
	}
	
}
