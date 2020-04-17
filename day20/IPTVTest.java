package com.day20;

public class IPTVTest {

	public static void main(String[] args) {
		
		IPTV iptv = new IPTV();
		iptv.powerOn();
		
		TV tv = new IPTV();
		tv.onTV();
		Computer comp = new IPTV();
		comp.dataReceive();
	}

}

class TV{
	public void onTV(){
		System.out.println("TV ���� ��� ��");
	}
}

interface Computer{
	void dataReceive();
}

class IPTV extends TV implements Computer{

	public void dataReceive() {
		System.out.println("���� ������ ���� ��");
	}
	public void powerOn() {
		dataReceive();
		onTV();
	}
}