
public class MyTvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv tv = new MyTv();
		MyTv tv1 = new MyTv();
		
		tv.channel = 12;
		tv1.volume = 33;
		
		System.out.println("1번 Tv");
		System.out.println("채널 : " + tv.channel);
		System.out.println("볼륨 : " + tv.volume);
		
		
		System.out.println();
		
		System.out.println("2번 Tv");
		System.out.println("채널 : " + tv1.channel);
		System.out.println("볼륨 : " + tv1.volume);
		
	}

}
