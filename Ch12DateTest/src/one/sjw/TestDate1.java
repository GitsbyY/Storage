package one.sjw;

import java.util.Date;

public class TestDate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date();
	      d.setYear(2023);
//	      d.setMonth(11);
//	      System.out.println(d.getYear() + 1900);
	      String dayStr = "";
	      System.out.println(d.getYear()+"년 "+(d.getMonth() + 7)+"월");
	      for (int i = 3; i < 10; i++) {
	         
	         d.setDate(i);
	         switch (d.getDay()) {
	         case 1:
//	            System.out.println( i + "일 " + "월요일");
	            dayStr = "월요일";
	            break;
	         case 2:
//	            System.out.println( i + "일 " + "화요일");
	            dayStr  = "화요일";
	            break;
	         case 3:
//	            System.out.println( i + "일 " + "수요일");
	            dayStr = "수요일";
	            break;
	         case 4:
//	            System.out.println( i + "일 " + "목요일");
	            dayStr = "목요일";
	            break;
	         case 5:
//	            System.out.println( i + "일 " + "금요일");
	            dayStr = "금요일";
	            break;
	         case 6:
//	            System.out.println( i + "일 " + "토요일");
	        	 dayStr = "토요일";
	            break;
	         case 0:
//	            System.out.println( i + "일 " + "일요일");
	            dayStr = "일요일";
	            break;
	         default:
	            break;
	            
	         }
	         System.out.println(i + "일 " + dayStr);
	      }
	      
	}
}