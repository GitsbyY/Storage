package ezen.tenthree;

public class Time {
	
	private int hour = 0;
	private int minute = 0;
	private int second = 0;
	String getTime = "지금 시간은 " + hour + minute + second;
	public Time() {
		
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void theTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	

	public void timeInfo() {
		
		System.out.println("시간 표시");
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
		
	}
	
}
