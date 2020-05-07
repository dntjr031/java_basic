package com.day20;

public class IPTVTest2 {

	public static void main(String[] args) {
		
		IPTV2 iptv = new IPTV2();
		iptv.powerOn();
		
	}

}

interface TV2{
	public void onTV();
}

interface Computer2{
	void dataReceive();
}

class IPTV2 implements TV2, Computer2{

	public void onTV() {
		System.out.println("TV영상 출력 중");
	}
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
	public void powerOn() {
		dataReceive();
		onTV();
	}
}
