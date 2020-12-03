package com.yedam.interfaces;

public class RemoteControlExample {
	public static void main(String[] args) {
		Audio audio = new Audio();
		Television tv = new Television();
		
//		audio.turnOn();
//		audio.turnOff();
//		
//		tv.turnOn();
//		tv.turnOff();
		
		RemoteControl rc = audio; //구현객체 오디오랑 티비를 받았음. 인스턴스마다 오디오인지 티비인지 구분해서 출력됨.
		rc.turnOn();
		rc.turnOff();
		
		rc = tv;
		rc.turnOn();
		rc.turnOff();
	}
}
