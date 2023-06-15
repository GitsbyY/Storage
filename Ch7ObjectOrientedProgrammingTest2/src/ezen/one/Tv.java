package ezen.one;

public class Tv { 

	boolean power;
	int channel;
	// 볼륨 속성 추가
	int volume;
	
	
	public void power(){
		power = !power;
	}
	
	void channelUp(){
		++channel;
	}
	
	void channelDown(){
		--channel;
	}
	
	void volumeUp(){
		++volume;
	}
	
	void volumeDown(){
		--volume;
	}
	
		
}
