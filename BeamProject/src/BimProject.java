
public class BimProject {
	boolean power = true;
	int volume;
	String productName;
	String manufDate;

	void power() {
		if (power == true) { // boolean
			System.out.println("전원이 켜졌습니다");
		} else {
			System.out.println("전원이 꺼졌습니다");
		}
	}

	void product() {
		System.out.println("제품이름: "+productName);
		System.out.println("제조날짜: "+manufDate);
	}

	void volumeUp() {
		volume++; // 볼륨 증가
		System.out.println("볼륨 " + volume);
	}

	void volumeDown() {
		volume--; // 감소
		System.out.println("볼륨 " + volume);
	}
}
