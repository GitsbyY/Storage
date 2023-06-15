/*
   		생성자와 메서드 차이?
   		생성자는 객체 생성시 단 한 번만 수행된다
   		만약 생성자를 다시 호출한다면
   		1. 새로운 객체를 만들었다 -> 이전 객체에 영향을 안준다
   		2. 오류가 발생한다 - > 생성자는 new 키워드 없이 사용 불가능하다
   		
   		매서드는 객체 수행 후 원하는 만큼, 필요한 매 순간 사용이 가능하다
 		
 */
public class BeamProjector {

	public static void main(String[] args) {

		BeamProject2 bp = new BeamProject2();
		
		bp.productName = "SB-405";
		bp.productDate = "2022-05-15";
		bp.volume = 20;
		
		new BeamProject2();
		
		new BeamProject2();
		
		bp.volumeUp();
		bp.volumeUp();
		bp.volumeUp();
//		bp.power();
//		
//		bp.volumeUp();
//		
//		bp.volumeDown();
//		
//		bp.infoView();
//		
//		bp.power();

	}

}
