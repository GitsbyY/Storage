package three;

public class Tv {

	String name = "";
	int volume = 0;
	int channel = 0;
	boolean power = false;

	// 기본생성자
	public Tv() {
		super();
	}

	// 전체 생성자
	public Tv(String name, int volume, int channel, boolean power) {
		super();
		this.name = name;
		this.volume = volume;
		this.channel = channel;
		this.power = power;
	}

	// 모든 정보를 출력하는 메서드
	void info() {

		System.out.println("Tv이름은 " + name);
		System.out.println("지금 볼륨은" + volume + "입니다.");
		System.out.println("지금 채널은" + channel + "입니다.");
		System.out.println("지금은 전원이 꺼져있습니다.");

		System.out.println();
	}

	// 볼륨은 1~10 볼륨 가능 업 다운기능 구현

	public void power() {  
		if(this.power){
		System.out.println("power on");
		}
		else System.out.println("power off");
		    this.power=!power;
		}
	
	void volumeUp() {
		if (volume >= 1 && volume < 10) {
			volume++;
			System.out.println("현재 음량은" + volume);
		}else if(volume == 10) {
			volume = 1;
			System.out.println("현재 음량은" + volume);
		}
	}

	void volumeDown() {
		if (volume > 1 && volume < 10) {
			volume--;
			System.out.println("현재 음량은" + volume);
		}else if(volume == 1) {
			volume = 10;
			System.out.println("현재 음량은" + volume);
		}

	}

}
