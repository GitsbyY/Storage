package supertest3;

public class Point {
	int x = 100; 
	int y = 200;
	Point(){
		super();
		System.out.println("Point 위치");
		System.out.println(this);
	}
	
	String getLocation() {
		String resultStr = "";
		resultStr = "x: " + x + ", y: " + y;
		return resultStr; 
	}
	
}

