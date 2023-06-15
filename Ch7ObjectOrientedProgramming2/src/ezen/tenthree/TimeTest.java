package ezen.tenthree;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time time = new Time();
		
		//time.hour = 19;
		//time.minute = 20;
//		The field Time.hour is not visible
//		The field Time.minute is not visible
		time.timeInfo();
		time.theTime(23, 21, 32);
		//private은 내부에서 사용이 가능하다. 그렇기에 매개변수로 접근하면 된다.
		Time time2 = new Time(21, 15, 52);
		time2.timeInfo();
		
		
	}

}
