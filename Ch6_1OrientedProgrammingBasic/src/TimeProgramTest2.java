
public class TimeProgramTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		비객체지향적인 코드
//		절차지향
//		절차지향에 어셈블리어가 가장 잘 어울리는 코드
		String usa = "미국";
		String kor = "한국";
		String uk = "영국";
		int  hour = 0;
		int  minute = 0;
		int  second = 0;
		int usaHour = 0;
		int usaminute = 0;
		int usaSecond = 0;
		int korHour = 0;
		int korminute = 0;
		int korSecond = 0;
		int ukHour = 0;
		int ukminute = 0;
		int ukSecond = 0;
		
		hour = 10;
		minute = 20;
		second = 30;
		
		korHour = hour;
		korminute = minute;
		korSecond = second;
		
		usaHour = hour + 13;
		usaminute = minute;
		usaSecond = second;
		
		ukHour = hour - 8;
		ukminute = minute;
		ukSecond = second;
		
		System.out.println(usa + ": " + usaHour +"시 : "
		+ usaminute + "분  : " + usaSecond + "초 ");
		System.out.println();
		System.out.println(kor + ": " + korHour +"시 : "
		+ korminute + "분  : " + korSecond + "초 ");
		System.out.println();
		System.out.println(uk + ": " + ukHour +"시 : "
		+ ukminute + "분  : " + ukSecond + "초 ");
	}

}
