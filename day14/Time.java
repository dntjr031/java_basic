package com.day14;

public class Time {
	// 1. 멤버변수
	private int hour;
	private int min;
	private int sec;
	
	// 2.  생성자 - 멤버변수 초기화
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
	
	//4. 메서드
	public int toSec() {
		return hour * 60 *60 + min * 60 + sec;
	}
	
}
