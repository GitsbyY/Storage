package ezen.tenfour;

public class Car {
	
	String color = "";
	String gearType = "";
	int door = 0 ;
//	String brand = "";
//	String carName = "";
//	String carType = "";
	
	
	Car(){
		this("", "자동", 10);
		color = "노란색";
	}
	//자동차에 존재하는 거 하나 추가
	Car(String c, String g, int d){//생성자
		color = c;
		gearType = g;
		door = d;
//		brand = b;
//		carName = n;		carType = t;
	
	}
	void carInfo() {
		
	}
}
