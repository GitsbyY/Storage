/*
   		생성자와 메서드 차이?
   		생성자는 객체 생성시 단 한 번만 수행된다
   		만약 생성자를 다시 호출한다면
   		1. 새로운 객체를 만들었다 -> 이전 객체에 영향을 안준다
   		2. 오류가 발생한다 - > 생성자는 new 키워드 없이 사용 불가능하다
   		
   		매서드는 객체 수행 후 원하는 만큼, 필요한 매 순간 사용이 가능하다
 		
 */
public class BeamProject3 {
	
	boolean power = false;//**
	String productName = "";
	String productDate = "";
	int volume = 0;
	
	public BeamProject3(boolean power, String productName
			, String productDate, int volume) {
		this.power= power;
		this.productName = productName;
		this.productDate = productDate;
		this.volume = volume;
	}
	
	void BeamProjectButtonInit(boolean power, String productName
			, String productDate, int volume) {
		this.power= power;
		this.productName = productName;
		this.productDate = productDate;
		this.volume = volume;
	}

	void power() {
		power = !power;
		if (power == true) {
			System.out.println("전원이 켜졌습니다.");
		} else {
			System.out.println("전원이 꺼졌습니다.");
		}
	}

	void volumeUp() {
		volume++;
		System.out.println("볼륨: " + volume);

	}

	void volumeDown() {
		volume--;
		System.out.println("볼륨: " + volume);
	}

	void infoView() {
		System.out.println("전원 상태 : " + power);
		System.out.println("제품이름: " + productName);
		System.out.println("제조날짜: " + productDate);
		System.out.println("볼륨: " + volume);
	}
}
