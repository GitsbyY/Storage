
public class TvTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		클래스 타입 참조변수 = new 클래스명();
//		                                       객체 선언
		Tv3 tv = new Tv3();
		Tv3 tv2 = new Tv3();
		
		System.out.println("tv1의 channel 값 : " + tv.channel);
		System.out.println("tv2의 channel 값 : " + tv2.channel);
		
		tv2 = tv;
		tv.channel = 7;
		System.out.println("tv의 값을 7로 변경함");
		
		System.out.println("tv1의 channel 값 : " + tv.channel);
		System.out.println("tv2의 channel 값 : " + tv2.channel);
		
	}
	
}	
