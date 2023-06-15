package ezen.three;

public class TvTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CaptionTv captionTv = new CaptionTv();
		String text = "";
		
		captionTv.channel = 10;
		
		captionTv.channelUp();
		System.out.println(captionTv.channel);
		
		text = "캡션 기능이 있는 Tv";
		captionTv.displayCaption(text);
		
		captionTv.caption = true;
		captionTv.displayCaption(text);
		
		
	}

}
