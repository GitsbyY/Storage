package makeBeamPreoject;

public class BeamProjectorTest {
	//전원버튼 프리즈(영상이 멈춤) 볼륨 업/볼륨 다운
	
	
	public static void main(String[] args) {
		BeamProjector bp = new BeamProjector();
		bp.pName = "좋은 프로젝터";
		bp.maker = "마샬";
		bp.madeYear = "2023년 1월 2일" ;
		bp.price = 2_000_000;
		bp.volume = 5;
		bp.bpInfo();
		bp.power();
		bp.freeze();
		bp.volumeUp();
		bp.volumeUp();
		bp.voulumeDown();	
		bp.power();
		bp.volumeUp();
	}
	
}
