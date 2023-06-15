package ezen.tenfour;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time time = new Time();
		
		int hour = 0;
		int minute = 0;
		int second = 0;
		
		hour = 14;
		minute = 22;
	    second = 58;
		
		time.setHour(hour);
		time.setMinute(minute);
		time.setSecond(second);
		
		time.timeInfo();
	}

}
