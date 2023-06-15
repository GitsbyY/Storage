package ezen.tenone;

public class CarTest {
	public static void main(String[] args) {
		
		String color = "";
		String gearType = "";
		int door = 0 ;
		String carType = "";
		color = "blue";
		
		
		
		Car car = new Car(color, gearType, door);
		
		System.out.println(car.color);
		System.out.println("자동차 변속기 종류 : " + car.gearType);
		System.out.println(car.door);
		
		Car myCar = new Car(color, gearType, carType);
		myCar.color = "red";
		myCar.carType = "sports";
		
		
		System.out.println(myCar.color);
		
	}
	
}
