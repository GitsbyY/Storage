package two;

import java.util.Calendar;

public class BasicCalendar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Date 이후에 만들어진 2000년을 표현 가능한 인터페이스

//		Calendar cal = new Calendar(); -> new 에서 빨간줄
//		추상 클래스는 new 불가능

		Calendar cal = Calendar.getInstance();

		int year = 0;
		int month = 0;
		int date = 0;
		int day = 0;

		year = cal.get(Calendar.YEAR);
		month = cal.get(Calendar.MONTH);
		date = cal.get(Calendar.DATE);
		day = cal.get(Calendar.DAY_OF_WEEK);
		
		System.out.println("년 :  " + year);
//		달만 +1 해야한다
		System.out.println("월 :  " + month);
		System.out.println("일 :  " + date);
//		요일은 1~7
//		일요일1, 월요일2, 토요일 7이다.
		System.out.println("요일 :  " + day);
		
		
		
		
	}

}
