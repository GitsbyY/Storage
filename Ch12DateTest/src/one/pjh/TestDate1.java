package one.pjh;

import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;

public class TestDate1 {

	public static void main(String[] args) {

		Date calendar = new Date();

		int year = 0;
		int month = 0;
		String dayStr = "";

		calendar.setMonth(11);

		year = calendar.getYear() + 1900;
		month = calendar.getMonth() + 1;

		System.out.println(year + "년 " + month + "월");
		System.out.println();

		for (int i = 3; i <= 9; i++) { // 3일 ~ 9일
			calendar.setDate(i);
			System.out.print(calendar.getDate() + "일 ");

			switch (calendar.getDay()) {
			case 0:
				dayStr = "일";
				break;
			case 1:
				dayStr = "월";
				break;

			case 2:
				dayStr = "화";
				break;

			case 3:
				dayStr = "수";
				break;

			case 4:
				dayStr = "목";
				break;

			case 5:
				dayStr = "금";
				break;

			case 6:
				dayStr = "토";
				break;
			}
			System.out.println(dayStr + "요일");
		}

	}

}
