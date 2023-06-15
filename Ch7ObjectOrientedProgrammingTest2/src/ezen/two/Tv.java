package ezen.two;

public class Tv {

	//boolean power;
	int channel;
	// 볼륨 속성 추가
	int volume;
	void channel() {
		channel = 5;
		System.out.println(channel);
	}
//	void power(){
//		power = !power;
//	}
	void volume() {
		volume = 7;
		System.out.println(volume);
	}
	void channelUp(){
		++channel;
	}
	
	void channelDown(){
		--channel;
	}
	
	// 볼륨 업 기능구현
	void volumeUp(){
		volume++;
	}
	
	// 볼륨 다운 기능구현
	void volumeDown(){
		volume++;
	}
	
	//볼륨과 채널의 상태를 보여주는 메서드 생성
	
	void infoTv() {
		channel();
		volume();
	}
}
