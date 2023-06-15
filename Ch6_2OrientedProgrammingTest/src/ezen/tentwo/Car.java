package ezen.tentwo;

public class Car {
	
	String color = "";
	String gearType = "";
	int door = 0 ;
	String carType = "";

	Car(){
		color = "빨간색";
		gearType = "수동";
		door = 2;
		carType = "sport's";
	}

	Car(String color, String gearType, int door){//생성자
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	void carInfo() {
		
		System.out.println("자동차의 색상 : " + color);
		System.out.println("자동차 기어 타입 : " +gearType);
		System.out.println("자동차 문의 갯수 : " +door);
		System.out.println("자동차의 종류 : " + carType);
	}
	
}
