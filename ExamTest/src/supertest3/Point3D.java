package supertest3;

public class Point3D extends Point{
	int x = 5;
	int y = 6;
	int z = 7;
	
	Point3D() {
		super();
		System.out.println("Point3D 위치");
		System.out.println(this);
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
	}
	
//	Point3D(int x) {
//		this(x, 50);
//	}
	
	String getLocation() { 
		int x = 1;
		int y = 1;
		int z = 1;
		String resultStr = "";
//		resultStr = getLocation()
//				+ ", z: " + z;
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(super.x);
		
		return resultStr; 
		
	}
	
}
