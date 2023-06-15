
public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		객체지향적인 코드
//		객체지향

		Time koreaTime = new Time();
		Time usaTime = new Time();
		Time ukTime = new Time();

//		koreaTime.hour = 2;
//		koreaTime.minute = 10;
//		koreaTime.second = 30;

		koreaTime.setHour(2);
		koreaTime.setMinute(10);
		koreaTime.setSecond(30);

		System.out.println(
				"한국시 : " + koreaTime.getHour() + " 한국분  : " 
						+ koreaTime.getMinute() + " 한국초 "+ koreaTime.getSecond());

		usaTime.setHour(7);
		usaTime.setMinute(20);
		usaTime.setSecond(50);

		System.out
				.println("미국시 : " + usaTime.getHour() + " 미국분  : " 
						+ usaTime.getMinute() + " 미국초 "+ usaTime.getSecond());

		ukTime.setHour(3);
		ukTime.setMinute(30);
		ukTime.setSecond(40);

		System.out.println("영국시 : " + ukTime.getHour() + " 영국분  : " 
				+ ukTime.getMinute() + " 영국초 " + ukTime.getSecond());

	}

}
