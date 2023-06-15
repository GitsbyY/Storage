package ezen.seven;

public class Point {
	
	int x;
	int y;
	
	public Point(){
		
	}
	
	public Point(int x, int y){
		super();
		this.x = x;
		this.y = y;
	}
	
	public String getLocation() {
		String str = "";
		
		str = "x : " + x + " y : " + y;
		
		return str;
	}
	
}
