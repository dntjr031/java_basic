package com.day14;

public class Time {
	// 1. �������
	private int hour;
	private int min;
	private int sec;
	
	// 2.  ������ - ������� �ʱ�ȭ
	public Time(int hour, int min, int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	} 
	
	// 3. getter / setter
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public int getMin() {
		return min;
	}
	public void setMin(int min) {
		this.min = min;
	}
	
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		this.sec = sec;
	}
	
	//4. �޼���
	public int toSec() {
		return hour * 60 *60 + min * 60 + sec;
	}
	
}
