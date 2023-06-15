package ezen.tenone;

public class Car {
	
	String color = "";
	String gearType = "";
	int door = 0 ;
	String carType = "";
	//기본 생성자 
	Car(){
		
	}
	
	//매개변수가 있는 생성자
	//하나라도 만들면 기본생성자가 만들어지지 않는다.
	Car(String c, String g, int d){//생성자
		color = c;
		gearType = g;
		door = d;
	}
	
	Car(String c, String g, String t){
		color = c;
		gearType = g;
		carType = t;
	}
	
}
