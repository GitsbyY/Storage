package makeBeamPreoject;

public class BeamProjector {
	// 전원버튼 켜진다 꺼진다 프리즈(영상이 멈춤) 볼륨 업/볼륨 다운

	boolean power = false;
	boolean freeze = false;
	String pName = "";
	String maker = "";

	String madeYear = "";
	int price = 0;
	int volume = 0;

	void power() {
		if (power) {
			power = false;
			System.out.println("전원이 꺼졌습니다.");
		} else {
			power = true;
			System.out.println("전원이 켜졌습니다.");
		}
	}

	void freeze() {
		if (power == true) {
			if (freeze == true) {
				
				System.out.println("영상이 멈춥니다.");
			} else {
				System.out.println("영상이 시작됩니다.");
			}

		}
		
	}

	void bpInfo() {

		System.out.println("제품 이름은 : " + pName);
		System.out.println("메이커 : " + maker);
		System.out.println("제품 날짜 : " + madeYear);
		System.out.println("제품 가격 : " + price);
	}

	void volumeUp() {
		if (power == true) {
			if (volume > 0) {
				volume = volume + 10;
				System.out.println("볼륨 증가 현재 볼륨 : " + volume);
			} 

		}else if (power == false){
			System.out.println("전원이 꺼져있습니다.");
		}
	}

	void voulumeDown() {
		if (power == true) {
			if (volume > 0) {
				volume = volume - 10;
				System.out.println("볼륨 감소 현재 볼륨 : " + volume);
			} 

		}else if (power == false) {
			System.out.println("전원이 꺼져있습니다.");
		}
	}

}
