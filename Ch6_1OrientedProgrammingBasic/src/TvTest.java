
public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Tv tv;
//		클래스 -> 인스턴트화 -> 인스턴스(객체)
		tv = new Tv();
		
		tv.power();
		tv.channel = 1;
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		tv.channelUp();
		
		
//		tv.channel = 7;
//		tv.channelDown();
		
		
		System.out.println("현재 채널은 " + tv.channel + "입니다.");
	}

}
