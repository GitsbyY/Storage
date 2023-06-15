package ezen.five;

public class Point3D extends Point {
	
	int z = 0;
	
	String getLocation() {//오버라이딩
		
		String str = "";
		
		str = "x : " + x + ", y : " + y + ", z : " + z;
		
		return str;
		
	}
	
}
