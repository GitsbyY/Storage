package one;

import java.util.Date;

public class TestDate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Date calender = new Date();
		int year = 0;
		int month = 0;
		int date = 0;
		int day = 0;
		
		year = calender.getYear();
		System.out.print((year + 1900) + " 년  " );
		calender.setMonth(11);
		System.out.println(calender.getMonth() + " 월");
		calender.setDate(3);
		
		
		calender.getDay();
		
		
		
		System.out.println("일 :  " + date);
		System.out.println("요일 :  " + day);
		
		if(day == 5) {
			System.out.println("요일 : " + "금");			
		}
		System.out.println("일요일 : " + calender.getDay());
	}

}
