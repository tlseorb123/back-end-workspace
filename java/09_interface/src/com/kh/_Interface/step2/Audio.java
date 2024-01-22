package com.kh._Interface.step2;

public class Audio implements RemoteControl, Searchable {
 
	private int volume;

	@Override
	public void setVolume(int volume) {
		
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);
	}

	@Override
	public void search(String url) {
		System.out.println(url + "을 연결합니다");
	}

	@Override
	public void turnOn() {
		System.out.println("Audio 을 연결합니다");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio 을 연결합니다");
	}
	
}
