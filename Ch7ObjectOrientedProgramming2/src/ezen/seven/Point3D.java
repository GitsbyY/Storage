package ezen.seven;

public class Point3D extends Point{
	
	int x = 10;
	int z = 0;
	
	Point3D(int x, int y, int z){
		super(x,y);
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public String getLocation() {
		String str = "";
		
		str = "x : " + x + " y : " + y + " z : " + z;
		
		return str;
	}
	
}
